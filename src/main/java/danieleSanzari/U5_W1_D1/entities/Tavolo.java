package danieleSanzari.U5_W1_D1.entities;

import danieleSanzari.U5_W1_D1.enums.StatusTavolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Tavolo {
    private int numero;
    private int numeroCoperti;
    private StatusTavolo statusTavolo;
    private Ordine ordine;

}
