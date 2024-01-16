package third_subtask;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class UserWithDetails implements Comparable<UserWithDetails> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills;
    private Car car;

    @Override
    public int compareTo(UserWithDetails o) {
        int sizeComparison =  Integer.compare(this.getSkills().size(), o.getSkills().size());
        return (sizeComparison != 0) ? sizeComparison : Integer.compare(this.getId(), o.getId());
    }
}
