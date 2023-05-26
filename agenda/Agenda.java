import java.util.ArrayList;

public class Agenda{
    private int friends;       
    private int known;       

    ArrayList peoples = new ArrayList();

    public void add(Pessoa pessoa){
        peoples.add(pessoa);
        System.out.println("|"+pessoa.getName()+" Inserida!");
    }

    public void show(){
        for(int i=0;i<peoples.size();++i){
            System.out.println("|"+peoples.get(i).toString());
        }
    }

    public Agenda() {
    }

    public int getFriends() {
        return this.friends;
    }

    public void setFriends(int friends) {
        this.friends = friends;
    }

    public int getKnown() {
        return this.known;
    }

    public void setKnown(int known) {
        this.known = known;
    }

}