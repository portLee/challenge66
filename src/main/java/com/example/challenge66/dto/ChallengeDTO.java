package com.example.challenge66.dto;

import com.example.challenge66.domain.Challenge;
import com.example.challenge66.domain.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ChallengeDTO {
    private Long challengeId;
    private String title; // 챌린지 제목
    private String content; // 챌린지 내용
    private LocalDateTime startDate; // 시작 날짜
    private LocalDateTime endDate; // 종료 날짜

    /* DTO -> Entity */
    public Challenge toEntity() {
        return Challenge.builder()
                .title(title)
                .content(content)
                .startDate(startDate)
                .endDate(endDate)
                .build();
    }
}
