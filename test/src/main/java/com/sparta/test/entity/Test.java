package com.sparta.test.entity;

import com.sparta.test.dto.TestRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Test{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//숫자를 자동으로 더해줌
    private Long id;


    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String pw;

    public Test(TestRequestDto requestDto) {

        this.name = requestDto.getName();
        this.email = requestDto.getEmail();
        this.pw = requestDto.getPw();

    }

    public void update(TestRequestDto requestDto) {

        this.name = requestDto.getName();
        this.email = requestDto.getEmail();
        this.pw = requestDto.getPw();
    }



}
