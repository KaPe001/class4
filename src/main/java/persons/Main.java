package persons;

import interfaces.Child_interface;
import interfaces.IPerson;
import persons.Child;
import persons.Parent;
import persons.Person;

public class Main {
    public static void main(String[] args){
        //------------------------------------------- dziedziczenie
        Person person = new Person();

        Parent mother = new Parent();

        Parent father = new Parent();

        Child brajanek = new Child();

        Cat cat = new Cat();

        Person[] personTable = new Person[4];
        personTable[0] = person;
        personTable[1] = mother;
        personTable[2] = father;
        personTable[3] = brajanek;
        //personTable[4] = cat; //kot nie jest dziedziczony od person, dlatego nie moze byc wsadzony do tablicy

        for (Person o: personTable) {
            System.out.println(o.myActivity("manager"));
        }

        //---------------------------------------------------

        String mojeSrod = IPerson.ENVURL;

        IPerson iPerson = new Child_interface();
        //WebDriver driver = new ChromeDriver();


        }
}
