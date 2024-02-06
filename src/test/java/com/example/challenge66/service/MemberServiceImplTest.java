package com.example.challenge66.service;

import com.example.challenge66.domain.Member;
import com.example.challenge66.dto.MemberDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Log4j2
class MemberServiceImplTest {

    @Autowired
    private MemberService memberService;

    @Test
    void join() { // 회원가입 테스트
        // Given
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setUsername("회원1");
        memberDTO.setEmail("aaa@aa.com");
        memberDTO.setPassword("1234");

        // When
        Member saveMember = memberService.join(memberDTO);
        log.info(saveMember);

        // Then
        assertEquals(memberDTO.getUsername(), saveMember.getUsername());
        assertEquals(memberDTO.getEmail(), saveMember.getEmail());
        assertEquals(memberDTO.getPassword(), saveMember.getPassword());
    }
}