package ie.atu.wk6;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Min(1)
    private int id;
    @NotBlank(message = "Name cannot be Blank")
    private String name;
    @Min(0)
    private int price;

}
