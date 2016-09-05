
package se.newton.yapp.unittesting;

public class UnitTesting {
    public static void main(String[] args) {
        System.out.println("Matte!");
  
        Calculator calc = new Calculator();
        
        int result = calc.Add(456, 3434);
        
        System.out.println(result);      
    }
}