import java.util.Scanner;

class Interface{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		Produto p = new Produto();
		Produto produtos_totais[];

		float soma_valores=0;
		float mais_valioso=0;
		String item_valioso = "";
		
		System.out.println("digite a quantidade de produtos:");
		produtos_totais = new Produto[sc.nextInt()];
		for(int i = 0; i < produtos_totais.length;i++){
			
			produtos_totais[i] = new Produto();
			System.out.println("digite o nome do seu produto " + (i+1) + ":");
			produtos_totais[i].nome = sc.next();
			System.out.println("digite a quantidade:");
			produtos_totais[i].quantidade = sc.nextInt();
			System.out.println("digite o valor unitario:");
		    produtos_totais[i].valor_unitario = sc.nextFloat();
		    soma_valores += produtos_totais[i].valor_total();
		    
		    if(produtos_totais[i].quantidade > 1){
		    	produtos_totais[i].unidade = "caixa";
		    }else{
		    	produtos_totais[i].unidade = "unidade";
		    }
		    
		    if(produtos_totais[i].valor_total() > mais_valioso){
		    	mais_valioso = produtos_totais[i].valor_total();
		    	item_valioso = produtos_totais[i].nome;
		    }


		}
		System.out.println("\n");
			System.out.println("codigo"+ "\t" + " nome:" + "\t" + "  quantidade: " + "\t" +"estoque:" + "\t" + "valor total:" + "\t");
			System.out.println("\n");
		for(int i = 0; i < produtos_totais.length; i++){
			System.out.println((i+1) +" \t"+ produtos_totais[i].nome + " \t"+  produtos_totais[i].quantidade +"\t"+ produtos_totais[i].unidade+"   \t"+ produtos_totais[i].valor_total() +" \t\n");
		}
		System.out.println("somando o valor total de todos os itens: " + soma_valores);
		System.out.println("o item mais valioso é " + item_valioso + " custando: " + mais_valioso);

	}
}