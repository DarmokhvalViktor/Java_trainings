import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            Dog dog = new Dog();
            dog.setAge(i + 3);
            dog.setName("Dog " + i);
            dog.setBreed("Unknown breed №" + i);
            dogList.add(dog);
        }

        for(Dog dog: dogList) {
            System.out.println(dog);
        }

        List<Book> booksList = new ArrayList<>();
        String[] authors = new String[2];
        authors[0] = "Test Author №1";
        authors[1] = "Test Author №2";
        booksList.add(new Book("Title 1", 193, authors, "Action"));
        String[] authors2 = new String[3];
        authors2[0] = "Test Author №3";
        authors2[1] = "Test Author №4";
        authors2[2] = "Test Author №5";
        booksList.add(new Book("Title 2", 393, authors, "Horror"));
        booksList.add(new Book("Title 3", 113, authors2, "Detective"));
        booksList.add(new Book("Title 4", 353, authors, "Cartoon"));
        booksList.add(new Book("Title 5", 493, authors2, "Horror"));

        for(Book book: booksList) {
            System.out.println(book);
        }

        List<Car> carsList = new ArrayList<>();
        String[] models = {"Volvo", "BMW", "Ford", "Mazda", "Nissan"};
        for (int i = 0; i < 5; i++) {
            Car car = new Car();
            car.setPower(33 * (i + 1));
            car.setTurbo(10 * (i + 2));
            car.setVolumeEngine(1.5 * (i + 1));
            car.setModel(models[i]);
            carsList.add(car);
        }
        for(Car car: carsList) {
            System.out.println(car);
        }

        List<Post> posts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Post post = new Post(i + 1, i + 1, "Title " + (i + 1), "body " + (i +1));
            posts.add(post);
        }
        for(Post post: posts) {
            System.out.println(post);
        }

        List<Comment> comments = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Comment comment = new Comment(i + 1, i + 1, "email " + (i + 1), "body " + (i +1));
            comments.add(comment);
        }
        for(Comment comment: comments) {
            System.out.println(comment);
        }
    }
}