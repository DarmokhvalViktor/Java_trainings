import first_subtask.User;
import fourth_subtask.Person;
import fourth_subtask.Pet;
import fourth_subtask.ZooClub;
import third_subtask.Car;
import third_subtask.Gender;
import third_subtask.Skill;
import third_subtask.UserWithDetails;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        1
        List<User> userList = getUserList();
        List<User> sortedByAgeAscendingOrder = userList.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();
        System.out.println(sortedByAgeAscendingOrder);

        List<User> sortedByAgeDescendingOrder = userList.stream()
                .sorted((x, y) -> y.getAge() - x.getAge())
                .toList();
        System.out.println(sortedByAgeDescendingOrder);

        List<User> sortedByNameLengthAscendingOrder = userList.stream()
                .sorted(Comparator.comparingInt(x -> x.getName().length()))
                .toList();
        System.out.println(sortedByNameLengthAscendingOrder);

        List<User> sortedByNameLengthDescendingOrder = userList.stream()
                .sorted((x, y) -> y.getName().length() - x.getName().length())
                .toList();
        System.out.println(sortedByNameLengthDescendingOrder);
        System.out.println("___________________________");

//        2
        List<String> stringList = Arrays.asList(
                "Apple", "Banana", "Cherry", "Date", "Grape",
                "Orange", "Kiwi", "Lemon", "Mango", "Peach",
                "Pear", "Plum", "Strawberry", "Watermelon", "Blueberry",
                "Raspberry", "Pineapple", "Coconut", "Blackberry", "Apricot"
        );
        Collections.sort(stringList);
        System.out.println(stringList);
        List<String> stringList2 = Arrays.asList(
                "Apple", "Banana", "Cherry", "Date", "Grape",
                "Orange", "Kiwi", "Lemon", "Mango", "Peach",
                "Pear", "Plum", "Strawberry", "Watermelon", "Blueberry",
                "Raspberry", "Pineapple", "Coconut", "Blackberry", "Apricot"
        );
        List<String> sortedList = stringList2.stream()
                .sorted(String::compareTo)
                .toList();
        System.out.println(sortedList);
        System.out.println("___________________________");

//        3
        List<UserWithDetails> userWithDetailsList = getUserWithDetailsList();
        Set<UserWithDetails> hashSetUsers = new HashSet<>(userWithDetailsList);
        System.out.println("userWithDetailsList" + userWithDetailsList);
        System.out.println("hashSetUsers" + hashSetUsers);
        System.out.println("___________________________");
        hashSetUsers.stream()
                .filter(user -> user.getGender().equals(Gender.FEMALE))
                .forEach(System.out::println);
        System.out.println("___________________________");



        List<UserWithDetails> userWithDetailsList2 = getUserWithDetailsList();
        System.out.println("___________________________");
        Set<UserWithDetails> treeSetUsers = new TreeSet<>(userWithDetailsList2);
        System.out.println("treeSetUsers" + treeSetUsers);
        treeSetUsers
                .forEach(System.out::println);

//        4
        ZooClub zooClub = new ZooClub();

        Person person1 = new Person("John");
        Person person2 = new Person("Alice");
        Person person3 = new Person("Jake");

        zooClub.addMember(person1);
        zooClub.addMember(person2);
        zooClub.addMember(person3);

        Pet pet1 = new Pet("Dog");
        Pet pet2 = new Pet("Cat");

        zooClub.addPetToPerson(person1, pet1);
        zooClub.addPetToPerson(person2, pet2);
        zooClub.addPetToPerson(person3, pet2);
        zooClub.addPetToPerson(person3, pet1);

        zooClub.displayClub();

        zooClub.removePetFromPerson(person1, pet1);
        zooClub.removePerson(person2);

        zooClub.displayClub();

        Pet pet3 = new Pet("Parrot");
        zooClub.addPetToPerson(person1, pet3);
        zooClub.addPetToPerson(person3, pet3);

        zooClub.displayClub();
        zooClub.removePetFromAllPeople(pet3);

        zooClub.displayClub();

    }

    private static List<User> getUserList() {
        User user1 = new User("a", 20);
        User user2 = new User("fads", 21);
        User user3 = new User("vczxv", 22);
        User user4 = new User("nhfgmj", 22);
        User user5 = new User("yurure", 24);
        User user6 = new User("fda11321", 21);
        User user7 = new User("12343gdsa", 25);
        User user8 = new User("vcxz", 44);
        User user9 = new User("bgdnhgf", 209);
        User user10 = new User("12re4fads", 1);
        return List.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10);
    }

    private static List<UserWithDetails> getUserWithDetailsList() {
        List<UserWithDetails> userWithDetailsList = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            UserWithDetails user = new UserWithDetails();
            user.setId(i);
            user.setName("User" + i);
            user.setSurname("Surname" + i);
            user.setEmail("user" + i + "@example.com");
            user.setAge(25 + i);
            user.setGender(random.nextBoolean() ? Gender.MALE : Gender.FEMALE);

            int numberOfSkills = random.nextInt(5) + 1;
            List<Skill> skillList = new ArrayList<>();
            for (int j = 1; j <= numberOfSkills; j++) {
                Skill skill = new Skill();
                skill.setTitle("Skill" + j);
                skill.setExp(i * 2);
                skillList.add(skill);
            }
            user.setSkills(skillList);

            Car car = new Car();
            car.setModel("Model" + i);
            car.setYear(2000 + i);
            car.setPower(150 + i);
            user.setCar(car);
            userWithDetailsList.add(user);
        }
        return userWithDetailsList;
    }
}