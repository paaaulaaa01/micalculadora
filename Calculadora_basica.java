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
		System.out.println("Selecciona la opci�n\n");
		System.out.println("+: Suma");
		System.out.println("\n-: Resta");
		System.out.println("\n*: Multiplicaci�n");
		System.out.println("\n/: Divisi�n");
		System.out.println("\nR: Ra�z cuadrada");
		System.out.println("\n^: elevar a 2");
		System.out.println("\nS: Salir");
		
		sel=tec.next();
		switch(sel) {
		case "+":
			System.out.println("Ha seleccionado suma\nAhora pon los valores");
			System.out.println("Pon el primer n�mero");
			a=tec.nextInt();
			System.out.println("Pon el segundo n�mero");
			b=tec.nextInt();
			res=a+b;
			System.out.println(a+"+"+b+"="+res);
			break;
		case "-":
			System.out.println("Ha seleccionado resta\nAhora pon los valores");
			System.out.println("Pon el primer n�mero");
			a=tec.nextInt();
			System.out.println("Pon el segundo n�mero");
			b=tec.nextInt();
			res=a-b;
			System.out.println(a+"-"+b+"="+res);
			break;
		case "*":
			System.out.println("Ha seleccionado multiplicaci�n\nAhora pon los valores");
			System.out.println("Pon el primer n�mero");
			a=tec.nextInt();
			System.out.println("Pon el segundo n�mero");
			b=tec.nextInt();
			res=a*b;
			System.out.println(a+"*"+b+"="+res);
			break;
		case "/":
			System.out.println("Ha seleccionado divisi�n\nAhora pon los valores");
			System.out.println("Pon el primer n�mero");
			a=tec.nextInt();
			System.out.println("Pon el segundo n�mero");
			b=tec.nextInt();
			res=a/b;
			System.out.println(a+"/"+b+"="+res);
			break;
		case "R":
			System.out.println("Ha seleccionado Ra�z cuadrada\n");
			System.out.println("Pon el n�mero");
			a=tec.nextInt();
			double resultado = Math.sqrt(a);
			System.out.println("La ra�z cuadrada de " +a+ " es " +resultado);
			break;
		case "^":
			System.out.println("Ha seleccionado elevar a 2 un n�mero\n");
			System.out.println("Pon el n�mero");
			a=tec.nextInt();
			double cuadrado = Math.pow(a, 2);
			System.out.println("El n�mero elevado a 2 es " +cuadrado);
			break;
		case "S":
			System.out.println("Ha seleccionado Salir\n");
			System.out.println("Si has pulsado esta opci�n no llegar�s a hacer ninguna operaci�n");
			break;
		default:
			System.out.println("Esa opci�n no existe");
		}
		
		

	}

}
