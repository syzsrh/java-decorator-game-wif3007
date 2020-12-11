/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author HP
 */
public interface Switch {
    public void execute();
    public void undo();
}

class NoCommand implements Switch{
    @Override
    public void execute(){}
    @Override
    public void undo(){}
    
}

//Light
class LightOnCommand implements Switch{
    Light light;
    int level;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        level = light.getLevel();
        light.on();
    }

    @Override
    public void undo() {
        light.before(level);
    }
}
class LightOffCommand implements Switch{
    Light light;
    int level;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        level = light.getLevel();
        light.off();
    }

    @Override
    public void undo() {
        light.before(level);    
    }
}

class BlueLight implements Switch{
    Light light;
    int level;
    public BlueLight(Light light) {
        this.light = light;
    }

    public void execute() {
        level = light.getLevel();
        light.blueLight();
    }

    @Override
    public void undo() {
        light.before(level);    
    }
}
