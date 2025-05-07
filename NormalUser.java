public class NormalUser extends User{

    public NormalUser(String name) {
        super(name);

    }

    public NormalUser(String name, String email, String phonenumber) {
        super(name, email, phonenumber);
    }

    @Override
    public void menu() {
        System.out.println("1. View Games");
        System.out.println("2. Add Games");
        System.out.println("3. Delete Games");
        System.out.println("4. Search Games");
        System.out.println("5. Delete All Data");
        System.out.println("6. Exit");
    }

}
