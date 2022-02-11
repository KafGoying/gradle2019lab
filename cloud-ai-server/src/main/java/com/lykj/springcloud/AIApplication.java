package com.lykj.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import com.lykj.springcloud.commons.TimeThread;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@Slf4j
@SpringBootApplication
public class AIApplication {
    public static void main(String[] args) {
        TimeThread.getInstance().start();
//        ConfigurableApplicationContext applicationContext =   SpringApplication.run(AIApplication.class, args);
        SpringApplication.run(AIApplication.class, args);

//        Environment env = applicationContext.getEnvironment();
//        String port = env.getProperty("server.port");
//        String path = env.getProperty("server.servlet.context-path");
//        System.out.println("\n--------------------------------------\n\t" +
//                "Application is running! Access URLs:\n\t" +
//                "Local: \t\thttp://localhost:" + port + path+ "/index.html\n\t" +
//                "swagger-ui: \thttp://localhost:" + port + path + "/swagger-ui.html\n\t" +
//                "----------------------------------------------------------");
    }
}