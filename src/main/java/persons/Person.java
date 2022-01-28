package persons;
//klasa model
public class Person {
    private int age;
    protected static final String species = "person";

    public String myActivity(String activity){
        return "Myślę, więc jestem" + activity;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(int age) {
        return age;
    }



}
