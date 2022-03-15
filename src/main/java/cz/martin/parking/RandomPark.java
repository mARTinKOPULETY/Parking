/**
 * This class GarageParkingRandomly generates  randomly cars number plate that will park in the garage.
 */
 
package cz.martin.parking;

import java.util.Random;

/**
 *
 * @author mARTin
 */
public class RandomPark {
    
    
    private Random random;
    private int number;
    private String carInGarage;
    
   
    public RandomPark(){      
    
        random= new Random();
    }
    
    // parks a car in to the garage randomly
    public void parkRandom(Car car1, Car car2, Car car3){
       number = random.nextInt(3)+1;
       
        
       {if(number == 1){
            carInGarage = car1.getNumberPlate();
        }
        else if(number == 2){
           carInGarage = car2.getNumberPlate();
        }
        else
         carInGarage = car3.getNumberPlate();
        }}
        
        public String getParkRandom() {
            return carInGarage;
        }
        
    
        
       
    }
