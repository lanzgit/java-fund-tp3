package test;

public class SplitName {

	public static void main(String[] args) {
		

		String nomeTodo = "Vinicius Cesar Vianna";
		String primeiroNome;
		String nomeMeio;
		String ultimoNome;


		primeiroNome = nomeTodo.substring(0, nomeTodo.indexOf(" "));
		nomeMeio = nomeTodo.substring(nomeTodo.indexOf(" ") + 1, nomeTodo.lastIndexOf(" "));
		ultimoNome = nomeTodo.substring(nomeTodo.lastIndexOf(" ") + 1);

		System.out.println(primeiroNome);
		System.out.println(nomeMeio);
		System.out.println(ultimoNome);

	}
	

}
