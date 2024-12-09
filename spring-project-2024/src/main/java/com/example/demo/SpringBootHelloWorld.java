package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class SpringBootHelloWorld {

    // 抽卡功能
    @RequestMapping("/gacha")
    public String gacha() {
        // 模擬抽卡邏輯
        int randomValue = new Random().nextInt(100); // 生成0到99的随机数

        if (randomValue < 5) { // SSR卡片：5%
            return "恭喜你抽到了一張：SSR卡片！";
        } else if (randomValue < 20) { // SR卡片：15% (5 + 15 = 20)
            return "恭喜你抽到了一張：SR卡片！";
        } else if (randomValue < 50) { // R卡片：30% (20 + 30 = 50)
            return "恭喜你抽到了一張：R卡片！";
        } else { // N卡片：50%
            return "恭喜你抽到了一張：N卡片！";
        }
    }
}
