package io.github.liuht777.scheduler.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类
 *
 * @author liuht
 */
@SpringBootApplication
@EnableScheduling
@ServletComponentScan("io.github.liuht777.scheduler.web")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
