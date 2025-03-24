import java.util.*;
public class ArrayListExample {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements");
        ArrayList<Integer> list =new ArrayList<>();

        for(int i=0;i<=6;i++)
        {
            list.add(sc.nextInt());
        }
        // System.out.println(list);
        System.out.println("enter the elements"); 
        
    for(int i=4;i<=6;i++)
    {
        System.out.println(list.get(i));
    }
    System.out.println();
    
}
}

