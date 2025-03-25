import java.util.Scanner;
class slargest{

    public int secondLargest(int arr[]){

        int largest=arr[0];
        int slargest=arr[0];
                 
        // optimal approch
        for (int j = 0; j < arr.length; j++) {
              if(arr[j]>largest)
              {
                slargest=largest;
                largest=arr[j];
              }
             else if(arr[j] > slargest && arr[j] != largest){
                 slargest = arr[j];
             }
        }

             // better approch
    //     for (int j = 0; j < arr.length; j++) {
    //         if(arr[j]>largest)
    //         {
    //           largest=arr[j];
    //         }
    //         for (int i = 0; i < arr.length; i++) {
    //            if(arr[i] > slargest && arr[i] < largest){
    //            slargest = arr[j];
    //        }
    //   }
    // }
        return slargest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter 6 elements");
        int ar[]=new int[6];
        for (int i = 0; i < ar.length; i++) 
        {
            ar[i]=sc.nextInt();
            
        }
        slargest obj=new slargest();
        System.out.println(obj.secondLargest(ar));
    }

}