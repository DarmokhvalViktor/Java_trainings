package Third_subtask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book extends Papyrus{
    private int pages;
    private String[] authors;

    public void getFatherFields() {
        System.out.println("Size: " + getSize());
        System.out.println("Weight: " + getWeight());
        System.out.println("Text: " + getText());
    }
}
