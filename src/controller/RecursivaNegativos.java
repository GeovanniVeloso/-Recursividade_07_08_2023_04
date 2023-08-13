package controller;

public class RecursivaNegativos {
	
	public RecursivaNegativos(){
		super();
	}
	//Explicação: Utiliza a mesma lógica do exercício 2 (Como a ultima posição do vetor sempre será 0, a condição de parada é definida com o tamanho do vetor VT, quando ele se torna igual a 0.
	// MV recebe a chamada da função, como uma variável temporária)
	// Quando a função chega a 0, diferente do exercício 2, ela volta fazendo a comparação entre os valores e soma os números negativos.
	public int neg ( int soma, int vetor[], int VT) {
		 if (VT == 0) {
		        return soma;
		    } else {
		        soma = neg(soma, vetor, VT - 1); 
		        if (0 > vetor[VT - 1]) {
		            soma = soma + vetor[VT - 1];
		        }
		        return soma;
		    }
	}
}
