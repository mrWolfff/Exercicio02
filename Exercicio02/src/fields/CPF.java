package fields;

public class CPF implements FieldEvaluation{
	
	@Override
	public boolean isValid(String num) {
		int resto = 0;
		int contador = 10;
		int valor = 0;
		int pegaChar = 0;
		
		for(int i = 0; i <= num.length()- 3; i++) {
			pegaChar = Character.getNumericValue(num.charAt(i));
			valor = valor + (pegaChar * contador); 
			contador--;	
		}
		valor *= 10;
		resto = valor % 11;
		
		if(Character.getNumericValue(num.charAt(9)) != resto) {
		
		}else {
			contador = 11;
			resto = 0;
			valor = 0;
			
			for(int i = 0; i <= num.length() - 2; i++) {
				pegaChar = Character.getNumericValue(num.charAt(i));
				valor = valor + (pegaChar * contador); 
				contador--;	
			}
			valor *= 10;
			resto = valor % 11;
			
			if(Character.getNumericValue(num.charAt(10)) == resto) {
				return true;
			
			}else {
				return false;
			}
		}
		
		
		
		
		return true;
		
	}
}
