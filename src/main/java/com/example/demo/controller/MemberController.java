package com.example.demo.controller;


import com.example.demo.model.MemberModel;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/list")
    public String list(Model model){
        List<MemberModel> member = memberService.printMember();

        model.addAttribute("memberList", member);

        return "list";
    }
}
