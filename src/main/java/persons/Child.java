package persons;

public class Child extends Person{
    private String school;

    @Override
    public String myActivity(String position) {
        String myPosition;
        switch (position) {
            case "uczen":
                myPosition =  "Jestem uczniem";
                break;
            case "student":
                myPosition =  "Jestem studentem";
                break;
            default:
                myPosition = "Jestem szczesliwym dzieckiem i mieszkam z rodzicami ";
        }
        return myPosition;
    }

    public Child(String school) {
        this.school = school;
    }

    public Child() {
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
