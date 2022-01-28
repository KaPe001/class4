package interfaces;

public class Child_interface implements IPerson, IMammal {

    @Override
    public void makeSound() {
        System.out.println("duzo placze");
    }

    @Override
    public void jakJem() {
        System.out.println("mleczko jem");
    }
}
