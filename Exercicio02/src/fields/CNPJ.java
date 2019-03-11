package fields;

public class CNPJ implements FieldEvaluation{
	
	@Override
	public boolean isValid(String num) {
		int resto = 0;
		int contador = 0;
		int valor = 0;
		int pegaChar = 0;
		int peso = 2;
		for(int i = 11; i >= 0; i--) {
			if(contador == 8) {
				peso = 2;
			}
			pegaChar = Character.getNumericValue(num.charAt(i));
			valor = valor + (pegaChar * peso); 
			contador++;
			peso++;
		}
		valor *= 10;
		resto = valor % 11;
		
		if(Character.getNumericValue(num.charAt(12)) != resto) {
			return false;
		
		}else{
			contador = 0;
			resto = 0;
			valor = 0;
			peso = 2;
			for(int i = 12; i >= 0; i--) {
				if(contador == 8) {
					peso = 2;
				}
				pegaChar = Character.getNumericValue(num.charAt(i));
				valor = valor + (pegaChar * peso); 
				contador++;	
				peso++;
			}
			valor *= 10;
			resto = valor % 11;
			
			if(Character.getNumericValue(num.charAt(13)) == resto) {
				return true;
			
			}else {
				return false;
			}
		}
		
	}
}
