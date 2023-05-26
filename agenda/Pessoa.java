public class Pessoa{
    protected String name;
    protected int age;

    public Pessoa() {
    }

    public Pessoa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "|Nome da Pessoa: "+getName()+" |Idade da Pessoa: "+getAge();
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}