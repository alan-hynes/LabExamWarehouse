package ie.atu.labexamwarehouse;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(name = "warehouse-service-1", url = "http:localhost:8083")
public interface WarehouseService {
    @PostMapping("/notify")
    Map<String, String>notifyProduct(@RequestBody ProductDetails productDetails);
}
