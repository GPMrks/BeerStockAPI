package dio.innovationone.BeerStockAPI.dto;

import lombok.Builder;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuantityDTO)) return false;
        QuantityDTO that = (QuantityDTO) o;
        return getQuantity().equals(that.getQuantity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuantity());
    }
}
