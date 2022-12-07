
package ornek6.pkg70;

import java.util.Scanner;

public class Ornek670 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n;
        double x, f, t, aci;

         System.out.println("Aci degeri (derece): ");
          aci = input.nextDouble();
      
        System.out.println("Terim sayisi: ");
          n= input.nextInt();
        
        
          
           t= 0;
          x=Math.toRadians(aci);
        
          
    
          
          for(int i=1; i<=n; i++){
          
                f=1; 
               for(int j=1; j< 2*i; j++){
                   f=f*j;
               
             t+= Math.pow((-1), (i-1))* Math.pow(x, (2*i-1))/f;
               } 
          }
          
          System.out.printf("\nSeri acilimi ile hesaplanan  deger: %.5f\n", t);
          
    
    }
    
}
