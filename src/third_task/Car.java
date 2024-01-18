package third_task;

import lombok.Data;

@Data
public class Car {
    private String brand;
    private int engine_power;
    private CarOwner carOwner;
    private int price;
    private int production_year;
}
