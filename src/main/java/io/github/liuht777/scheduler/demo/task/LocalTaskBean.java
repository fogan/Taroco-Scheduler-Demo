package io.github.liuht777.scheduler.demo.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 描述
 *
 * @author liuht
 * 2018/11/21 16:30
 */
@Slf4j
@Component
public class LocalTaskBean {

    @Scheduled(fixedRate = 8000)
    public void fixedRate() {
        log.info("start local fixedRate ...");
    }

    @Scheduled(fixedDelay = 10000)
    public void fixedDelay() {
        log.info("start local fixedDelay ...");
    }

    @Scheduled(cron = "0/15 * * * * ? ")
    public void cron() {
        log.info("start local cron ...");
    }
}
