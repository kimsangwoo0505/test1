package com.sparta.test.service;


import com.sparta.test.dto.TestRequestDto;
import com.sparta.test.entity.Test;
import com.sparta.test.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository memoRepository;

    @Transactional
    public Test createMemo(TestRequestDto requestDto) {
        Test memo = new Test(requestDto);
        memoRepository.save(memo);

        return memo;
    }

    @Transactional(readOnly = true)
    public List<Test> getMemos() {
        return memoRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Test getMemo(Long id) {
        return memoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("회원 상세 조회 실패"));
    }



}
