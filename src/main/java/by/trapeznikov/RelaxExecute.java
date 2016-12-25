package by.trapeznikov;

import by.trapeznikov.steps.Steps;

public class RelaxExecute {
	
	public static void main(String [] args){
		
		Steps steps =new Steps();
		
		steps.initBrowser();
		
		steps.afishaRelaxBy();
		steps.closeDriver();
		
	}

}
