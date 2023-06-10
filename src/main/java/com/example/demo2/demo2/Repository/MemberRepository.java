package com.example.demo2.demo2.Repository;

import com.example.demo2.demo2.Entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.Optional;
//optional = 녈 방지
//DB랑 행동을 하는 곳

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    //select * from member_table where member_id=?
    Optional<MemberEntity> findByMemberId(String memberId);
    Optional<MemberEntity> findByNum(Long num);

}
