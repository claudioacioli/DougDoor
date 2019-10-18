package dougdoor;

import java.util.Timer;
import java.util.TimerTask;

class DogDoor{

    private boolean open;
    private int duration;

    DogDoor(){
        open = false;
        duration = 5000;
    }

    DogDoor(int seconds){
        setDuration(seconds);
        open = false;
    }

    void open(){
        System.out.println("A porta para cachorro abre.");
        open = true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            public void run(){
                DogDoor.this.close();
                timer.cancel();
            }
        }, duration);
    }

    void close(){
        System.out.println("A porta para cachorros fecha.");
        open = false;
    }

    void setDuration(int seconds){
        duration = seconds * 1000;
    }

    boolean isOpen(){
        return open;
    }

}