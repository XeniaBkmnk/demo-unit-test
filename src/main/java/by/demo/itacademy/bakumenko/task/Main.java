package by.demo.itacademy.bakumenko.task;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Pol", 99);
        User user2 = new User("Pol", 99);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1.getName());
        System.out.println(user2.getName());

        int a =1;
        int c =1;

        //сровнение обьектов их содержимое, ва не адрееса как "=="- только для преметивных 

        boolean b = user1.equals(user2);
        System.out.println(b);
    }
}
