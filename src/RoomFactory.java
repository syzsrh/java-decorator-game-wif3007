/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public interface RoomFactory{
    public Light createLight();
    public Ketupat createKetupat();
    public Curtain createCurtain();
    public Pelita createPelita();
    public Kuih createKuih();
    public Firework createFireworks();
    public Radio createRadio();
    public People createPeople();
}

class KampungDeco implements RoomFactory {
    
    @Override
    public Light createLight() {
        return new Light();  
    }

    @Override
    public Ketupat createKetupat() {
        return new Ketupat();
    }

    @Override
    public Curtain createCurtain() {
        return new Curtain();
    }

    @Override
    public Pelita createPelita() {
        return new Pelita();
    }

    @Override
    public Kuih createKuih() {
        return new Kuih();
    }

    @Override
    public Firework createFireworks() {
        return new Firework();
    }

    @Override
    public Radio createRadio() {
        return new Radio();
    }

    @Override
    public People createPeople() {
           return new People();
    }
}
class ModernDeco implements RoomFactory{
    
    @Override
    public Light createLight() {
        return new Light();  
    }

    @Override
    public Ketupat createKetupat() {
        return new Ketupat();
    }

    @Override
    public Curtain createCurtain() {
        return new Curtain();
    }

    @Override
    public Pelita createPelita() {
        return new Pelita();
    }

    @Override
    public Kuih createKuih() {
        return new Kuih();
    }

    @Override
    public Firework createFireworks() {
        return new Firework();
    }

    @Override
    public Radio createRadio() {
        return new Radio();
    }

    @Override
    public People createPeople() {
           return new People();
    }
    
}

