package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller obj2 = new Seller(1, "Roger Silva", "roger.silva@email.com", new Date(), 3000.00, obj);
        System.out.println(obj);
        System.out.println(obj2);
    }
}
