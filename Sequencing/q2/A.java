// You are using Java
import java.util.Scanner;

class a {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        int mode = scanner.nextInt();
        
        switch(mode) {
            
            case 1:
                
                {
                double R = scanner.nextDouble();
                double area = (3.14 * R * R);
                
                System.out.printf("%.2f sq.units", area);
                break;
                
                }
            case 2:
                
                {
                double L = scanner.nextDouble();
                double B = scanner.nextDouble();
                double area = (L * B);
                
                System.out.printf("%.2f sq.units", area);
                break;
                
                }
                
            case 3:
                {
                    
                    double P = scanner.nextDouble();
                    double Q = scanner.nextDouble();
                    double area = (0.5 * P * Q);
                    
                    System.out.printf("%.2f sq.units", area);
                    break;
                    
                }
            
            default:
            
                 System.out.printf("Invalid Choice");
                       }}}
