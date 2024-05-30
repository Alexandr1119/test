public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Рома";
        person1.age = 50;
        person1.age = 50;
        System.out.println("меня зовут " + person1.name + "," + " мне " + person1.age + ".");

        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        System.out.println("меня зовут " + person2.name + "," + " мне " + person2.age + ".");
    }
}
class Person{
    String name;
    int age;
}


