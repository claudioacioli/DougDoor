package dougdoor;

public class DogDoorSimulator{

    public static void main(String[] args) {

        DogDoor door = new DogDoor();
        Bark ownerBark = new Bark("Auuuuuuu");
        door.setAllowedBark(ownerBark);
        door.setDuration(3);
        BarkRecognizer recognizer = new BarkRecognizer(door);

        Remote remote = new Remote(door);
        System.out.println("Fido late para sair");
//        remote.pressButton();
        recognizer.recognizer(ownerBark);
        System.out.println("Fido saiu");
        System.out.println("Fido ja terminou");

        try{
            Thread.sleep(10000);
        } catch (InterruptedException e){
            System.out.println("Ops...");
        }

        System.out.println("Fido late para entrar...");
        recognizer.recognizer(ownerBark);
//        remote.pressButton();
        System.out.println("Fido ja voltou para dentro");

    }

}