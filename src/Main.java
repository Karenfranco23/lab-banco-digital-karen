
public class Main {

	public static void main(String[] args) {
		Cliente matheus = new Cliente();
		matheus.setNome("Matheus");
		
		Conta cc = new ContaCorrente(matheus);
		Conta poupanca = new ContaPoupanca(matheus);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		Pagamentos pag1 = new PagamentosPix("Matheus", "Eliezer", 2000);
		Pagamentos pag2 = new PagamentosBoletos("Matheus", "Eliezer", 2000);
		Pagamentos pag3 = new PagamentosCartaoCredito("Matheus", "Eliezer", 2000);
		
		pag1.efetuarPagamento();
		pag1.imprimirValor();
		pag2.efetuarPagamento();
		pag2.imprimirValor();
		pag3.efetuarPagamento();
		pag3.imprimirValor();
	}

}
