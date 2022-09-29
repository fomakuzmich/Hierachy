package by.fomkin.homework_hierachy.main;

import by.fomkin.homework_hierachy.dao.Repository;
import by.fomkin.homework_hierachy.view.Output;

public class Main {

	public static void main(String[] args) {
		
		Repository repository = Repository.getInstance();
		
		Output output = Output.getInstance();
		
		output.toConsole(repository.getAppliances());
	}

}
