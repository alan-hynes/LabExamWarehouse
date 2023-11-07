package ie.atu.labexamwarehouse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetails {
    private String productId;
    private String productName;
    private String quantity;
    private String warehouseId;
}
