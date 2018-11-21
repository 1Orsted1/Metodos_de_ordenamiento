//Metodo de ordenamiento:

public class Ejercicio4{
public static void main(String args[]){
int arreglo[] ={3,7,5,1,6,9,8,4,2};

seleccion(arreglo);
imprime(arreglo);


}
public static void seleccion(int a[]){
for (int i =0;i<a.length-1 ;i++ ) {
	int minimo = i;
	for (int j=i+1;j<a.length;j++ ) {
		if(a[j]<a[minimo]){
			minimo = j;
		}
	}
	int aux = a[i];
	a[i] = a[minimo];
	a[minimo]=aux;
    }
}

public static void imprime(int a[]){
	for (int i=0;i<a.length ;i++ ) {
		System.out.println(a[i]+"\t");
	}
}



}