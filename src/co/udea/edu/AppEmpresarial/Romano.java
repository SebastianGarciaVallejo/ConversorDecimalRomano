package co.udea.edu.AppEmpresarial;

public class Romano {
	 
    String unidades[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    String decenas[] =  {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    String centenas[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    String uMil[] =     {"","M","MM","MMM"};
   
    public String retornaRomano(int valor){
       
    	/*El algoritmo esta diseñado para transformar decimales hasta el numero 3999*/
    	
    	if(valor < 4000){  
        	int valMil,valCentena,valDecena,residuo;
            String a1,b1,c1,d1;
                     
            // Obtenemos el cada uno de los digitos del numero decimal
            
            valMil = valor/1000;      
            valCentena = (valor%1000)/100; 
            valDecena = ((valor %1000)%100)/10;
            residuo = ((valor%1000)%100)%10;
            
            /*cada digito obtenido anteriormente indica la posicion del valor en Romano
            que debemos tomar del respectivo Arreglo. Se guarda cada valor en
            un String y luego se concatenan los mismos para retornar el resultado.*/
            
            a1 = uMil[valMil];
            b1 = centenas[valCentena];
            c1 = decenas[valDecena];
            d1 = unidades[residuo];
            return a1+b1+c1+d1;
    	}
    	else{ 
    		return "error"; 
    		}
    }
}