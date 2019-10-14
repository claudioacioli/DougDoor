package dougdoor;

public class DogDoorSimulator{

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Fido late para sair");
        remote.pressButton();
        System.out.println("Fido saiu");
        System.out.println("Fido ja terminou");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e){
            System.out.println("Ops...");
        }
        System.out.println("Fido late para entrar...");
        remote.pressButton();
        System.out.println("Fido ja voltou para dentro");
    }

}