package Vehicle registration;

public class VehicleRegistration {
    
    private String Name;
    
    private Integer licenseNumber;
    
    private Integer machineNumber;
    
    public String getName() {
        return this.Name;
    }
    
    public String setName(String Name) {
        this.Name = Name;
    }
    
    public Integer getLicenseNumber() {
        return this.licenseNumber;
    }
    
    public Integer setLicenseNumber(Integer licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    
    public Integer getMachineNumber() {
        return this.machineNumber;
    }
    
    public Integer setMachineNumber(Integer machineNumber) {
        this.machineNumber = machineNumber;
    }
}
