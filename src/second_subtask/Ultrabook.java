package second_subtask;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ultrabook extends Laptop{

    @Override
    public String size() {
        return "Small size";
    }
}
