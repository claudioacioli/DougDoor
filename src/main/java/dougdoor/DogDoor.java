package dougdoor;

import java.util.Timer;
import java.util.TimerTask;

class DogDoor{

    private boolean open;
    private int duration;

    DogDoor(){
        this.open = false;
        this.duration = 5000;
    }

    DogDoor(int secondsToClose){
        this.duration = secondsToClose * 1000;
        this.open = false;
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
        }, this.duration);
    }

    void close(){
        System.out.println("A porta para cachorros fecha.");
        open = false;
    }

    boolean isOpen(){
        return open;
    }

}