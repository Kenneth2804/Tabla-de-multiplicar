import java.util.Scanner;
public class C1_TablaDeMultiplicar {
	public static void main(String[] args) {
	String otra="s";
		while (otra=="s"){
		
		System.out.println("****Tabla de Multiplicar****");
		
		int num;
		int re;
		int otro;
		Scanner Cosa = new Scanner(System.in);
		
		System.out.print("Ingrese Numero" );
		num = Cosa.nextInt();
		
		
	for (otro=1; otro<11; otro++){
		re=num*otro;
		System.out.println(num+ " X " + otro + " = " + re);
	}
	System.out.println("Si Desea Otra Operacion Presione [s]");
		
	otra = Cosa.next();
	otra="s";
		}
        }
	    }