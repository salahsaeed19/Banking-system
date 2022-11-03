package banksystem;

public class BankSystem {
    
    public static LOGIN login = new LOGIN();
    
    public static Dashboard_user dashboard_user = new Dashboard_user();
    
    public static Add_New_User newuser = new Add_New_User();
    
    public static Add_New_Transction transction = new Add_New_Transction();
    
    public static Profile_User profile_user = new Profile_User();
    
    public static int userid;
    
    
    
    
    public static void main(String[] args) {
        
        Person admin = new Person("admin","Khaled",true,"male","Gaza","123","Empolyee");
        Person client = new Person("abod","Jaber",false,"male","Gaza","123","Client");

        Person.persons.add(admin);
        Person.persons.add(client);

        
        login.setVisible(true);
        login.setTitle("Login");
        login.setLocation(300, 150);
        login.setResizable(false);
        
        dashboard_user.setVisible(false);
        dashboard_user.setTitle("Dashboard User");
        dashboard_user.setLocation(300, 150);
        dashboard_user.setResizable(false);
        
        newuser.setVisible(false);
        newuser.setTitle("Add New User");
        newuser.setLocation(300, 150);
        newuser.setResizable(false);
        
        transction.setVisible(false);
        transction.setTitle("Add New Transction");
        transction.setLocation(300, 150);
        transction.setResizable(false);
        
        profile_user.setVisible(false);
        profile_user.setTitle("Profile User");
        profile_user.setLocation(300, 150);
        profile_user.setResizable(false);
        
    }
}
