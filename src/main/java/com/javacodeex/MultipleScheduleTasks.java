package com.javacodeex;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.InterruptedIOException;
@Component
@Slf4j
public class MultipleScheduleTasks {


    @Scheduled(fixedDelay = 5000)
    public void task1(){
        executeTask("Task1");
    }

    @Scheduled(fixedDelay = 5000)
    public void task2(){
        executeTask("Task2");
    }
    @Scheduled(fixedDelay = 5000)
    public void task3(){
        executeTask("Task3");
    }
    @Scheduled(fixedDelay = 5000)
    public void task4(){
        executeTask("Task4");
    }
    @Scheduled(fixedDelay = 5000)
    public void task5(){
        executeTask("Task5");
    }

    @Scheduled(fixedDelay = 5000)
    public void task6(){
        executeTask("Task6");
    }

    @Scheduled(fixedDelay = 5000)
    public void task7(){
        executeTask("Task2");
    }
    @Scheduled(fixedDelay = 5000)
    public void task9(){
        executeTask("Task9");
    }
    @Scheduled(fixedDelay = 5000)
    public void task8(){
        executeTask("Task8");
    }
    @Scheduled(fixedDelay = 5000)
    public void task10(){
        executeTask("Task10");
    }


    private void executeTask(String taskName)  {
        try {
            log.info("{} started", taskName);
            Thread.sleep(10000);
            log.info("{} finished", taskName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
