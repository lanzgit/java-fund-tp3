package test;

public class SplitName {

	public static void main(String[] args) {
		

		String nomeTodo = "Vinicius Cesar Vianna";
		String primeiroNome;
		String nomeMeio;
		String ultimoNome;


		primeiroNome = nomeTodo.substring(0, nomeTodo.indexOf(" "));
		nomeMeio = nomeTodo.substring(nomeTodo.indexOf(" "), nomeTodo.lastIndexOf(" ")).trim();
		ultimoNome = nomeTodo.substring(nomeTodo.lastIndexOf(" ")).trim();

		System.out.println(primeiroNome);
		System.out.println(nomeMeio);
		System.out.println(ultimoNome);

	}
	

}
