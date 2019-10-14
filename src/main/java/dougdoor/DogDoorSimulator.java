package dougdoor;

public class DogDoorSimulator{

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Fido late para sair");
        remote.pressButton();
        System.out.println("\nFido saiu");
        remote.pressButton();
        System.out.println("\nFido ja terminou");
        remote.pressButton();
        System.out.println("\nFido ja voltou para dentro");
        remote.pressButton();
    }

}