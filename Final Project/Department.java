/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rebecca
 */
import java.util.HashMap;
import java.util.*;

public class Department 
{
    int id;
    String description;
   HashMap<Integer, Employee>  map;

   Department(int id, String Desciption)
   {
       this.id = id;
       this.description = description;
   }
   
   void set_Department_ID(int id)
   {
       this.id = id;
   }
   
   int  get_Department_ID()
   {
       return id;
   }
   
     void set_Department_Description(String Description)
   {
       this.description = description;
   }
   
   String  get_Department_Description()
   {
       return description;
   }
   
   void search_For_Employee()
   {
        Integer emp_id;
       int dept_id;
       
        Scanner input = new Scanner(System.in);
       System.out.println("Enter Dept:: ");
       dept_id = input.nextInt();
       
       
 
       System.out.println("Enter Employee ID: ");
      emp_id = input.nextInt();
      Employee emp = map.get(emp_id);
       System.out.println(emp.getEmployee_Name());
   }
   
}
