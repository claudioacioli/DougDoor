package dougdoor;

public class BarkRecognizer{

    private DogDoor door;

    public BarkRecognizer(DogDoor door){
        this.door = door;
    }

    public void recognizer(String bark){
        System.out.println("BackRecognizer: Ouvi um '" + bark + "'");
        this.door.open();
    }
}