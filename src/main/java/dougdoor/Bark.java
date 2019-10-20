package dougdoor;

class Bark{

    private String sound;

    Bark(String sound){
        this.sound = sound;
    }

    String getSound() {
        return sound;
    }

    boolean equal(Object bark){
        if(bark instanceof Bark){
            Bark otherBark = (Bark) bark;
            if(this.sound.equalsIgnoreCase(otherBark.getSound()))
                return true;
        }
        return false;
    }
}