package poo;
public class ObjetosPessoa {

	public static void main(String[] args) {

		// Criando objetos da classe Pessoa
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		//OBJETO 1
		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("Clifornia, USA");
		pessoa1.setProfissao("Ator");
		pessoa1.setCpf(56164660858l);
		pessoa1.setRg("999999999");

		//OBJETO 2
		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami, USA");
		pessoa2.setProfissao("Jogador de futebol");
		pessoa2.setCpf(33299959808l);
		pessoa2.setRg("999999998");

		//Chamando o método get() para apresentar os objetos
		System.out.println("----- OBJETO 1 -----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		System.out.println(pessoa1.getCpf());
		System.out.println(pessoa1.getRg());

		System.out.println("----- OBJETO 2 -----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
		System.out.println(pessoa2.getCpf());
		System.out.println(pessoa2.getRg());
	}
}
