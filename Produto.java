class Produto{
	String nome;
	String unidade;
	int quantidade;
	float valor_unitario;

	public float valor_total(){
		return quantidade * valor_unitario;
	}
}