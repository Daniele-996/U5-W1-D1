package danieleSanzari.U5_W1_D1;

import danieleSanzari.U5_W1_D1.entities.*;
import danieleSanzari.U5_W1_D1.enums.StatusOrdine;
import danieleSanzari.U5_W1_D1.enums.StatusTavolo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class ConfigClass {
    public List<Topping> toppings = new ArrayList<>();

    @Bean
    public Pizza getPizzaMargherita() {
        return new Pizza("Margherita", 550, 3.99, "(Tomato and Mozzarella)");
    }

    @Bean
    public Pizza getPizzaDiavola() {
        return new Pizza("Diavola", 650, 4.99, "(Tomato, Mozzarella and Spicy Salami)");
    }


    @Bean
    public Pizza getPizzaQuattroFormaggi() {
        return new Pizza("Quattro Formaggi", 600, 4.99, "(Mozzarella and Four Cheeses)");
    }

    @Bean
    public Pizza getPizzaPorcini() {
        return new Pizza("Porcini", 650, 5.99, "(Mozzarella and Porcini)");
    }

    @Bean
    public Topping getToppingCheese() {
        return new Topping("Cheese", 250, 1.25);
    }


    @Bean
    public Topping getToppingSalami() {
        return new Topping("Salami", 250, 1.25);
    }

    @Bean
    public Topping getToppingPorcini() {
        return new Topping("Porcini", 250, 1.25);
    }

    @Bean
    public Topping getToppingBufala() {
        return new Topping("Bufala", 250, 1.25);
    }

    @Bean
    public Drink getDrinkCocaCola() {
        return new Drink("Coca-cola", 450, 3.99);
    }


    @Bean
    public Drink getDrinkFanta() {
        return new Drink("Fanta", 450, 3.99);
    }

    @Bean
    public Drink getDrinkThePesca() {
        return new Drink("Thè alla pesca", 450, 3.99);
    }

    @Bean
    public Drink getDrinkSprite() {
        return new Drink("Sprite", 450, 3.99);
    }

    @Bean
    @Primary
    public Menu getMenu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        return new Menu(pizzas, toppings, drinks);
    }

    @Bean
    public Tavolo getTavolo(@Value("${costo.coperto}") double costoCoperto) {
        List<ElementMenu> elementMenu = new ArrayList<>();
        elementMenu.add(getDrinkSprite());
        elementMenu.add(getPizzaMargherita());
        elementMenu.add(getToppingBufala());
        Ordine ordine = new Ordine(4, StatusOrdine.PRONTO, 6, 15.30, elementMenu);
        return new Tavolo(2, ordine.getNumeroCoperti(), StatusTavolo.OCCUPATO, ordine);
    }


}
