public class Amigo extends Pessoa{
    private String birthday;

    public Amigo(String name,int age,String birthday) {
        super(name, age);
        this.birthday = " ";
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


}