package com.leasing.administrator.leasingadministratorbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LeasingAdministratorBackendApplication {

    @GetMapping("/api/test")
    public String test() {
        return "<h1>TEst</h1>";
    }
    public static void main(String[] args) {
        SpringApplication.run(LeasingAdministratorBackendApplication.class, args);
    }

}
