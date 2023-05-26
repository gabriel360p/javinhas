
import java.util.Scanner;
public class Main{

	public static void main(String[] args){
		Scanner ler= new Scanner(System.in);
		Agenda agenda = new Agenda();
		Amigo amigo = new Amigo("Mateus",19,"20/12/2002");
		Conhecido known = new Conhecido("Carol","opa@opa",19);

		boolean on1=true;
		while(on1==true){
			System.out.println("|Olá seja bem vindo a Swift Diary");
			System.out.println("|Escolha uma opção:");
			System.out.println("|(0)Sair");
			System.out.println("|(1)Adicionar Pessoa");
			System.out.println("|(2)Mostrar Pessoas");

			switch(ler.nextInt()){
				case 1:
					Amigo amg = new Amigo("null",0,"");
					System.out.println("|Adicionar um Nome");
					ler.nextLine();
					amigo.setName(ler.nextLine());


					System.out.println("|Adicionar uma Idade");
					amg.setAge(ler.nextInt());

					System.out.println("|Adicionar uma Data de Aniversário");
					amg.setBirthday(ler.nextLine());

					agenda.add(amg);
				break;

				case 2:
					agenda.show();
				break;

			}
		}
		// agenda.add(known);

	























	}

}