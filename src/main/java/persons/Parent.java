package persons;

public class Parent extends Person {
    private String mySpecies = Person.species;
    private String position  ;

    @Override
    public String myActivity(String position) {
        String myPosition;
        switch(position) {
            case "tester":
                myPosition =  "Jestem testerem";
                break;
            case "manager":
                myPosition =  "Jestem managerem";
                break;
            default:
                myPosition = "Jestem rodzicem i mam odpowiednie kwalifikacje do tego zawodu ";
        }

        return myPosition;
    }

    public Parent(){
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
