package poo;

public class ObjetosCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();

		cliente1.setId(1234);
		cliente1.setNome("Carlos");
		cliente1.setTelefone(991999999);
		cliente1.setCpf(56164660858l);
		cliente1.setRg(999999999);
		cliente1.setReclamar("Pedido não entregue");
		cliente1.setElogiar("Produto bom");
		cliente1.setPagar("R$20,00");
		cliente1.setPedir("Garrafinha");
		

		cliente2.setId(4321);
		cliente2.setNome("José");
		cliente2.setTelefone(991999998);
		cliente2.setCpf(56164660878l);
		cliente2.setRg(999999997);
		cliente2.setReclamar("Produto com defeito");
		cliente2.setElogiar("Produto excelente");
		cliente2.setPagar("R$50,00");
		cliente2.setPedir("Carregador");

		System.out.println("-----OBJETO 1-----");
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		System.out.println(cliente1.getReclamar());
		System.out.println(cliente1.getElogiar());
		System.out.println(cliente1.getPagar());
		System.out.println(cliente1.getPedir());

		System.out.println("-----OBJETO 2-----");
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());
		System.out.println(cliente2.getReclamar());
		System.out.println(cliente2.getElogiar());
		System.out.println(cliente2.getPagar());
		System.out.println(cliente2.getPedir());
	}
}
