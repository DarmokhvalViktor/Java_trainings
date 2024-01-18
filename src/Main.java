import third_task.Car;
import third_task.CarOwner;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        1
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        List<String> stringList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            stringList.add(getRandomLetter(alphabet).repeat(i));
        }
        System.out.println(stringList);

        System.out.println("__________delimiter___________");
        stringList.sort(String::compareTo);
        System.out.println(stringList);
        List<String> filteredList = stringList.stream().filter(a -> a.length() < 4).toList();
        System.out.println("__________delimiter___________");
        System.out.println(filteredList);
        System.out.println("__________delimiter___________");

//        2
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 20 ; i++) {
            integerList.add(getRandomInteger() * i);
        }
        System.out.println(integerList);
        System.out.println("__________delimiter___________");
        integerList.stream().sorted().forEach(System.out::println);
        System.out.println("__________delimiter___________");
        integerList.stream().filter(n -> n % 3 == 0).forEach(System.out::println);
        System.out.println("__________delimiter___________");
        integerList.stream().filter(n -> n % 10 == 0).forEach(System.out::println);
        System.out.println("__________delimiter___________");
        integerList.forEach(System.out::println);
        System.out.println("__________delimiter___________");
        integerList.stream().map(n -> n * 3).forEach(System.out::println);
        System.out.println("__________delimiter___________");

//        3
        List<Car> carList = createListWithRandomAmountOfCars();
        carList.forEach(System.out::println);
        System.out.println("__________delimiter___________");
        carList.stream().limit(carList.size()/2).forEach(Main::engineRepair);
        carList.forEach(System.out::println);
        System.out.println("__________delimiter___________");
        carList.forEach(car -> {
            if (car.getCarOwner().getDriving_experience() < 5 && car.getCarOwner().getAge() > 25) {
                trainingCourse(car.getCarOwner());
            }
        });
        carList.forEach(System.out::println);
        System.out.println("__________delimiter___________");
        int sumToByAllCars = getSumFromCarsList(carList);
        System.out.printf("To buy all cars from this list we need %d UC", sumToByAllCars);
    }

    private static String getRandomLetter(String[] strings) {
        Random random = new Random();
        return strings[random.nextInt(strings.length)];
    }
    private static Integer getRandomInteger() {
        Random random = new Random();
        return random.nextInt((999) + 1);
    }
    private static List<Car> createListWithRandomAmountOfCars() {
        List<Car> carList = new ArrayList<>();
        String[] carBrands = {"Ford", "Audi", "BMW", "Mazda", "Mitsubishi", "Fiat", "Opel", "Volvo"};
        String[] names = {"Steve", "Brad", "uvuvwevwevwe onyetenyevwe ugwemuhwem osas", "Michael", "Ronaldo", "Donald", "Leonard"};
        Random random = new Random();
        for (int i = 1; i < random.nextInt(8, 20); i++) {
            Car car = new Car();
            car.setBrand(carBrands[random.nextInt(carBrands.length)]);
            car.setEngine_power(random.nextInt(100, 350));
            car.setPrice(random.nextInt(5000, 25000));
            car.setProduction_year(random.nextInt(1990, 2023));

            CarOwner carOwner = new CarOwner();
            carOwner.setName(names[random.nextInt(names.length)]);
            carOwner.setAge(random.nextInt(18, 50));
            carOwner.setDriving_experience(random.nextInt(1, 30));

            car.setCarOwner(carOwner);
            carList.add(car);
        }
        return carList;
    }
    private static void engineRepair(Car car) {
        car.setEngine_power((int) (car.getEngine_power() * 1.1));
    }
    private static void trainingCourse(CarOwner carOwner) {
        carOwner.setDriving_experience(carOwner.getDriving_experience() + 1);
    }
    private static int getSumFromCarsList(List<Car> carList) {
        return carList
                .stream()
                .mapToInt(Car::getPrice)
                .reduce(0, Integer::sum);
    }
}