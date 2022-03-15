
/** 
 * Parking into a garage
 * 
 * a family owns three cars. 
 * The first car with number plate (np) 2A8 2828 owns a father.
 * The second car with np 1C7 1177 owns a mother. 
 * The third car with np 9T6 9696 uses their son.
 * Their daghter uses the fathers car when the father is not at a home.
 * In the garage is only an  one  place for a car. Ussualy it uses the father.
 * When he is not at the  home it use a member of the family, who arrives to home
 * the  first.
 * 
 

 This code is an expansion of  a learning code  from www.itnetwork.cz
 * The  original code can park only the fathers car in the garage. 
 * The  expansion adds random parking other cars, and biddy and her husband
 * with a commentary :)
 */

package cz.martin.parking;

/**
 *
 * @author mARTin
 */
public class ParkingMain {
    public static void main(String[] args) {
        //creating  cars obj
        Car car1 = new Car("2A8 2828");
        Car car2 = new Car("1C7 1177");
        Car car3 = new Car("9T6 9696");
         
        // create garage obj
        Garage garage= new Garage();
       
        //create obj that randomly generate a car which park in the  garage
        RandomPark randomPark = new  RandomPark();
          
     
        //creating neigbour objs
        Neighbour biddy = new Neighbour();
        Neighbour guy = new Neighbour();
        
        //it happens, when the father  is not at a home
        System.out.println("The father is at the home: ");
        //the father park into the garage
        garage.parkFathersCar(car1);
        
        //biddy comments what  happend in the garage
        biddy.staring1(garage);
        
         //it  happens  when the father went to Tokio
         System.out.println("The father is not at the home: ");
         // a random car  park into the garage
         garage.parkRandomCar(car1,car2, car3, randomPark);
      
              
        //neighbours comments
        biddy.staring2(randomPark);
        guy.keepRelax(randomPark);
        
        
    
    }
}
