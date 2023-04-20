package com.sparta.test.repository;


import com.sparta.test.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Long> {
    List<Test> findAllByOrderByNameDesc();
}