import java.util.Scanner;
public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector=new Scanner(System.in);
		//Empezamos explicando de que va el programa, al usuario.
		System.out.println("El siguiente programa valorara si su nivel de motivacion para estudiar programacion.");
		
		//Preguntamos al usuario si desea comenzar con el cuestionario.
		System.out.println("¿Desea comenzar con las preguntas? (s/n)");
		char respuesta=lector.nextLine() .charAt(0);
		//Usamos la primera condicional que lleva a cabo el cuestionario.
		if (respuesta=='s'||respuesta=='S'){
			//Tenemos 3 variables, y un valor boolean que nos ayudara a entrar y salir de la estructura DO.
			//Las variables nos ayudara a llevar el promedio del cuestionario.
			int intentos=0;
			boolean aprobado=true;
			int i=0;
			int por=0;
			int j=0;
		     // Una vez el usuario de responda de manera afirmativa continuamos con el cuestionario de ocho preguntas.
			do {
				System.out.println("Pulse una tecla para continuar.");
				//Limpiamos buffer y empezamos el conteo de preguntas y el de respuestas que sumaran a nuestro porcentaje deseado.
				String res="";
			    lector.nextLine();
				System.out.println("¿Te gustan las computadoras? (si/no)");
				res=lector.nextLine();
				j++;
				if (res.equals("si")) {
					i++;
				}else {
					;
				}
				System.out.println("¿Disfrutas de la resolucion de los problemas? (si/no)");
				res=lector.nextLine();
				j++;
				if (res.equals("si")) {
					i++;
				}else {
					;
				}
				System.out.println("¿Quieres trabajar en equipo? (si/no)");
				res=lector.nextLine();
				j++;
				if (res.equals("si")) {
					i++;
				}else {
					;
				}
				System.out.println("¿Te agrada aprender por descubrimiento?, o prefieres que te indiquen las cosas paso a paso. (si/no)");
				res=lector.nextLine();
				j++;
				if (res.equals("si")) {
					i++;
				}else {
					;
				}
				System.out.println("¿Eres creativo? (si/no)");
				res=lector.nextLine();
				j++;
				if (res.equals("si")) {
					i++;
				}else {
					;
				}
				System.out.println("¿Eres resolutivo? (si/no)");
				res=lector.nextLine();
				j++;
				if (res.equals("si")) {
					i++;
				}else {
					;
				}
				System.out.println("¿Te rindes al primer intento? (si/no)");
				res=lector.nextLine();
				j++;
				if (res.equals("no")) {
					i++;
				}else {
					;
				}
				System.out.println("¿Estas dispuesto a tener que actualizar tu conocimiento a lo largo de tu vida? (si/no)");
				res=lector.nextLine();
				j++;
				if (res.equals("si")) {
					i++;
				}else {
					;
				}
				
				//Una vez acabamos el cuestionario usamos las dos variables para sacar el porcentaje.
				por=(i*100)/j;
			
			//Usamos 3 condicionales que si en su primer intento, logra el 80% de respuestas deseadas, sale de la estructura DO con su mensaje respectivo.	
			if (intentos==0 && por>=80) {
				aprobado=false;
				
			}//Si no lo logra en su primer intento y se le hara saber que tiene 2 intentos mas.
			else if (intentos==0 && por<=80) {
				System.out.println("No haz alcanzado el porcentaje deseado debes repetir dos veces mas el examen.");
			}else if (intentos==1) {
				System.out.println("Te queda una ultima oportunidad ¡¡ Demuestra que vales para la programacion.");
			}
				
			          
				
			//Si no ha salido de la estructura DO en su primer intento, estas dos variables nos determinara para seguir y saber el porcentaje deseado al finalizar los 3 intentos.	
			i++;	
			intentos ++;	
			}while( intentos<3 && aprobado==true && j<=24);
			//Usamos otras tres condicionales que segun cual fue su resultado , le informara al usuario si aprobo el cuestionario o no.
			if (aprobado==false) {
				System.out.println("Enhorabuena¡¡ estas echo para la pragamacion.");
			}
			else if(por>=50) {
				System.out.println("Enhorabuena¡¡ Tu motivacion es mas que suficiente para estudiar programacion.");
			}
			else {
				System.out.println("Te has quedado sin intentos, tu motivacion no es la suficiente para estudiar programacion, comunicate con un profesor.");
			}
			}
			// Si el usuario no desea participar del cuestionario y no entra en la primera condicional, seguido de salir del  programa.
		else {
			
			System.out.println("Como no deseas participar en el programa o introduciste algo que no se te pidio se cierra el programa.");
		}
	//Salida del programa	
	System.out.println("El programa ha finalizado, Hasta luego¡¡");
	}
	}


