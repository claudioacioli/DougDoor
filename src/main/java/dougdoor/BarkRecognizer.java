package dougdoor;

class BarkRecognizer{

    private DogDoor door;

    BarkRecognizer(DogDoor door){
        this.door = door;
    }

    void recognizer(Bark bark){
        System.out.println("BackRecognizer: Ouvi um '" + bark.getSound() + "'");
        if(this.door.getAllowedBark().equal(bark))
            this.door.open();
        else
            System.out.println("Este cachorro nao esta cadastrado.");
    }
}