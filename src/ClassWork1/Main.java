package ClassWork1;

public class Main {

    public static void main (String[] args) {
        Person sarah = new Person("Sarah", 30);
        System.out.println(sarah.getName());
        System.out.println(sarah.getAge());
        sarah.setAge(32);
        System.out.println(sarah.getAge());
        Person john = new Person("John", 13);

    }
}
