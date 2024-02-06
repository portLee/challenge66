package com.example.challenge66.dto;

import com.example.challenge66.domain.Challenge;
import com.example.challenge66.domain.Member;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDTO {

    private Long memberId;
    private String username; // 회원 이름
    private String email;    // 회원 이메일
    private String password; // 회원 비밀번호

    /* DTO -> Entity */
    public Member toEntity() {
        return Member.builder()
                .username(username)
                .email(email)
                .password(password)
                .build();
    }
}
