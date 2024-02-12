public class AirconditionerCommand implements IRemote {
    Airconditioner airconditioner;

    public AirconditionerCommand(Airconditioner airconditioner){
        this.airconditioner = airconditioner;
    }

    @Override
    public void execute() {
        this.airconditioner.on();
        this.airconditioner.setTemp(25);
    }

    @Override
    public void undo() {
        this.airconditioner.off();
        
    }

    @Override
    public String toString() {
        return "AC "+this.airconditioner.getRoomName();
    }
    
}
