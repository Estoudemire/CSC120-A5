public class Engine {
    
    //Variables for the class
    private String fuelType; 
    private double maxFuel; 
    private double currentFuel; 

    //Constructor
    public Engine (String fuelType, double maxFuel, double currentFuel){
        this.fuelType = fuelType; 
        this.maxFuel = maxFuel; 
        this.currentFuel = currentFuel; 
    }

    //Accessor methods 
    public void setFuelType (String newFuelType){
        this.fuelType = newFuelType; 
    }
    public String getFuelType (){
        return fuelType; 
    }

    public void setMaxFuel (double maxFuel){
        this.maxFuel = maxFuel; 
    }
    public double getMaxFuel (){
        return maxFuel; 
    }

    public void setCurrentFuel (double currentFuel){
        this.currentFuel = currentFuel; 
    }
    public double getCurrentFuel (){
        return currentFuel; 
    }
}