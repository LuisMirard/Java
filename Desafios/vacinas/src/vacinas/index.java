package vacinas;

import java.util.ArrayList;
import java.util.List;

public class index {

	public static void main (String[] args) {
		VacinasAction va = new VacinasAction();
		myList<Vacinas> vac = new myList();
		
		Integer i=0;
		Integer count =  0;
		while (i != 5) {
			
			String opcao = va.menu();			
			va.validaopcao(opcao,vac,count);
			i = Integer.parseInt(opcao);
			count++;
		}	
		
		
	}
}
