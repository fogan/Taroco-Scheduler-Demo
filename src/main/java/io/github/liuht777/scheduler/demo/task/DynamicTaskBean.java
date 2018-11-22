package io.github.liuht777.scheduler.demo.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 描述
 *
 * @author liuht
 * 2018/11/21 17:41
 */
@Component
@Slf4j
public class DynamicTaskBean {

    public void dynamicTask1() {
        log.info("dynamic task1 ...");
    }

    public void dynamicTask2() {
        log.info("dynamic task2 ...");
    }
}
