package second_subtask;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Workstation extends Laptop{

    @Override
    public String size() {
        return "Large size";
    }
}
