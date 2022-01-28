package interfaces;

public interface IPerson {
    public void makeSound();

    public default int srDlZycia(){
        return 89;
    }

    public final static String SPECIES = "czlowiek";

    public final static String ENVURL = "http:wp.pl";
}
