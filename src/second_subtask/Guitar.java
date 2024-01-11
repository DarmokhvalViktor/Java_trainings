package second_subtask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guitar implements Instrument{
    private int numberOfStrings;
    @Override
    public void play() {
        System.out.printf("Playing instrument %s with %d strings characteristic \n", "`guitar`", numberOfStrings);
    }
}
