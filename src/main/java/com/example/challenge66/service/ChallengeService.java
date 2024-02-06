package com.example.challenge66.service;

import com.example.challenge66.domain.Challenge;
import com.example.challenge66.dto.ChallengeDTO;

public interface ChallengeService {

    // 챌린지 등록
    Challenge registerChallenge(ChallengeDTO challengeDTO, Long memberId);

    // 챌린지 수정
    Challenge updateChallenge(ChallengeDTO challengeDTO);

    // 챌린지 삭제
    void deleteChallenge(Long challengeId);
}
