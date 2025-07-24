// You are using Java
import java.util.Scanner;

class a {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        int month = scanner.nextInt();
        int time = scanner.nextInt();
        
        int cost = month*time;
        
        System.out.printf("Total Cost: %d\n", cost);
        
        int mode;
        
        if(cost <= 1000 ){
            mode = 1;
        }
        
        else if(cost >= 1000 && cost <= 5000){
            mode = 2;
        }
        
        else{
            mode = 3;
        }
        
        switch(mode){
            case 1:
                System.out.printf("Payment Method Suggestion: Payment by cash or check is recommended.");
                break;
            case 2:
                System.out.printf("Payment Method Suggestion: Payment by credit card is recommended.");
                break;
            case 3:
                System.out.printf("Payment Method Suggestion: Payment by bank transfer is recommended.");
                break;
        }
        
    }
    
    
    
}
