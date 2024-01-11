package first_subtask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Printable{
    private String name;
    @Override
    public void print() {
        System.out.println("Printing a book " + this.name);
    }
}
