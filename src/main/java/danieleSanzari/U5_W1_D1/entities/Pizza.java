package danieleSanzari.U5_W1_D1.entities;

import lombok.Getter;

import java.util.List;

@Getter
public class Pizza extends ElementMenu {
    private List<Topping> toppings;
    private String ingredients;

    public Pizza(String name, int calories, double price, String ingredients) {
        super(name, calories, price);
        this.ingredients = ingredients;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
        super.setCalories(super.getCalories() + topping.getCalories());
        super.setPrice(super.getPrice() + topping.getPrice());
    }
}
