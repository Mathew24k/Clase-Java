import java.util.*;
import javax.swing.*;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);

		System.out.println("Elige una opci�n: \n1: Cuadrado \n2: Rectangulo \n3: Tri�ndulo \n4: C�rculo");
	
		int figura=entrada.nextInt();
		
		switch(figura) {
		
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			
			System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
			
			break;
		}
	}

}
