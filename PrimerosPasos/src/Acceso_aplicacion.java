import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave="Kevin";
		
		String pass="";
		
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseņa");
			
			if(clave.equals(pass)==false) {
				
				System.out.println("contraseņa incorrecta");
			}
		
	}

		System.out.println("Contraseņa correcta. Acceso permitido");
  }
}
