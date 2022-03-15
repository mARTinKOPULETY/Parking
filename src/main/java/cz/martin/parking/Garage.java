/**
 * This class Garage  represents common state if the father is at  the  home.
 * that means that  father's car parks in the  garage.
*/

package cz.martin.parking;
/**
 *
 * @author mARTin
 */
public class Garage {
   // private Car car;

    private String fathersNubmerPlate;
    RandomPark randomlyParking = new  RandomPark();
        

    
    //method for parking fathers car into the  garage
    public void parkFathersCar(Car car){
    fathersNubmerPlate = car.getNumberPlate();
    }
    
    public void parkRandomCar(Car car1, Car car2, Car car3, RandomPark randomPark){
    
    randomPark.parkRandom(car1, car2, car3);
 
    }
    
    
    public String getFathersNubmerPlate(){
        return fathersNubmerPlate;
    }

 

 
}
