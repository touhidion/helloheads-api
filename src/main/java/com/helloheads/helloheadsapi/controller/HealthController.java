package com.helloheads.helloheadsapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/sdf")
public class HealthController {

    @GetMapping
    public Map<String, Object> sdf() {
        Map<String, Object> healthInfo = new HashMap<>();
        healthInfo.put("status", "UP");
        healthInfo.put("timestamp", LocalDateTime.now().toString());
        healthInfo.put("application", "helloheads-api");
        healthInfo.put("version", "1.0.0");

        // JVM info
        Map<String, Object> jvmInfo = new HashMap<>();
        jvmInfo.put("javaVersion", System.getProperty("java.version"));
        jvmInfo.put("javaVendor", System.getProperty("java.vendor"));
        jvmInfo.put("freeMemory", Runtime.getRuntime().freeMemory() / (1024 * 1024) + " MB");
        jvmInfo.put("totalMemory", Runtime.getRuntime().totalMemory() / (1024 * 1024) + " MB");
        jvmInfo.put("maxMemory", Runtime.getRuntime().maxMemory() / (1024 * 1024) + " MB");

        healthInfo.put("jvm", jvmInfo);

        return healthInfo;
    }
}


