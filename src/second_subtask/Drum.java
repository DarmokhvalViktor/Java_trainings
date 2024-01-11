package second_subtask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drum implements Instrument{
    private String size;
    @Override
    public void play() {
        System.out.printf("Playing instrument %s with %s size characteristic \n", "`drum`", size);
    }
}
