package aula0303_java;

public class Teste {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.nome = "Seu Jair";
		cliente.cpf = "123";
		
		Conta conta = new Conta();
		conta.numeroConta = "123-1";
		conta.saldo = 100;
		conta.cliente = cliente;
		conta.cliente.cpf = "1234";
		
		System.out.println(conta.cliente.nome);
		System.out.println(conta.cliente.cpf);
		System.out.println(conta.numeroConta);
		System.out.println(conta.saldo);
	}

}
