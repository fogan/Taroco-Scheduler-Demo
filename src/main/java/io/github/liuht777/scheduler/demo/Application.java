package io.github.liuht777.scheduler.demo;

import io.github.liuht777.scheduler.annotation.EnableTarocoSchedulerAdmin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类
 *
 * @author liuht
 */
@SpringBootApplication
@EnableScheduling
@EnableTarocoSchedulerAdmin
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
