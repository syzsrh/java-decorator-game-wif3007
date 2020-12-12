/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public abstract class RoomDecorator {
    Room room;
    public abstract String getDesc();
    
}

class Light extends RoomDecorator{
    @Override
    public String getDesc() {
        return ",Light Up";
    }
    //Command Pattern
    int level;
    public void on() {
        level =100;
        System.out.println("Light is on");
    }

    public void off() {
        level=0;
        System.out.println("Light is off");
    }
    public void blueLight(){
        level=1;
        System.out.println("Light is blueLight");
    }
    public void before(int level){
        this.level=level;
        if(level==1){
            blueLight();
        }
    }
    public int getLevel(){
        return level;
    }

}

class Ketupat extends RoomDecorator{
    @Override
    public String getDesc() {
        return room.getDesc()+", Ketupat ON";
    }
    
    public void on(){
        System.out.println("Hanging ketupat...");
    }
}

class Curtain extends RoomDecorator{
    
    @Override
    public String getDesc() {
        return room.getDesc()+", Curtain ON";
    }
    
    public void on(){
        System.out.println("Hanging the curtain..");
    }

}

class Pelita extends RoomDecorator{
    
    @Override
    public String getDesc() {
        return room.getDesc()+", Pelita ON";
    }
    
    public void on(){
        System.out.println("Light up pelita..");
    }
}

class Kuih extends RoomDecorator{
    
    @Override
    public String getDesc() {
        return room.getDesc()+", Kuih ON";
    }
    
    public void on(){
        System.out.println("Serve the kuih..");
    }
}

class Firework extends RoomDecorator{
    
    @Override
    public String getDesc() {
        return room.getDesc()+", Firework ON";
    }

    public void on(){
        System.out.println("Light up firework..");
    }
}

class Radio extends RoomDecorator{
    
    @Override
    public String getDesc() {
        return room.getDesc()+", Radio ON";
    }

    public void on(){
        System.out.println("On the radio..");
    }
}

class People extends RoomDecorator{
    
    @Override
    public String getDesc() {
        return room.getDesc()+", People ON";
    }
    
    public void on(){
        System.out.println("Peoples visiting..");
    }

}
