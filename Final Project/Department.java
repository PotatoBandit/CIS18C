
import java.util.HashMap;
import java.util.*;

public class Department 
{
    int id;
    String description;
   HashMap<Integer, Employee>  map;

   Department(int id, String description)
   {
       this.id = id;
      this.description = description;
      this.map = map;
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
       this.description = Description;
   }
   
   String  get_Department_Description()
   {
       return description;
   }
   
   @Override
   public String toString()
   {
       return ("ID: " + get_Department_ID() + "  " + get_Department_Description());
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
   
   void addEmployee(Integer id,  String name, String bday, String ss,  String salary,  String address)
   {
         Employee newEmp = new Employee(id, name, bday, ss, salary, address);
         map.put(id, newEmp);
   }
   
   void populateMap()
   {
       addEmployee(1, "Scott", "10/10/10" , "12-12-1232", "2123124", "132413 asdfadfadf " );
   }
   
   
   
}
