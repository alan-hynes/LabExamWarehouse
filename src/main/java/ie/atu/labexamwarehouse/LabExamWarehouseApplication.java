package ie.atu.labexamwarehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabExamWarehouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabExamWarehouseApplication.class, args);
    }

}
