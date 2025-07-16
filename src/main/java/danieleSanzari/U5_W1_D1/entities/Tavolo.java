package danieleSanzari.U5_W1_D1.entities;

import danieleSanzari.U5_W1_D1.enums.StatusTavolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Tavolo {
    @Autowired
    private int numero;
    private int numeroCoperti;
    private StatusTavolo statusTavolo;
    private List<Ordine> ordini;
}
