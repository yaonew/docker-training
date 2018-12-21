package com.example.demo.repository;

import com.example.demo.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface  DemoRepository extends JpaRepository<Demo, Long> {

    Demo findByPath(String path);
}
