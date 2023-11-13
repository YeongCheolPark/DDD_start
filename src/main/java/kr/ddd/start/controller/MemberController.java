package kr.ddd.start.controller;

import kr.ddd.start.domain.type.OrderState;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member/v1")
public class MemberController {
    @GetMapping
    public String test(){
        OrderState.PAYMENT_WAITING.isShippingChangeable();
        return "OK";
    }
}
