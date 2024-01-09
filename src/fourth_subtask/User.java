package fourth_subtask;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private Skill[] skills;
    private Car car;

    public User(int id, String name, String surname, String email, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = new Skill[]{new Skill("Java", 10), new Skill("js", 10), new Skill("c++", 10)};
        this.car = new Car("toyota", 2021, 250);
    }
}
