package com.example.mugu.repository;

import com.example.mugu.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository <MemberEntity, Long> {
}
