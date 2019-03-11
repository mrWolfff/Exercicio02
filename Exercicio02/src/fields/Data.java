package fields;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data implements FieldEvaluation{
	
	@Override
	public boolean isValid(String data) {
	        try {
	            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	            formato.setLenient(false);
	            formato.parse(data);
	            return true;
	        } catch (ParseException ex) {
	            return false;
	        }
	    }
		public boolean dataMenorQueHoje(String data) {
	     
	        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate dataVerificada = LocalDate.parse(data, formato);
	        LocalDate hoje = LocalDate.now();
	        if(dataVerificada.compareTo(hoje) <= 0)
	        	return true;
			return false;
		}
}		
