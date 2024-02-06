package com.example.challenge66.service;

import com.example.challenge66.domain.Member;
import com.example.challenge66.dto.MemberDTO;

public interface MemberService {

    Member join(MemberDTO memberDTO); // 회원 가입
}
