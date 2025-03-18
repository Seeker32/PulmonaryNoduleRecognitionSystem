package com.seeker32.pulmonarynodulerecognitionsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.seeker32.pulmonarynodulerecognitionsystem.mapper")
public class PulmonaryNoduleRecognitionSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(PulmonaryNoduleRecognitionSystemApplication.class, args);
    }

}
