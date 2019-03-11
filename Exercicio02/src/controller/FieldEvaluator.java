package controller;
import fields.FieldEvaluation;
import fields.Name;
import fields.CNPJ;
import fields.CPF;
import fields.Data;

public class FieldEvaluator {
	FieldEvaluation field;
	CPF fieldCPF = new CPF();
	CNPJ fieldCNPJ = new CNPJ();
	Name fieldName = new Name();
	Data fieldData = new Data();
	
	public void evaluate(String name, String cpfORcnpj, String data) {
		System.out.println(fieldName.isValid(name));
		System.out.println(fieldData.isValid(data));
		if(cpfORcnpj.length() == 11) {
			System.out.println(fieldCPF.isValid(cpfORcnpj));
		}else if(cpfORcnpj.length() == 14){
			System.out.println(fieldCNPJ.isValid(cpfORcnpj));
		}else {
			System.out.println("CPF ou CNPJ invalido!");
		}
				
	}
}
