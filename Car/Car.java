/**
* A cool hot hip young class
* tracks fuel remaining in the car as it is driven based on fuel efficiency
* 
* @Charlie
* @version 15 septemb
*/

public class Car
{
    /** the fuel efficiency of this car measured in miles per gallon*/
    private double fuelEfficiency;
    /**the number of gallons of fuel left in the tank*/
    private double fuelInTank;

    /**
     * Default constructor for a car of specified fuel efficiency
     */
    public Car(double efficiency)
    {
        this.fuelEfficiency = efficiency;
        this.fuelInTank = 0;
    }

    /**
     * Adds the specified number of gallons of fuel to this car's tank
     * 
     * @pre the specified number of gallons does not excede this gar's gass capacity
     * @param gallons number of gallons of fuel to add to this car's tank
     */
    public void addGas(double gallons)
    {
        this.fuelInTank = this.fuelInTank + gallons;
    }

    /**
     * Updated fuel in this car's tank based on the specified number of miles driven and this car's fuel efficiency
     * 
     * @pre Specified number of miles does not exceed the fuel in this car's tank
     * @post postconditions for this method
     * (what the method guarantees upon completion)
     * @param miles number of miles this car has driven 
     */
    public void drive(double miles)
    {
        double gallonsBurned = miles / this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsBurned;
    }

    /**
     * returns number of gallons of fuel left in this car's tank
     * 
     * @return's number of gallons of fuel left in this car's tank
     */
    public double getGasInTank() 
    {
        //put code here
        return this.fuelInTank;
    }


}