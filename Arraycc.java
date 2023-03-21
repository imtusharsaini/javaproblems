import java.util.Scanner;

public class Arraycc {
     
    public static int  getlargest(int number[]){
   
        int larger = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
             
            
            if(number[i]>larger ){
       
             larger = number[i]; 
            }
 
        }
            return larger;
    }

    public static void main(String[] arga){

        int number[]={1,2,3,4,5,6,7,8,9};
        

            System.out.println("the largest number in array is :" + getlargest(number));
        
    }
    
}
