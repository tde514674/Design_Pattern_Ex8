import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoteInvoker {
    private List<IRemote> buttonList = new ArrayList<>();
    private int size = 6;
    private int remoteSlot = 0;
    private int buttonSlot = 0;

    public RemoteInvoker(){
        for(int i=0;i<size;i++){
            buttonList.add(null);
        }
    }

    public void setButton(IRemote button) {
        try {
            buttonList.set(remoteSlot, button);
            remoteSlot++;   
        } catch (Exception e) {
            System.out.println("No available alot left.");
        }
        

    }

    public void removeButton(IRemote button) {
        if (buttonList.size() != 0) {
            buttonList.remove(buttonList.indexOf(button));
        }
    }

    public void executeButton() {
        for (IRemote button : buttonList) {
            button.execute();
        }
        // buttonList.clear();
    }


    public void clearButton() {
        if (buttonList.size() != 0) {
            buttonList.clear();
        }
    }

    public void undoButton() {
        if (buttonList.size() != 0) {
            List<IRemote> tempList = buttonList;
            Collections.reverse(tempList);
            for (IRemote button : tempList) {
                button.undo();
            }
        }
    }

    @SuppressWarnings("null")
    public void testButton() {
        try {
            for (IRemote button : buttonList) {
                if(button == null){
                    System.out.println("test one unavailable slot, slot " + buttonSlot);
                    button.execute();
                }
                System.out.println("slot "+ buttonSlot+", "+button);
                System.out.print("On button ");
                button.execute();
                System.out.print("Off button ");
                button.undo();
                System.out.println("--------------------------------");
                buttonSlot++;
            }
            buttonList.clear();
        } catch (Exception e) {
            System.out.println("On button No command is assigned to this remoteSlot");
            System.out.println("Off button No command is assigned to this remoteSlot");
            buttonList.clear();
        }
    }
}
