package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestParamController {
    /** 입력 화면을 표시 */
    @GetMapping("show")
    public String showView() {
        // 반환값으로 뷰 이름을 돌려줌
        return "entry";
    }
}
