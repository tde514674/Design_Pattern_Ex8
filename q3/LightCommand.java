public class LightCommand implements IRemote {
    Light light;
    public LightCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
    
    @Override
    public void undo() {
        this.light.off();
    }

    @Override
    public String toString() {
        return "light "+this.light.getRoomName();
    }
    
}
