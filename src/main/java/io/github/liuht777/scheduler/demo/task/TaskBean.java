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
public class TaskBean {

    @Scheduled(fixedRate = 8000)
    public void scheduler1() {
        log.info("start scheduler1 ...");
    }

    @Scheduled(fixedDelay = 10000)
    public void scheduler2() {
        log.info("start scheduler2 ...");
    }
}
