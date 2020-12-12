/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NUR FARAHIN
 */
public class RoomDecoratorFacade {
       
    Light light;
    Ketupat ketupat;
    Curtain curtain;
    Pelita pelita;
    Kuih kuih;
    Firework firework;
    Radio radio;
    People people;
        
    public RoomDecoratorFacade(Light light, Ketupat ketupat, Curtain curtain, Pelita pelita, Kuih kuih, Firework firework,Radio radio, People people){
        this.light = light;
        this.ketupat = ketupat;
        this.curtain = curtain;
        this.pelita = pelita;
        this.kuih = kuih;
        this.firework = firework;
        this.radio = radio;
        this.people = people;
    }
    
    public void allDecoration(){
        System.out.println("Add all decoration..");
        light.on();
        ketupat.on();
        curtain.on();
        pelita.on();
        kuih.on();
        firework.on();
        radio.on();
        people.on();
    }
}
