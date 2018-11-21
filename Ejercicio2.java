//Metodo de la burbuja:

import java.util.Scanner;
public class Ejercicio2{
	
public static void main(String args []){
Scanner sc = new Scanner(System.in);
System.out.println("cuantos numeros se van a ingresar");
int x = sc.nextInt();
int c[] = new int[x];
for (int a = 0;a < x ;a++ ) {
	c[a]= sc.nextInt();
}





int b[] = {21,28,36,15,2,95,7,1};
	

	ej2.burbuja(c);
	ej2.mostrar(c);


	}
public static void burbuja(int c[]){

		for (int i=0; i<c.length ; i++) {
			for (int j=0;j<c.length-1;j++ ) {
				if(c[j]<c[j+1]){
					int aux =c[j];
					c[j] = c[j+1];
					c[j+1]= aux;
				}				
			}
		}

}
public static void mostrar(int c[]){
	for (int i=0;i<c.length ;i++ ) {
		System.out.print(c[i]+" ");
	}System.out.print(" ");


}

}