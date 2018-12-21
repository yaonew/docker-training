package com.example.demo;

import com.example.demo.entity.Demo;
import com.example.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    @Autowired
    private DemoRepository demoRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/{path}")
    public String index(@PathVariable(name="path", required = false) String path) {
        Demo demo = demoRepository.findByPath("".equals(path) ? "/" : path);
        if(demo == null) {
            demo = new Demo();
            demo.setPath(path);
            demo.setCount(1);
        } else {
            demo.setCount(demo.getCount() + 1);
        }
        demoRepository.save(demo);
        return "hello world!! path:" + path + " count:" + demo.getCount();
    }
}

