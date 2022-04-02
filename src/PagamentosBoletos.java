
public class PagamentosBoletos extends Pagamentos {
	public PagamentosBoletos(String favorecido, String pagador, double valor) {
		
		super(favorecido, pagador, valor);
			
	}

	@Override
	public void efetuarPagamento() {
		double valorTotal = super.valor + (super.valor * 0.02);
		System.out.println("pagamento efetuado com juros de 2% " + valorTotal);	
	}
	
}
