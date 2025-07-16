package danieleSanzari.U5_W1_D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Component
public class Menu {
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--- MENU ---\n");

        sb.append("\nPIZZAS:\n");
        for (Pizza pizza : pizzas) {
            sb.append(String.format("• %s (%d kcal, €%.2f): %s\n",
                    pizza.getName(), pizza.getCalories(), pizza.getPrice(), pizza.getIngredients()));
        }

        sb.append("\nTOPPINGS:\n");
        for (Topping topping : toppings) {
            sb.append(String.format("• %s (%d kcal, €%.2f)\n",
                    topping.getName(), topping.getCalories(), topping.getPrice()));
        }

        sb.append("\nDRINKS:\n");
        for (Drink drink : drinks) {
            sb.append(String.format("• %s (%d kcal, €%.2f)\n",
                    drink.getName(), drink.getCalories(), drink.getPrice()));
        }

        return sb.toString();
    }
}
