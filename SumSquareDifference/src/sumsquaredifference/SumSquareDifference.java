/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumsquaredifference;

/**
 *
 * @author Amy
 */
public class SumSquareDifference {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        int sumOfSquares = 0;
        int square = 0; 
             
        for ( i = 1 ; i <= 100 ; i++)
        {
            
            square = i*i;
            sumOfSquares += square; 
        }
        
        int j;
        int sum = 0;
        for ( j = 1 ; j <= 100 ; j++ )
        {
           
            sum += j;
            
        }
        
        int squareOfSum = sum*sum;
        
        int sumSquareDifference = squareOfSum - sumOfSquares;
        
        System.out.println(sumSquareDifference);
    }
    
}
