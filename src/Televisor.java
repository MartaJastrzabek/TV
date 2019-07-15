public class Televisor {
    boolean isOn;

    Televisor(){
        isOn = false;
    }

    void turnOn(){
        isOn = true;
    }

    void turnOff(){
        isOn = false;
    }

    String showStatus(){
        return "TV is on: " + isOn;
    }
}
