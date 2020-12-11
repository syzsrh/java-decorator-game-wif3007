/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public abstract class Room extends RoomDecorator{
    String desc ="Basic room";
    abstract void createRoom();
    public String getDesc(){
        return desc;
    }
    
}

class KampungFactory extends Room{
    public KampungFactory(){
        desc ="Kampung style ";
    }
    RoomFactory r;
    @Override
    void createRoom() {
        RoomFactory room = (RoomFactory) new KampungDeco();
        System.out.println(desc+room.createLight().getDesc());
    }
}
class ModernFactory extends Room{
    public ModernFactory(){
        desc ="Modern style ";
    }
    @Override
    void createRoom() {
        RoomFactory room = (RoomFactory) new KampungDeco();
        System.out.println(desc+room.createLight().getDesc());
    }
}
