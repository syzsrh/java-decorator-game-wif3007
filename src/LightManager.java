/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author HP
 */
public class LightManager {
    Switch[] onCommands;
    Switch[] offCommands;
    Switch undoCommand;
 
    public LightManager() {
        onCommands = new Switch[3];
        offCommands = new Switch[3];

        Switch noCommand = new NoCommand();
        for(int i=0;i<3;i++) {
                onCommands[i] = noCommand;
                offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Switch onCommand, Switch offCommand) {
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
            onCommands[slot].execute();
            undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
            offCommands[slot].execute();
            undoCommand = offCommands[slot];
    }
    

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            s.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName() + "    " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        s.append("[undo] " + undoCommand.getClass().getSimpleName() + "\n");
        return s.toString();
    }
}
