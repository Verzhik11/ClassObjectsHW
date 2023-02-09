package Lesson1;

public class Main {
    public static void main(String[] args) {
        Author authorHarry = new Author("Joanne", "Rowling");
        Author authorLOR = new Author("John", "Tolkien");
        Book harryPotter = new Book("Harry Potter 1",  authorHarry, 1997);
        Book lordOfRings = new Book("Lord of Rings 1", authorLOR, 1954);
        harryPotter.bookProperty();
        lordOfRings.bookProperty();
        harryPotter.setYear(2000);
        lordOfRings.setYear(1960);
        System.out.println("Новый год издания " + harryPotter.getName() + " - " + harryPotter.getYear() +" и " + lordOfRings.getName() +
                " - " + lordOfRings.getYear());
        System.out.println(authorHarry);
        System.out.println(authorLOR);
        System.out.println(harryPotter);
        System.out.println(lordOfRings);
        System.out.println(lordOfRings.equals(harryPotter));
        System.out.println(authorHarry.equals(authorLOR));
        System.out.println(authorHarry.hashCode() + " и " + authorLOR.hashCode());
        System.out.println(harryPotter.hashCode() + " и " + lordOfRings.hashCode());
    }

}
