public class funcoesInteressantes {
	
	public static void main(String[] args) {
		
		String original = "Estou cursando Java pela Udemy";
		
		System.out.println(original);
		
		//Deixa as letras minusculas
		String lowercase = original.toLowerCase();
		
		System.out.println(lowercase);
		
		//Deixa as letras maiusculas
		String uppercase = original.toUpperCase();
		
		System.out.println(uppercase);
		
		//Substitui uma parte pelo que vc quiser
			String subs = original.replace('a', 'x');
					
			System.out.println(subs);
	}

}
