package dougdoor;

public class DogDoorSimulator{

    public static void main(String[] args) {

        DogDoor door = new DogDoor();
        door.addAllowedBark(new Bark("Auuuuuuu"));
        door.addAllowedBark(new Bark("Rolf"));
        door.setDuration(3);
        BarkRecognizer recognizer = new BarkRecognizer(door);

        Remote remote = new Remote(door);
        System.out.println("Fido late para sair");
//        remote.pressButton();
        recognizer.recognizer(new Bark("Rolf"));
        System.out.println("Fido saiu");
        System.out.println("Fido ja terminou");

        try{
            Thread.sleep(10000);
        } catch (InterruptedException e){
            System.out.println("Ops...");
        }

        System.out.println("Fido late para entrar...");
        recognizer.recognizer(new Bark("Auuuuuuu"));
//        remote.pressButton();
        System.out.println("Fido ja voltou para dentro");

    }

}