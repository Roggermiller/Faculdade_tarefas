package operadores_condicionais;

public class TesteCondicionais {
	/*if = se
	 * else if = senão se
	 * else = senão*/
	public static void main(String[] args) {
		int opcao = 2;
		double saldo = 5.825;
		if(opcao == 3) {
			System.out.println("Consultar conta poupança");
			System.out.println("Fazer Transferência");
		}else if(opcao == 2) {
			System.out.println("fazer deposito");
		}else if (opcao == 1) {
			System.out.println("Verificar saldo"+ saldo+ "Reais");
		}else {
			System.err.println("Erro de comunicação");
		}
	}
}
