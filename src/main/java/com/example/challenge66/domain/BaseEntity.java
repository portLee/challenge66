package com.example.challenge66.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class}) // 엔티티가 데이터베이스에 추가되거나 변경될 때 자동으로 시간 값을 추가
public abstract class BaseEntity {

    @CreatedDate // 엔티티 저장시 현재시간 설정
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt; // 등록일

    @LastModifiedDate // 엔티티 수정시 현재시간 설정
    @Column(name = "updated_at")
    private LocalDateTime updatedAt; // 수정일
}
