package com.example.challenge66.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Challenge extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHALLENGE_ID")
    private Long id;

    private String title; // 챌린지 제목
    private String content; // 챌린지 내용
    private LocalDateTime startDate; // 시작 날짜
    private LocalDateTime endDate; // 종료 날짜

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member createdBy; // 챌린지 개설 회원

    @OneToMany(mappedBy = "challenge", cascade = CascadeType.ALL)
    private List<ChallengeParticipant> participants = new ArrayList<>(); // 챌린지 참여 회원 목록

    @Builder
    public Challenge(String title, String content, LocalDateTime startDate, LocalDateTime endDate) {
        this.title = title;
        this.content = content;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    /* 연관관계 메서드 */
    public void setCreatedBy(Member member) {
        this.createdBy = member;
    }

//
//    @ManyToOne
//    @JoinColumn(name = "CATEGORY_ID")
//    private ChallengeCategory category;
//
//    @ManyToMany
//    @JoinTable(
//            name = "CHALLENGE_TAG",
//            joinColumns = @JoinColumn(name = "CHALLENGE_ID"),
//            inverseJoinColumns = @JoinColumn(name = "TAG_ID"))
//    private List<ChallengeTag> tags;

    // 다른 필드 및 관계 추가 가능

    // Getters and Setters
}
