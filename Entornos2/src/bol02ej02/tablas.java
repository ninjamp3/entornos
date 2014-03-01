package bol02ej02;
import java.util.Scanner;
public class tablas {
	
	private static Scanner leer_num() {
		Scanner entrada=new Scanner(System.in);
		return entrada;
	}
	
	private static void generar_tabla(Scanner entrada, int[] a) {
		int i;
		System.out.println("Leyendo la tabla ");
		for (i=0;i<10;i++){
			System.out.print("nÃºmero: ");
			a[i]=entrada.nextInt();
		}
	}
	
	private static void generar_mezcla(int[] a, int[] b, int[] c) {

		// asignaremos los elementos de la tabla c
		// para las tablas a y b utilizaremos como Ã ndice i
		// y para la tabla c utilizaremos como Ã ndice j.
		int i;
		int j;
		j=0;
		for (i=0;i<10;i++){
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
		}
	}

	private static void mostrar_tabla(int[] c) {
		int j;
		System.out.println("La tabla c queda: ");
		for (j=0;j<20;j++){ // seguimos utilizando j, para la tabla c. Aunque se podrÃ a utilizar i.
			System.out.print(c[j]+" ");
		}
		System.out.println(" ");
	}
	public static void main(String[] args) {
		Scanner entrada = leer_num();
		int a[], b[], c[];
		a=new int[10];
		b=new int[10];
		// la tabla c tendrÃ¡ que tener el doble de tamaÃ±o que a y b.
		c = new int [20];
	
		// leemos la tabla a
		generar_tabla(entrada, a);
		// leemos la tabla b
		generar_tabla(entrada,b);

		generar_mezcla(a, b, c);
		//mostrar los resultados
		mostrar_tabla(c);
	}

}