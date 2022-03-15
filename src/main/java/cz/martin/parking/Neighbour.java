/**
 This Class neighbour represents  dialogue of neighbours descriping what happemns in their neighbourhood.
 */
package cz.martin.parking;

/**
 *
 * @author mARTin
 */
public class Neighbour {
   
    public void staring1(Garage garage){
       System.out.println( "The biddy says: \"The neighbour is at the home and he has parked his car " +  garage.getFathersNubmerPlate() + " into his garage!\"\n"); 
    }
    
    //method for descriping what happend in the garage 
    public void staring2(RandomPark randomPark){
        System.out.println("The biddy says: \"Hey! Look! The neighbour is not at the home! The car with number plate " +randomPark.getParkRandom()+" has arriwed into his garage!\"");    
    }
    //method for showing who get into the garage
    public void keepRelax(RandomPark randomPark){
        String a = "The guy says: \"Keep relax! Theirs ";
        String b = " drives the car...\""; 
        { if(randomPark.getParkRandom().equals("2A8 2828")){
        System.out.println( a +"doughter" + b);
     
    } 
       else if (randomPark.getParkRandom().equals("1C7 1177")){
        System.out.println(a + "mother" + b);
    } 
        else
            System.out.println(a + "son" + b);
    }}
}
