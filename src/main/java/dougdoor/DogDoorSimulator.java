package dougdoor;

public class DogDoorSimulator{

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);

        Remote remote = new Remote(door);
        System.out.println("Fido late para sair");
//        remote.pressButton();
        recognizer.recognizer("Au au!");
        System.out.println("Fido saiu");
        System.out.println("Fido ja terminou");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e){
            System.out.println("Ops...");
        }
        System.out.println("Fido late para entrar...");
        recognizer.recognizer("Au au!");
//        remote.pressButton();
        System.out.println("Fido ja voltou para dentro");
    }

}