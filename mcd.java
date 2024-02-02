import java.util.*;

class mcd{
	
	public static void main(String [] arg){
		for(;;){
			Scanner leer = new Scanner(System.in);
			//Solicitamos ambos números al usuario
			long a;
			long b;
			System.out.print("\nDame a: ");
			a = leer.nextLong();
			//El segundo número debe ser mayor o igual a 0
			do{
				System.out.print("Dame b: ");
				b = leer.nextLong();
			}while(b < 0);
			
			if (a == 0 && b == 0){
				System.out.println("No esta definido el maximo comun divisor");
			}else{
				//Llamamos a la función que nos devolvera el maximo comun divisor
				System.out.println("El maximo comun divisor es: "+maximo_comun_divisor(a,b));
			}
		}
	}
	
	public static long maximo_comun_divisor(long a,long b){
		//Variable del residuo
	    long r;
		//Variable del resultado
		long res;
		
		/*
		Por propiedades del mcd:
		-> mcd(a,0) = |a|
		-> mcd(0,b) = |b|
		-> mcd(a,1) v mcd(1,b) = 1
		-> mcd(a,b) = mcd(b,r)
		*/
		
		if(a == 0){
			res = Math.abs(b);
		}else{
			if(b == 0){
			res = Math.abs(a);
			}else{
				if(b == 1 || a == 1){
					res = 1;
				}else{
					r = a%b;
					res = maximo_comun_divisor(b,r);
				}
			}
		}
		//Devolvemos el resultado
		return res;
	}
}