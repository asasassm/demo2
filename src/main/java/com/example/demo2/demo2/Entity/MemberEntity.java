package com.example.demo2.demo2.Entity;

import com.example.demo2.demo2.Dto.MemberDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Setter
@Getter
@Table(name = "member_table")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;
    @Column(columnDefinition = "varchar(15)",unique = true)
    private String memberId;
    @Column(columnDefinition = "varchar(20)")
    private String memberEmail;
    @Column(columnDefinition = "varchar(20)")
    private String memberPw;
    @Column(columnDefinition = "varchar(30)")
    private String memberName;
    @Column(columnDefinition ="varchar(13)")
    private String memberPhone;
    @Column(columnDefinition = "varchar(20)")
    private String memberAdrss;
    @Column(columnDefinition = "varchar(15)")
    private String memberAdrss2;
//html에서 입력받은 정보 -> dto
    //그러고 entity에서 등록
    public static MemberEntity toMemberEntity(MemberDto memberDto){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemberId(memberDto.getMemberId());
        memberEntity.setMemberPw(memberDto.getMemberPw());
        memberEntity.setMemberEmail(memberDto.getMemberEmail());
        memberEntity.setMemberName(memberDto.getMemberName());
        memberEntity.setMemberPhone(memberDto.getMemberPhone());
        memberEntity.setMemberAdrss(memberDto.getMemberAdrss());
        memberEntity.setMemberAdrss2(memberDto.getMemberAdrss2());
        return memberEntity;
    }
}
