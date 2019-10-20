package dougdoor;

class BarkRecognizer{

    private DogDoor door;

    BarkRecognizer(DogDoor door){
        this.door = door;
    }

    void recognizer(String bark){
        System.out.println("BackRecognizer: Ouvi um '" + bark + "'");
        if(this.door.getBark() != null && this.door.getBark().equals(bark))
            this.door.open();
    }
}