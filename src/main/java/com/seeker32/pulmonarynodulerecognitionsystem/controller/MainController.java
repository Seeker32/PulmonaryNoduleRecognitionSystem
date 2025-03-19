package com.seeker32.pulmonarynodulerecognitionsystem.controller;

import com.seeker32.pulmonarynodulerecognitionsystem.common.BaseResponse;
import com.seeker32.pulmonarynodulerecognitionsystem.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Seeker32
 * @CreateTime: 2025-03-19
 */
@RestController
public class MainController {

    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("OK");
    }
}
