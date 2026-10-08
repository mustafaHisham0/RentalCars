
package rentalcars;

/**
 *
 * @author Home Technology
 */
public class RentalCars {

 
    public static void main(String[] args) {
      
        Car myCar = new Car("ABC-123", "Toyota Corolla", 15.0, 50.0);

     
        myCar.checkStatus();
        System.out.println("----------------------------------------");

      
        myCar.drive(100);
        myCar.checkStatus();
        System.out.println("----------------------------------------");

        
        myCar.drive(80);
        System.out.println("----------------------------------------");

        
        myCar.refuel(20);
        myCar.checkStatus();
        System.out.println("----------------------------------------");

        
        myCar.refuel(40); 
        myCar.checkStatus();
    }
}
    

