package view;

import controller.RecursivaNegativos;

public class Principal {

	public static void main(String[] args) {
		RecursivaNegativos rn = new RecursivaNegativos();
		
		int VT = 5;
		int soma = 0;
		int[] vetor = {-7,4,-1,6,-9};
		
		int res = rn.neg(soma, vetor, VT);
		
		System.out.println(res);

	}

}
