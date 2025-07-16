package danieleSanzari.U5_W1_D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Setter
@AllArgsConstructor
@Component
public abstract class ElementMenu {
    protected String name;
    protected int calories;
    protected double price;
}
