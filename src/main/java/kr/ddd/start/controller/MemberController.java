package kr.ddd.start.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member/v1")
public class MemberController {
    @GetMapping
    public String test(){
        return "OK";
    }
}
