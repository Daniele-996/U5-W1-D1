package danieleSanzari.U5_W1_D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@Component
public abstract class ElementMenu {
    protected String name;
    protected int calories;
    protected double price;
}
