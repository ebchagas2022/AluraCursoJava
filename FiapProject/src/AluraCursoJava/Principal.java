package AluraCursoJava;

public class Principal {

	public static void main(String[] args) {
		
		Filme filme = new Filme();
		filme.nome = "O Podereso Chefão";
		filme.anoDeLancamento = 1970;
		filme.duracaoEmMinutos = 180;
		
		System.out.println("Nome do filme: " + filme.nome);
				

	}

}
