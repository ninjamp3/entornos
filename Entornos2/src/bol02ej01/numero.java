package bol02ej01;
import java.util.Scanner;
public class numero {
	
	private static int calcula_cuadrado( int num) {
		int cuadrado;
			cuadrado=num*num;
		return cuadrado;
	}

	private static boolean es_positivo(int num) {
		return num>=0;
	}

	private static void muestra_resultado(int num, int cuadrado) {
		System.out.println(num+ " es igual a "+ cuadrado);
	}

	private static int lee_num(Scanner entrada) {
		int num;
		System.out.print("Introduzca numero: ");
		num=entrada.nextInt();
		//num=entrada.Int();
		return num;
	}
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num,cuadrado; // num guardará el número que leamos // y cuadrado guardará el cuadrado de num
		num = lee_num(entrada);
		while (es_positivo(num)){
			cuadrado = calcula_cuadrado(num);
			muestra_resultado(num,cuadrado);
			num=lee_num(entrada);
		}
		
	}
}