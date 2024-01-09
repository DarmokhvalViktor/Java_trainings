import Third_subtask.Book;
import Third_subtask.Magazine;
import fifth_subtask.Comment;
import fifth_subtask.Post;
import first_subtask.Address;
import first_subtask.Company;
import first_subtask.Geo;
import first_subtask.User;
import fourth_subtask.Car;
import fourth_subtask.Gender;
import fourth_subtask.Skill;
import second_subtask.Workstation;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        1
        Geo geo = Geo.builder().lng(-11.55).lat(13.48).build();
        Address address = Address.builder().city("test_city").suit("test_suit").street("test_street").zipcode("00-00-0").geo(geo).build();
        Company company = Company.builder().name("test_name").catchPhrase("Catch_phrase").bs("test_bs").build();
        User user2 = User.builder().id(1).name("test").username("user").email("user@email.com")
                .phone("000-000-000").website("www.test.com").address(address).company(company).build();
        System.out.println(user2);

//        2
        Workstation workstation = new Workstation();
        System.out.println(workstation.size());

//        3
        Book book = new Book();
        book.getFatherFields();
        System.out.println(book);
        Magazine magazine = new Magazine(2.2);
        System.out.println(magazine);
        magazine.getFatherFields();

//        4
        fourth_subtask.User user = new fourth_subtask.User(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE);
        Car car = new Car("Ford", 2013, 216);
        Skill[] skills = new Skill[]{new Skill("Java", 10), new Skill("js", 10)};
        fourth_subtask.User user3 = fourth_subtask.User.builder().id(2).name("test_3_name").surname("test_3_surname").email("test3@gmail.com").age(29)
                        .gender(Gender.MALE).skills(skills).car(car).build();
        System.out.println(user);
        System.out.println(user3);

//        5
        List<Comment> commentList = Arrays.asList(
                new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"),
                new Comment(1, 2, "quo vero reiciendis velit similique earum", "Jayne_Kuhic@sydney.com", "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et"),
                new Comment(1, 3, "odio adipisci rerum aut animi", "Nikita@garfield.biz", "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione"),
                new Comment(2, 7, "repellat consequatur praesentium vel minus molestias voluptatum", "Dallas@ole.me", "maiores sed dolores similique labore et inventore et\nquasi temporibus esse sunt id et\neos voluptatem aliquam\naliquid ratione corporis molestiae mollitia quia et magnam dolor"),
                new Comment(2, 8, "et omnis dolorem", "Mallory_Kunze@marie.org", "ut voluptatem corrupti velit\nad voluptatem maiores\net nisi velit vero accusamus maiores\nvoluptates quia aliquid ullam eaque"),
                new Comment(3, 13, "aut inventore non pariatur sit vitae voluptatem sapiente", "Kariane@jadyn.tv", "fuga eos qui dolor rerum\ninventore corporis exercitationem\ncorporis cupiditate et deserunt recusandae est sed quis culpa\neum maiores corporis et"),
                new Comment(3, 14, "et officiis id praesentium hic aut ipsa dolorem repudiandae", "Nathan@solon.io", "vel quae voluptas qui exercitationem\nvoluptatibus unde sed\nminima et qui ipsam aspernatur\nexpedita magnam laudantium et et quaerat ut qui dolorum"),
                new Comment(3, 15, "debitis magnam hic odit aut ullam nostrum tenetur", "Maynard.Hodkiewicz@roberta.com", "nihil ut voluptates blanditiis autem odio dicta rerum\nquisquam saepe et est\nsunt quasi nemo laudantium deserunt\nmolestias tempora quo quia")
        );
        List<Post> postList = Arrays.asList(
                new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"),
                new Post(1, 2, "qui est esse", "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"),
                new Post(1, 3, "ea molestias quasi exercitationem repellat qui ipsa sit aut", "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut")
        );
        for (Post post : postList) {
            for (Comment comment: commentList) {
                if(post.getId() == comment.getPostId()) {
                    post.addComment(comment);
//                    commentList.remove(comment);
                }
            }
        }
        System.out.println(commentList);
        System.out.println(postList);

    }
}