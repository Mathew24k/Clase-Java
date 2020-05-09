import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave="Kevin";
		
		String pass="";
		
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseña");
			
			if(clave.equals(pass)==false) {
				
				System.out.println("contraseña incorrecta");
			}
		
	}

		System.out.println("Contraseña correcta. Acceso permitido");
  }
}
