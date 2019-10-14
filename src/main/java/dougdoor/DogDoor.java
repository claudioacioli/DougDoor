package dougdoor;

public class DogDoor{

    private boolean open;

    public DogDoor(){
        this.open = false;
    }

    public void open(){
        System.out.println("A porta para cachorro abre.");
        open = true;
    }

    public void close(){
        System.out.println("A porta para cachorros fecha.");
        open = false;
    }

    public boolean isOpen(){
        return open;
    }

}