import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String type= "";
        String day = "";
        System.out.println("pls enter a number between 1 to 7:");
        int n = input.nextInt();
        if(n >= 8) System.out.println("you enter invalid number!!!");
        switch(n){ 
            case 1:
                day = "saturday";
                break;
            case 2:
                day = "sunday";
                break;
            case 3:
                day = "monday";
                break;
            case 4:
                day = "tuesday";
                break;
            case 5:
                day = "wednesday";
                break;
            case 6:
                day = "thursday";
                break;
            case 7:
                day = "friday";  
                break;               
        }
        switch(n){
            case 1:
            case 3:
            case 5:
                type = "even";
                break;
            case 2:
            case 4:
            case 6:    
                type = "odd";
                break;
            case 7:
                
        }
        if(!"".equals(day))
            System.out.printf("the day %d in week is %s .\n",n , day);
        if(!"".equals(type))
            System.out.printf("and %s .\n", type);
        if(n == 7) System.out.println("friday is not a real day!!!,not odd and not even");
    }
}
