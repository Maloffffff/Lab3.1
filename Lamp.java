package lab_3;

import java.util.Objects;

public class Lamp implements Switchable{
    private boolean lightOn;
    private Shorty shorty;

    public Lamp(boolean lightOn){
        this.lightOn = lightOn;
    }
    @Override
    public void toggle(Shorty shorty){
        if (this.lightOn)this.turnOff(shorty);
        else this.turnOn(shorty);
        this.shorty = shorty;
    }
    public void turnOn(Shorty shorty){
        System.out.println("The lamp is turned on by "+ shorty.getFirstName());
    }
    public void turnOff(Shorty shorty){
        System.out.println("The lamp is turned off by "+ shorty.getFirstName());
    }

    public boolean NeznaikaCheck(){
        System.out.println(this.shorty.getFirstName() != "Незнайка");
        return (this.shorty.getFirstName() == "Незнайка");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lamp lamp = (Lamp) o;
        return lightOn == lamp.lightOn && shorty.equals(lamp.shorty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lightOn, shorty);
    }
}
