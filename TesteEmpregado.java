package PortoSeguro;


public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado [] lista = new Empregado [3];
		
		lista [0] = new Empregado  ("Ana K�lvia ", 10000 );
		lista [1] = new Empregado  ("Ana K�lvia ", 11000 );
		lista [2] = new Empregado  ("Ana K�lvia ", 30000 );
		
		for (Empregado roda:lista) 
		{
			roda.imprimir();
		}
		
		System.out.println("*************************");
		for (Empregado roda:lista) 
		{
			roda.aumentarSalario(10);
			roda.imprimir();
		}
		
	}
	
}
