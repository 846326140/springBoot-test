package com.example.javaguava.controller;

import com.example.javaguava.config.RateLimiter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dyz
 * @version 1.0
 * @date 2020/5/11 17:06
 */
@Slf4j
@RestController
public class TestController {


        /**
         * 开启限流
         * @return
         */
        @RateLimiter(value = 1.0, timeout = 100)
        @GetMapping("/rateLimiter")
        public String rateLimiter() {
                log.info("【rateLimiter】被执行了。。。。。");
                return "你不能总是看到我，快速刷新我看一下！";
        }


        /**
         * 未开启限流
         * @return
         */
        @RateLimiter(value = 1.0, timeout = 100)
        @GetMapping("/noRateLimiter")
        public String noRateLimiter() {
                log.info("【noRateLimiter】被执行了。。。。。");
                return "我没有被限流哦，一直刷新一直在.....";
        }



        @GetMapping("/index")
        public String index() {
                return "555555555!";
        }

        @GetMapping("/jj")
        public String indexf() {
                return "44444";
        }

}