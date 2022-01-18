package lab_3;

import java.util.Objects;

public class Door implements Switchable{
    private boolean isOpen;
    private Shorty shorty;


    public Door(boolean isOpen){
        this.isOpen = isOpen;
    }
    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean NeznaikaCheck(){
        System.out.println(!Objects.equals(this.shorty.getFirstName(), "Незнайка"));
        return (Objects.equals(this.shorty.getFirstName(), "Незнайка"));

    }

    @Override
    public void toggle(Shorty shorty) {
        if (this.isOpen) close(shorty);
        else open(shorty);
        this.shorty = shorty;
    }

    public void open(Shorty shorty) {
        isOpen = true;
        System.out.println("Door opened by " + shorty.getFirstName());
    }

    public void close(Shorty shorty) {
        isOpen=false;
        System.out.println("Door closed by "+ shorty.getFirstName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return isOpen == door.isOpen && shorty.equals(door.shorty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOpen, shorty);
    }
}
