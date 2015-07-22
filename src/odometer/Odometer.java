/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odometer;

/**
 *
 * @author test
 */
public class Odometer {

    int odomSize;
    
    public static boolean isStrictlyIncreasing(int odomReading, int size) {
        int prev = odomReading % 10;
        odomReading = odomReading/10;
        
        while (odomReading>0) {
            int currentDigit = odomReading % 10;
            if(currentDigit >= prev) {
                return false;
            }
            prev = currentDigit;
            odomReading = odomReading/10;
        }
        return true;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=11;i<999;i++) {
            if(isStrictlyIncreasing(i,2)) {
                System.out.println(i+" "+isStrictlyIncreasing(i,2));
            }
            
        }
        
    }
    
}
