package fields;

public class Name implements FieldEvaluation{
	
	@Override
	public boolean isValid(String name) {
		if(name.length() < 5 && name.length() > 50)
			 System.out.println("Nome invalido");
		 
		
		 if(name.indexOf(" ") == -1)
		     System.out.println("O nome deve contre o seu nome e sobrenome");
		 
		
		return true;
		
	}
}
