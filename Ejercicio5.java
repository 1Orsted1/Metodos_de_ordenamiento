// metodo shell short
import java.util.Arrays;

public class Ejercicio5{
public static void main(String args[]){
int arreglo[] ={3,7,5,1,6,9,8,4,2};
//operador termario abajo.
for (int i = arreglo.length/2;i>0 ;i=(i == 2 ? 1 :(int)Math.round(i/2.2) ) ) {
	for (int j = i ;j < arreglo.length ; j++ ) {
		for (int k = j; k >= i && arreglo[j-i]>arreglo[k];k-=i ) {
			int aux = arreglo[k];
			arreglo[k]=arreglo[k-i];
			arreglo[k-i]=aux;
		}
	}
}
System.out.println(Arrays.toString(arreglo));
System.out.println("Este es el arreglo");



}
}