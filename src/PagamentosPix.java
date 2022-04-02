
public class PagamentosPix  extends Pagamentos {
	public PagamentosPix(String favorecido, String pagador, double valor) {
		
		super(favorecido, pagador, valor);

	}


	@Override
	public void efetuarPagamento() {
		double valorTotal = super.valor + (super.valor * 0.01);
		System.out.println("pagamento efetuado com juros de 1% " + valorTotal);
		
	}
}
