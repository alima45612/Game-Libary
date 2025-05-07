import java.util.Scanner;

public class Main {

    static StoreDate storedate;

    static Scanner s;
    public static void main(String[] args) {

        storedate = new StoreDate();

        System.out.println("Welcome to the Game Libary Management System");

        int num;
        do {
            System.out.println("0.Exit\n1. Login\n2. New User");
        
        
            s = new Scanner(System.in);
            num = s.nextInt();

            switch (num) {
                case 1: login();
                case 2: newuser();
            }
        } while (num!=0);
    }

    private static void login() {
        System.out.println("Enter phone number:");
        String phonenumber = s.next();
        System.out.println("Enter email:");
        String email = s.next();
        int n = storedate.login(phonenumber, email);
        if(n!= -1) {
            User user = storedate.getUser(n);
            System.out.println("Welcome " + user.getName());

        }else{
            return;
        }
    }

    private static void newuser() {
        System.out.println("Enter name:");
        String name= s.next();
        System.out.println("Enter phone number:");
        String phonenumber = s.next();
        System.out.println("Enter email:");
        String email = s.next();
        System.out.println("1. Admin\n2. Normal User");
        int n2 = s.nextInt();
        if (n2==1) {
            User admin = new Admin(name, email, phonenumber);
            storedate.AddUser(admin);
        }else{
            User user = new Admin(name, email, phonenumber);
            storedate.AddUser(user);
        }
        System.out.println("User creates successfully");
    }
}