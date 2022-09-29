package by.fomkin.homework_hierachy.view;

import java.util.List;

import by.fomkin.homework_hierachy.bean.Appliance;

public class Output {
	
	private static final Output instance = new Output();
	
	public static Output getInstance() {
		
		return instance;
	}
	
	public void toConsole(List<Appliance> appliances) {
		
		for (Appliance x : appliances) {
			
			toConsole(x);
		}
	}
	
	public void toConsole(Appliance appliance) {
		
		System.out.println(appliance.info());
	}

}
