import java.util.*;
public class TaskListApp{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();
        boolean b=true;
        String name;
        do
        {
        System.out.println("Enter Your Operation Name : \n Add \n Delete \n Show");
        String ch=sc.next();
        switch(ch)
        {
            case "Add" -> {
                System.out.println("Enter Task Name: ");
                name=sc.next();
                al.add(name);
                System.out.println(name+" Added");
                }
            case "Delete" -> {
                System.out.println("Enter Task number to delete");
                int t=sc.nextInt()-1;
                if(t<al.size()&&t>0)
                {
                    name = al.remove(t-1);
                    System.out.println(name+" Deleted Sucessfully");
                }
                else
                {
                    System.out.println("Task Not Found !");
                }
                }
            case "Show" -> {
                if(al.isEmpty()) System.out.println("No Tasks Found !");
                else
                {
                System.out.println("All Tasks are: ");
                for(int i=0;i<al.size();i++)
                {
                    System.out.println(i+1+". "+al.get(i));
                }
                }
            }
            default -> System.out.println("Enter Correct Operation");
        }
        System.out.println("Enter True for continue");
        b=sc.nextBoolean();
        }while(b);
        System.out.println("Program Exited");
    }
}