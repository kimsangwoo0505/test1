package com.sparta.test.Controller;


import com.sparta.test.dto.TestRequestDto;
import com.sparta.test.entity.Test;
import com.sparta.test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private  final TestService memoService;

    @GetMapping("/")//메인 페이지 반환
    public ModelAndView home() {
        return new ModelAndView("index");
    }


    @PostMapping("/api/memos")//회원 정보 저장하기
    public Test createMemo(@RequestBody TestRequestDto requestDto){


        return memoService.createMemo(requestDto);
    }

    @GetMapping("/api/memos")//회원 정보 전체 조회하기
    public List<Test> getMemos(){
        return memoService.getMemos();
    }


    @GetMapping("/api/memos/{id}")//특정 회원정보 조회하기
    public Test getMemo(@PathVariable Long id) {
        return memoService.getMemo(id);
    }




}
