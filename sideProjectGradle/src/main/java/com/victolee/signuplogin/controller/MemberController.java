package com.victolee.signuplogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.victolee.signuplogin.dto.MemberDto;
import com.victolee.signuplogin.service.MemberService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;

    // ���� ������
    @GetMapping("/")
    public String index() {
        return "/index";
    }

    // ȸ������ ������
    @GetMapping("/user/signup")
    public String dispSignup() {
        return "/signup";
    }

    // ȸ������ ó��
    @PostMapping("/user/signup")
    public String execSignup(MemberDto memberDto) {
        memberService.joinUser(memberDto);

        return "redirect:/user/login";
    }

    // �α��� ������
    @GetMapping("/user/login")
    public String dispLogin() {
        return "/login";
    }

    // �α��� ��� ������
    @GetMapping("/user/login/result")
    public String dispLoginResult() {
        return "/loginSuccess";
    }

    // �α׾ƿ� ��� ������
    @GetMapping("/user/logout/result")
    public String dispLogout() {
        return "/logout";
    }

    // ���� �ź� ������
    @GetMapping("/user/denied")
    public String dispDenied() {
        return "/denied";
    }

    // �� ���� ������
    @GetMapping("/user/info")
    public String dispMyInfo() {
        return "/myinfo";
    }

    // ���� ������
    @GetMapping("/admin")
    public String dispAdmin() {
        return "/admin";
    }
}