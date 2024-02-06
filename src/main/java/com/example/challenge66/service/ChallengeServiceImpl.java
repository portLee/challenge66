package com.example.challenge66.service;

import com.example.challenge66.domain.Challenge;
import com.example.challenge66.domain.Member;
import com.example.challenge66.dto.ChallengeDTO;
import com.example.challenge66.repository.ChallengeRepository;
import com.example.challenge66.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class ChallengeServiceImpl implements ChallengeService{

    @Autowired
    private ChallengeRepository challengeRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Challenge registerChallenge(ChallengeDTO challengeDTO, Long memberId) { // 챌린지 등록

        // memberId로 조회 후 일치하는 회원이 없을 경우 예외처리
        Optional<Member> optional = memberRepository.findById(memberId);
        Member member = optional.orElseThrow(IllegalArgumentException::new);

        Challenge challenge = challengeDTO.toEntity();
        challenge.setCreatedBy(member);

        return challengeRepository.save(challenge);
    }

    @Override
    public Challenge updateChallenge(ChallengeDTO challengeDTO) { // 챌린지 수정

        Challenge challenge = challengeDTO.toEntity();

        return challengeRepository.save(challenge);
    }

    @Override
    public void deleteChallenge(Long challengeId) { // 챌린지 삭제
        challengeRepository.deleteById(challengeId);
    }
}
