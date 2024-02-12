public class App {
    public static void main(String[] args) {
        LightCommand lightBedroom = new LightCommand(new Light("Bed Room"));
        LightCommand lightKitchen = new LightCommand(new Light("Kitchen"));
        AirconditionerCommand acBedroom = new AirconditionerCommand(new Airconditioner("Bed Room"));
        RemoteInvoker remote = new RemoteInvoker();
        remote.setButton(lightBedroom);
        remote.setButton(lightKitchen);
        remote.setButton(acBedroom);
        remote.testButton();
    }
}
