package com.example.demo2.demo2.Dto;
import com.example.demo2.demo2.Entity.MemberEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDto {
    private Long num;
    private String memberId;
    private String memberEmail;
    private String memberPw;
    private String memberName;
    private String memberPhone;
    private String memberAdrss;
    private String memberAdrss2;

    public static MemberDto toMemberDTO(MemberEntity memberEntity){
        MemberDto memberDto = new MemberDto();
        memberDto.setNum(memberEntity.getNum());
        memberDto.setMemberId(memberEntity.getMemberId());
        memberDto.setMemberPw(memberEntity.getMemberPw());
        memberDto.setMemberName(memberEntity.getMemberName());
        memberDto.setMemberEmail(memberEntity.getMemberEmail());
        memberDto.setMemberPhone(memberEntity.getMemberPhone());
        memberDto.setMemberAdrss(memberEntity.getMemberAdrss());
        memberDto.setMemberAdrss2(memberEntity.getMemberAdrss2());
        return memberDto;
    }

}
