package dougdoor;

public class Remote{

    private DogDoor door;

    public Remote(DogDoor door){
        this.door = door;
    }

    public void pressButton(){
        System.out.println("Pressionando o botao no controle remoto");
        if(door.isOpen())
            door.close();
        else
            door.open();
    }
}