package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class CountdownController {

    // 设定生日时间（假设目标时间是2025年1月1日 00:00:00）
    private static final LocalDateTime BIRTHDAY = LocalDateTime.of(2024, 12, 19, 12, 9, 0, 0);

    @GetMapping("/countdown")
    public String getCountdown() {
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(now, BIRTHDAY);

        long seconds = duration.getSeconds();
        long days = seconds / (24 * 3600);
        long hours = (seconds % (24 * 3600)) / 3600;
        long minutes = (seconds % 3600) / 60;
        long remainingSeconds = seconds % 60;

        return String.format("{\"days\":%d, \"hours\":%d, \"minutes\":%d, \"seconds\":%d}",
                days, hours, minutes, remainingSeconds);
    }
}
