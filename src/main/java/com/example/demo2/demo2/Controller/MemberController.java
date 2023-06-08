package com.example.demo2.demo2.Controller;

import com.example.demo2.demo2.Dto.MemberDto;
import com.example.demo2.demo2.Service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor //생성자 주입
public class MemberController {
    private final MemberService memberService; //컴트롤러가 서비스클래스 자원 등을 사용할수있게 해줌
    @PostMapping("Member/save")
    public String savemember(@ModelAttribute MemberDto memberDto){
        System.out.println("MemberController.savemember");
        System.out.println("memberDto = " + memberDto);
        memberService.save(memberDto);

        return "index";
    }
    @PostMapping("/Member/login")
    public String login(@ModelAttribute MemberDto memberDto, HttpSession session){
        MemberDto loginresult = memberService.login(memberDto);
        if(loginresult!=null){
            session.setAttribute("loginId",loginresult.getMemberId());
            return "main";
        }else{
            return "index";
        }
    }
}
