public class Conhecido extends Pessoa{
    private String email;

    public Conhecido(String name,String email,int age) {
        super(name, age);
        this.email =" ";
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}