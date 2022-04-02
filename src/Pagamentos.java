
public abstract class Pagamentos implements IPagamentos {
	protected String favorecido;
	protected String pagador;
	protected double valor;
	
	public Pagamentos(String favorecido, String pagador, double valor) {
		this.favorecido = favorecido;
		this.pagador = pagador;
		this.valor = valor;
		
	}
	
	@Override
	public void imprimirValor() {
		// TODO Auto-generated method stub
	System.out.println("o valor do pagamento �: " + this.valor);	
	System.out.println("o nome do favorecido �: " + this.favorecido);
	System.out.println("o nome do pagador �: " + this.pagador);
	}

	
}
