public class Admin extends User {

    public Admin(String name) {
        super(name);
    }

    public Admin(String name, String email, String phonenumber) {
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
