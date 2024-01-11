package second_subtask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tube implements Instrument{
    private double diameter;
    @Override
    public void play() {
        System.out.printf("Playing instrument %s with %.2f diameter characteristic \n", "`tube`", diameter);
    }
}
