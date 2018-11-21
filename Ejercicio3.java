//Metodo de Insercion:

public class Ejercicio3{
	public static void main(String args[]){


int x[] = {1,3,33,54,67,8,54,66,8,10,9};
Insercion(x);

for(int i=0; i<x.length; i++){
	
	System.out.println(" "+x[i]);

}

	
}

public static void Insercion(int x[]){
int aux,i,o;
	for(i = 0; i<x.length;i++ ){
	aux = x[i];
		for(o = i-1; o>0 && x[o]>aux; o--){
			x[o+1]=x[o];
			x[o]=aux;


			}


		}



	}


}