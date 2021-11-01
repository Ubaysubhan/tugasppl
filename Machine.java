package Machine;

public class Machine {
    
    private Integer cc;
    
    private Integer hp;
    
    private Integer fuel_consumption_per_km;
    
    private Vehicle vehicle;
    
    
    public Integer getCc() {
        return this.cc;
    }
    
    public Integer setCc(Integer cc) {
        this.cc = cc;
    }
    
    public Integer getHp() {
        return this.hp;
    }
    
    public Integer setHp(Integer hp) {
        this.hp = hp;
    }
    
    public Integer getFuelConsumptionPerKm() {
        return this.fuel_consumption_per_km;
    }
    
    public Integer setFuelConsumptionPerKm(Integer fuel_consumption_per_km) {
        this.fuel_consumption_per_km = fuel_consumption_per_km;
    }
    
    
    public Vehicle getVehicle() {
        return this.vehicle;
    }
    
    public Vehicle setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
}
