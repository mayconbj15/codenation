package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

import br.com.codenation.TestadorFibonacci;
import br.com.codenation.annotation.Desafio;

public class DesafioApplication {
	public static List<Integer> fibonacci;

	public static void main(String[] args) {
		new TestadorFibonacci().testaDesafio(DesafioApplication.class);
	}

	@Desafio("Fibonacci")
	public static List<Integer> fibonacci() {
		int sum = 0;
		int i=2;
		fibonacci = new ArrayList<>();
		
		fibonacci.add(0);
		fibonacci.add(1);

		sum = sum(fibonacci.get(i-1), fibonacci.get(i-2));
		
		do{
			fibonacci.add(sum);
			i++;
			
			sum = sum(fibonacci.get(i-1), fibonacci.get(i-2));
		} while(sum < 350);
		
		return fibonacci;
	}

	@Desafio("isFibonacci")
	public static Boolean isFibonacci(Integer a) {
		return fibonacci.contains(a);
	}
	
	public static Integer sum(Integer x, Integer y) {
		return x+y;
	}

}
