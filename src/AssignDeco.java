/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class AssignDeco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Room kampung = new KampungFactory();
        kampung.createRoom();
        LightManager manager = new LightManager();
        Light lampu = new Light();
        LightOnCommand lightOn = new LightOnCommand(lampu);
        LightOffCommand lightOff = new LightOffCommand(lampu);
        BlueLight bluelight = new BlueLight(lampu);
        
       	manager.setCommand(0, lightOn, lightOff);
        manager.setCommand(1, bluelight, lightOn);
        manager.onButtonWasPushed(0);
        manager.onButtonWasPushed(1);
        System.out.println(manager);
    }
}
