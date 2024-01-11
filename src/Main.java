import first_subtask.Book;
import first_subtask.Magazine;
import first_subtask.Printable;
import second_subtask.Drum;
import second_subtask.Guitar;
import second_subtask.Instrument;
import second_subtask.Tube;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        1
        List<Printable> printableList = new ArrayList<>();
        Printable magazine1 = new Magazine("Time");
        Printable magazine2 = new Magazine("People");
        Printable book1 = new Book("Fourth Wig");
        Printable book2 = new Book("Iron Fame");
        printableList.add(magazine1);
        printableList.add(magazine2);
        printableList.add(book1);
        printableList.add(book2);
        for (Printable printable : printableList) {
            printable.print();
        }

//        2
        List<Instrument> instruments = new ArrayList<>();
        Instrument tube1 = new Tube(1.5);
        Instrument tube2 = new Tube(3.5);
        Instrument drum1 = new Drum("medium");
        Instrument drum2 = new Drum("large");
        Instrument guitar1 = new Guitar(5);
        Instrument guitar2 = new Guitar(6);
        instruments.add(tube1);
        instruments.add(tube2);
        instruments.add(drum1);
        instruments.add(drum2);
        instruments.add(guitar1);
        instruments.add(guitar2);
        instruments.forEach(Instrument::play);
    }
}