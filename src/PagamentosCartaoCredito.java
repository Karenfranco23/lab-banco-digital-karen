
public class PagamentosCartaoCredito extends Pagamentos {
		public PagamentosCartaoCredito(String favorecido, String pagador, double valor) {
		
		super(favorecido, pagador, valor);
		
		}


		@Override
		public void efetuarPagamento() {
			double valorTotal = super.valor + (super.valor * 0.015);
			System.out.println("pagamento efetuado com juros de 1.5% " + valorTotal);
			
		}
		
}