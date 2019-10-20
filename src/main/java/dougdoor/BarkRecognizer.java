package dougdoor;

class BarkRecognizer{

    private DogDoor door;

    BarkRecognizer(DogDoor door){
        this.door = door;
    }

    void recognizer(Bark bark){
        System.out.println("BackRecognizer: Ouvi um '" + bark.getSound() + "'");
        for(Bark allowedBark : door.getAllowedBark())
            if(allowedBark.equal(bark)) {
                door.open();
                return;
            }
        System.out.println("Este cachorro nao esta cadastrado.");

    }
}