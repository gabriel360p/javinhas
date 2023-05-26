
public class Main{

	public static void main(String[] args){
		Agenda agenda = new Agenda();
		Amigo amigo = new Amigo("Mateus",19,"20/12/2002");
		Conhecido known = new Conhecido("Carol","opa@opa",19);

		agenda.add(amigo);
		agenda.add(known);
		agenda.show();
























	}

}