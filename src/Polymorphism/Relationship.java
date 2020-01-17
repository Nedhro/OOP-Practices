package Polymorphism;

//IS A and Has A Relationship
public class Relationship {
    public static void main(String[] args) {
        Honda obj = new Honda();
        obj.setColor("Blue");
        obj.setSpeed("Max 130km/hour");
        obj.setModel("Hornet");
        System.out.println("Model: " + obj.getModel());
        System.out.println("Color: " + obj.getColor());
        System.out.println("Speed: " + obj.getSpeed());
        Engine e = new Engine("163cc", "14rpm");
        obj.display("Hornet 160R", e);
    }
}

class Bike {
    private String model;
    private Engine engine;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void display(String model, Engine engine) {
        System.out.println("Model: " + model);
//        engine.setCc("163cc");
//        engine.setTorque("14rpm");
        System.out.println("CC: " + engine.getCc() + " Torque: " + engine.getTorque());
    }
}

// IS A Relation
class Honda extends Bike {
    private String color;
    private String speed;

    public Honda(String color, String speed) {
        this.color = color;
        this.speed = speed;
    }

    public Honda() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}

class Engine {
    private String cc;
    private String torque;

    public Engine() {
    }

    public Engine(String cc, String torque) {
        this.cc = cc;
        this.torque = torque;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getTorque() {
        return torque;
    }

    public void setTorque(String torque) {
        this.torque = torque;
    }
}


