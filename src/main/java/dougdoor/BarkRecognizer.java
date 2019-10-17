package dougdoor;

class BarkRecognizer{

    private DogDoor door;

    BarkRecognizer(DogDoor door){
        this.door = door;
    }

    void recognizer(String bark){
        System.out.println("BackRecognizer: Ouvi um '" + bark + "'");
        this.door.open();
    }
}