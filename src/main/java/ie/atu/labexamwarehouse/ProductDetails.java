package ie.atu.labexamwarehouse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetails {
    private int productId;
    private String productName;
    private int quantity;
    private int warehouseId;
    private int capacity;
}
