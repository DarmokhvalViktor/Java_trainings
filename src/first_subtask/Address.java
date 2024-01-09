package first_subtask;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Address {
    private String street;
    private String suit;
    private String city;
    private String zipcode;
    private Geo geo;
}
