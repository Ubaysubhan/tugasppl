package Vehicle;

public class Vehicle implements Igniteable {
    private list <Person> Passenger: ;
    
    private String state;
    
    private Machine machine;
    
    private TransmissionType transmissionType;
    
    public list <Person> getPassenger: () {
        return this.Passenger: ;
    }
    
    public list <Person> setPassenger: (list <Person> Passenger: ) {
        this.Passenger:  = Passenger: ;
    }
    
    public String getState() {
        return this.state;
    }
    
    public String setState(String state) {
        this.state = state;
    }
    
    public Machine getMachine() {
        return this.machine;
    }
    
    public Machine setMachine(Machine machine) {
        this.machine = machine;
    }
    
    public TransmissionType getTransmission Type() {
        return this.transmissionType;
    }
    
    public TransmissionType setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }
    
    public addPassenger(Person person) {
        this.passenger.add(person)
    }
}
