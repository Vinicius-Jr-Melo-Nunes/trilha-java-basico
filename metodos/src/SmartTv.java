public class SmartTv {
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void changeChannel(){
        
    }

    public void volumeUp() {
        volume++;
        System.out.println("increasing the volume to: " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("lowering the volume to: " + volume);
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

}
