package calculadora;
/*
 * 
 * 
 */
import java.util.Scanner;

public class Calculadora_basica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, res=0;
		String sel=null;
		Scanner tec=new Scanner(System.in);
		System.out.println("Selecciona la opción\n");
		System.out.println("+: Suma");
		System.out.println("\n-: Resta");
		System.out.println("\n*: Multiplicación");
		System.out.println("\n/: División");
		System.out.println("\nR: Raíz cuadrada");
		System.out.println("\n^: elevar a 2");
		System.out.println("\nS: Salir");
		
		sel=tec.next();
		switch(sel) {
		case "+":
			System.out.println("Ha seleccionado suma\nAhora pon los valores");
			System.out.println("Pon el primer número");
			a=tec.nextInt();
			System.out.println("Pon el segundo número");
			b=tec.nextInt();
			res=a+b;
			System.out.println(a+"+"+b+"="+res);
			break;
		case "-":
			System.out.println("Ha seleccionado resta\nAhora pon los valores");
			System.out.println("Pon el primer número");
			a=tec.nextInt();
			System.out.println("Pon el segundo número");
			b=tec.nextInt();
			res=a-b;
			System.out.println(a+"-"+b+"="+res);
			break;
		case "*":
			System.out.println("Ha seleccionado multiplicación\nAhora pon los valores");
			System.out.println("Pon el primer número");
			a=tec.nextInt();
			System.out.println("Pon el segundo número");
			b=tec.nextInt();
			res=a*b;
			System.out.println(a+"*"+b+"="+res);
			break;
		case "/":
			System.out.println("Ha seleccionado división\nAhora pon los valores");
			System.out.println("Pon el primer número");
			a=tec.nextInt();
			System.out.println("Pon el segundo número");
			b=tec.nextInt();
			res=a/b;
			System.out.println(a+"/"+b+"="+res);
			break;
		case "R":
			System.out.println("Ha seleccionado Raíz cuadrada\n");
			System.out.println("Pon el número");
			a=tec.nextInt();
			double resultado = Math.sqrt(a);
			System.out.println("La raíz cuadrada de " +a+ " es " +resultado);
			break;
		case "^":
			System.out.println("Ha seleccionado elevar a 2 un número\n");
			System.out.println("Pon el número");
			a=tec.nextInt();
			double cuadrado = Math.pow(a, 2);
			System.out.println("El número elevado a 2 es " +cuadrado);
			break;
		case "S":
			System.out.println("Ha seleccionado Salir\n");
			System.out.println("Si has pulsado esta opción no llegarás a hacer ninguna operación");
			break;
		default:
			System.out.println("Esa opción no existe");
		}
		
		

	}

}
