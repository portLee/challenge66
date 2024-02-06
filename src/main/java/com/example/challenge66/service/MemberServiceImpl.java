package com.example.challenge66.service;

import com.example.challenge66.domain.Member;
import com.example.challenge66.dto.MemberDTO;
import com.example.challenge66.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberServiceImpl implements MemberService{
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member join(MemberDTO memberDTO) { // 회원가입

        Member member = memberDTO.toEntity();
        return memberRepository.save(member);
    }
}
