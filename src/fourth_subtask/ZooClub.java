package fourth_subtask;

import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ZooClub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    public void addMember(Person person) {
        club.putIfAbsent(person, new ArrayList<>());
    }

    public void addPetToPerson(Person person, Pet pet) {
        club.computeIfPresent(person, (key, value) -> {
            value.add(pet);
            return value;
        });
    }

    public void removePetFromPerson(Person person, Pet pet) {
        club.computeIfPresent(person, (key, value) -> {
            value.remove(pet);
            return value;
        });
    }

    public void removePerson(Person person) {
        club.remove(person);
    }

    public void removePetFromAllPeople(Pet pet) {
        club.forEach((person, pets) -> pets.removeIf(p -> p.equals(pet)));
    }

    public void displayClub() {
        club.forEach((person, pets) -> System.out.println(person.getName() + " - " + pets));
    }
}
