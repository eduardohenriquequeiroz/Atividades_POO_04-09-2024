package poo;

public class ObjetosAnimal {

	public static void main(String[] args) {

		//Criando objetos da classe Animal
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		Animal animal4 = new Animal();
		Animal animal5 = new Animal();
		Animal animal6 = new Animal();
		Animal animal7 = new Animal();
		Animal animal8 = new Animal();


		//OBJETO 1
		animal1.setEspecie("Vaca");
		animal1.setFasesVida("Adulto");
		animal1.setListra("Zebra");
		animal1.setCor("Branco e preto");
		animal1.setVelocidade("Até 40 km/h");
		animal1.setEmitirSom("Mugir");
		animal1.setVoar("Não");
		animal1.setComer("Capim");

		//OBJETO 2
		animal2.setEspecie("Vaca");
		animal2.setFasesVida("Filhote");
		animal2.setListra("Zebra");
		animal2.setCor("Branco e preto");
		animal2.setVelocidade("Até 40 km/h");
		animal2.setEmitirSom("Mugir");
		animal2.setVoar("Não");
		animal2.setComer("Capim");

		//OBJETO 3
		animal3.setEspecie("Ovelha");
		animal3.setFasesVida("Filhote");
		animal3.setListra("Não");
		animal3.setCor("Amarelo");
		animal3.setVelocidade("Até 20 km/h");
		animal3.setEmitirSom("Balidos");
		animal3.setVoar("Não");
		animal3.setComer("Pasto");

		//OBJETO 4
		animal4.setEspecie("Cachorro");
		animal4.setFasesVida("Filhote");
		animal4.setListra("Amarelo e marrom");
		animal4.setCor("Não");
		animal4.setVelocidade("Até 30 km/h");
		animal4.setEmitirSom("Late");
		animal4.setVoar("Não");
		animal4.setComer("Ração");

		//OBJETO 5
		animal5.setEspecie("Coelho");
		animal5.setFasesVida("Adulto");
		animal5.setListra("Não");
		animal5.setCor("Marrom");
		animal5.setVelocidade("Até 40 km/h");
		animal5.setEmitirSom("Zumbido");
		animal5.setVoar("Não");
		animal5.setComer("Cenoura");

		//OBJETO 6
		animal6.setEspecie("Coelhos");
		animal6.setFasesVida("Filhote");
		animal6.setListra("Não");
		animal6.setCor("Branco e preto");
		animal6.setVelocidade("Até 40 km/h");
		animal6.setEmitirSom("Zumbido");
		animal6.setVoar("Não");
		animal6.setComer("Cenoura");

		//OBJETO 7
		animal7.setEspecie("Pintinho");
		animal7.setFasesVida("Filhote");
		animal7.setListra("Não");
		animal7.setCor("Amarelo");
		animal7.setVelocidade("Até 5 km/h");
		animal7.setEmitirSom("Piu, piu, piu");
		animal7.setVoar("Não");
		animal7.setComer("Milho");

		//OBJETO 8
		animal8.setEspecie("Galinha");
		animal8.setFasesVida("Adulto");
		animal8.setListra("Não");
		animal8.setCor("Branco");
		animal8.setVelocidade("Até 14 km/h");
		animal8.setEmitirSom("Cacarejar");
		animal8.setVoar("Sim");
		animal8.setComer("Milho");

		//Chamando o método get() para apresentar os dados
		System.out.println("----- OBJETO 1 -----");
		System.out.println(animal1.getEspecie());
		System.out.println(animal1.getFasesVida());
		System.out.println(animal1.getListra());
		System.out.println(animal1.getCor());
		System.out.println(animal1.getVelocidade());
		System.out.println(animal1.getEmitirSom());
		System.out.println(animal1.getVoar());
		System.out.println(animal1.getComer());

		System.out.println("----- OBJETO 2 -----");
		System.out.println(animal2.getEspecie());
		System.out.println(animal2.getFasesVida());
		System.out.println(animal2.getListra());
		System.out.println(animal2.getCor());
		System.out.println(animal2.getVelocidade());
		System.out.println(animal2.getEmitirSom());
		System.out.println(animal2.getVoar());
		System.out.println(animal2.getComer());

		System.out.println("----- OBJETO 3 -----");
		System.out.println(animal3.getEspecie());
		System.out.println(animal3.getFasesVida());
		System.out.println(animal3.getListra());
		System.out.println(animal3.getCor());
		System.out.println(animal3.getVelocidade());
		System.out.println(animal3.getEmitirSom());
		System.out.println(animal3.getVoar());
		System.out.println(animal3.getComer());

		System.out.println("----- OBJETO 4 -----");
		System.out.println(animal4.getEspecie());
		System.out.println(animal4.getFasesVida());
		System.out.println(animal4.getListra());
		System.out.println(animal4.getCor());
		System.out.println(animal4.getVelocidade());
		System.out.println(animal4.getEmitirSom());
		System.out.println(animal4.getVoar());
		System.out.println(animal4.getComer());

		System.out.println("----- OBJETO 5 -----");
		System.out.println(animal5.getEspecie());
		System.out.println(animal5.getFasesVida());
		System.out.println(animal5.getListra());
		System.out.println(animal5.getCor());
		System.out.println(animal5.getVelocidade());
		System.out.println(animal5.getEmitirSom());
		System.out.println(animal5.getVoar());
		System.out.println(animal5.getComer());

		System.out.println("----- OBJETO 6 -----");
		System.out.println(animal6.getEspecie());
		System.out.println(animal6.getFasesVida());
		System.out.println(animal6.getListra());
		System.out.println(animal6.getCor());
		System.out.println(animal6.getVelocidade());
		System.out.println(animal6.getEmitirSom());
		System.out.println(animal6.getVoar());
		System.out.println(animal6.getComer());

		System.out.println("----- OBJETO 7 -----");
		System.out.println(animal7.getEspecie());
		System.out.println(animal7.getFasesVida());
		System.out.println(animal7.getListra());
		System.out.println(animal7.getCor());
		System.out.println(animal7.getVelocidade());
		System.out.println(animal7.getEmitirSom());
		System.out.println(animal7.getVoar());
		System.out.println(animal7.getComer());

		System.out.println("----- OBJETO 8 -----");
		System.out.println(animal8.getEspecie());
		System.out.println(animal8.getFasesVida());
		System.out.println(animal8.getListra());
		System.out.println(animal8.getCor());
		System.out.println(animal8.getVelocidade());
		System.out.println(animal8.getEmitirSom());
		System.out.println(animal8.getVoar());
		System.out.println(animal8.getComer());
	}
}
