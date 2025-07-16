package danieleSanzari.U5_W1_D1.entities;

import danieleSanzari.U5_W1_D1.enums.StatusOrdine;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class Ordine {
    private int numeroOrdine;
    private Tavolo tavolo;
    private StatusOrdine statusOrdine;
    private int numeroCoperti;
    private double orarioOrdine;
    private List<ElementMenu> elementiMenu;

    public double getConto(List<ElementMenu> elementiMenu) {
        return elementiMenu.stream()
                .mapToDouble(ElementMenu::getPrice)
                .sum();
    }
}
