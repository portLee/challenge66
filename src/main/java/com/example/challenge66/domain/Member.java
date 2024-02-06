package com.example.challenge66.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@ToString
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;

    private String username; // 회원 이름
    private String email;    // 회원 이메일
    private String password; // 회원 비밀번호

    @OneToMany(mappedBy = "createdBy", cascade = CascadeType.ALL)
    private List<Challenge> createdChallenges; // 개설 챌린지 목록

    @Builder
    public Member(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
