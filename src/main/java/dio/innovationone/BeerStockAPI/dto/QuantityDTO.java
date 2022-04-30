package dio.innovationone.BeerStockAPI.dto;

import lombok.Builder;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Builder
public class QuantityDTO {

    @NotNull
    @Max(100)
    private Integer quantity;

    public QuantityDTO() {
    }

    public QuantityDTO(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
