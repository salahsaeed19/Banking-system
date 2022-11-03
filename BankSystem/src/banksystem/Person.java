package banksystem;

import java.util.ArrayList;

public class Person {
    
    public int id;
    public String first_name;
    public String last_name;
    public Boolean is_user;
    public String gender;
    public String address;
    public String password;
    public double amount;
    public String account_type;
    
    private static int idIncrementer = 1000;
    
    public static ArrayList<Person> persons = new ArrayList();
    
    public Person(String first_name, String last_name, Boolean is_user, String gender ,String address, String password , String type) {
        int new_id = Person.idIncrementer++;
        this.id = new_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.is_user = is_user;
        this.gender = gender;
        this.address  = address;
        this.password = password;
        this.account_type = type;
        this.amount = 0;
    }
     
}
