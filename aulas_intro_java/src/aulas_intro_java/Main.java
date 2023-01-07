package aulas_intro_java;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		double x = 10.35784;
		
		//Sem pular linha
		System.out.print(x);
		//Pulando linha
		System.out.println(x);
		
		//determinar a quantidade de casas impressas
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		//Trocar , por . (modo americano) obs. Locale importado
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		//Concatenar = juntar
		System.out.println("Resultado = " + x + " METROS");
		
		//Concatenar limitando casas decimais (%n = quebra de linha)
		
		
		//valor de x entra no lugar de %.2f
		System.out.printf("Resultado = %.2f metros%n" , x );
		
		//Impressão de vários valores interpolados dentro de String (duas formas)
		
		String nome = "Clara";
		int idade = 27;
		double renda = 4000.0;
		
		//%s = Texto; %d = Inteiro; %f = Ponto Flutuante;        {variaveis na mesma ordem}
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais", nome, idade, renda);
		System.out.println(nome + " tem " + idade + " anos e ganha R$ " + renda + " reais");
		
		// Calcular área de um trapézio com double
		
		double b, B, h, area1;
		// Boa prática colocar a casa decimál (x.0)em double, independente do valor.
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area1 = (b+B) /2 *h;
		
		System.out.println(area1);
		
		// Calcular área de um trapézio com tipo Float
		
		float c, C, H, area2;
		//boa prática adicionar (f) como float
		
		c = 6f;
		C = 8F;
		H = 5f;
		area2 = (c+C) /2f *H;
		
		System.out.println(area2);
		
		//Casting = conversão explícita de um tipo para outro. Nesse caso será perdida a casa decimal (ATENÇÃO!!!)
		double d;
		int i;
		d = 5.0;
		i = (int) d;
		System.out.println(i);
		
		/* entrada de dados (criar a variavel Scanner e importar Scanner{import java.util.Scanner} )
		 quando não for utilizar mais o Scanner, terminar sc.close();*/
		
		
		Scanner sc = new Scanner(System.in);
		
		String z;
		
		//comando de entrada de dados adicionadas na variavel
		z = sc.next();
		
		//sysout + ctrl + espaço = auto completar função de impressão
		System.out.println("Você digitou: " + z);
		// entrada de numero inteiro adicionada a variavel
		
		int w;
		w = sc.nextInt();
		System.out.println("Você escolheu: " + w);
		
		// 
		double k;
		/*entrada em double (não podendo utilizar "." se a maquina está confugirada
		como português do Brasil, pois dará erro)*/
		k = sc.nextDouble();
		System.out.println("Você escolheu: " + k);
		

		
		//termino da variável Scanner
		sc.close();
	}
	

}
