package ie.atu.labexamwarehouse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

public class WarehouseController {
    @PostMapping("/notify")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Map<String, String> handleWarehouseRequest(@RequestBody ProductDetails productDetails) {
        Map<String, String> warehouseMessage = new HashMap<>();
        warehouseMessage.put("warehouseId" + productDetails.getWarehouseId(),
                "location" + "Location X" + "capacity" + productDetails.getCapacity());
        return warehouseMessage;
    }
}
