package AgoDic17.Mi20170913;

/**
 * @author Emmanuel Rocha AVila
 * @description 	Ejemplo 1.1 c)
 * 					Seg�n dos n�meros dados por el usuario,
 * 					realizar las operaciones b�sicas de 
 * 					suma, resta, multiplicaci�n y divisi�n, 
 * 					e mprimir resultados.
 * @date 13/Sep/2017
 */

public class Ejemplo_11c {
	
	//Atributos
	//>Declaraci�n de la variable: "public float num1;"
	//>Inicializaci�n de la variable: "num1=0;"
	//entrada
	public float num1,num2;
	//salida
	public float suma,resta,multiplicacion,division;
	//validaci�n
	public boolean validacion;
	
	//M�todos
	//validar
	public boolean validar (float n1, float n2){
		boolean correcto;
		if(n2!=0){
			correcto=true;
		}else{
			correcto=false;
		}
		
		return correcto;
	}
	
	//sumar
	public float sumar(float n1,float n2){
		float res;
		res=n1+n2;
		return res;
	}
	//>De tarea terminar los dem�s m�todos.
	//restar
	//multiplicar
	//dividir
	
}
