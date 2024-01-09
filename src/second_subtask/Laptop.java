package second_subtask;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Laptop extends PC{

    @Override
    public String size() {
        return "Medium size";
    }
}
