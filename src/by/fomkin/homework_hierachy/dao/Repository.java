package by.fomkin.homework_hierachy.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.fomkin.homework_hierachy.bean.Appliance;
import by.fomkin.homework_hierachy.bean.Dryer;
import by.fomkin.homework_hierachy.bean.Freezer;
import by.fomkin.homework_hierachy.bean.Fridge;
import by.fomkin.homework_hierachy.bean.RefrigeratorFreezer;
import by.fomkin.homework_hierachy.bean.WasherDryer;
import by.fomkin.homework_hierachy.bean.WashingMachine;
import by.fomkin.homework_hierachy.bean.enumeration.Brand;
import by.fomkin.homework_hierachy.bean.enumeration.TypeDryer;

public class Repository {
	
	private static final Repository instance = new Repository();
	
	private WashingMachine f2v9gc9w = new WasherDryer(2549, Brand.LG, "F2V9GC9W", "A", 85, 60, 47, 8, 5);
	private Appliance wd90a7m48pe = new WasherDryer(3499, Brand.SAMSUNG, "WD90A7M48PE", "B", 85, 60, 48, 9, 5);
	private WasherDryer f4t9rc9p = new WasherDryer(3499, Brand.LG, "F4T9RC9P", "A", 85, 60, 60, 10, 7);
	private WashingMachine f2t9gw9w = new WashingMachine(2499, Brand.LG, "F2T9GW9W", "A+++", 85, 60, 47, 8);
	private Appliance ww80a6s28an = new WashingMachine(1989, Brand.SAMSUNG, "WW80A62S28AN", "A+++", 850, 60, 45, 8);
	private Dryer dc90v9v9w = new Dryer(4220, Brand.LG, "DC90V9V9W", "A+++", 85, 60, 60, 9, TypeDryer.CONDENSING_WITH_HEATPUMP);
	private Appliance dv90t6240lx = new Dryer(3699, Brand.SAMSUNG, "DV90T6240LX", "A++", 85, 60, 60, 9, TypeDryer.CONDENSING_WITH_HEATPUMP);
	private Appliance m7606150n = new Freezer(1952, Brand.ATLANT, "M7606-150N", "A+", 186, 60, 63, 245);
	private Freezer fnkw290t21w = new Freezer(1699, Brand.BEKO, "FNKW290T21W", "A+", 171, 60, 65, 290);
	private Appliance mff50w = new Fridge(529, Brand.MAUNFELD, "MFF50W", "A+", 50, 47, 45, 46);
	private Fridge x1602150 =  new Fridge(1502, Brand.ATLANT, "X1602-150", "A+", 187, 60, 63, 370);
	private Appliance gab509saum = new RefrigeratorFreezer(3250, Brand.LG, "GA-B509SAUM", "A++", 203, 60, 68, 277, 107);
	private Fridge kgn39xi27r =  new RefrigeratorFreezer(2399, Brand.BOSCH, "KGN39XI27R", "A+", 203, 60, 66, 280, 108);
	private RefrigeratorFreezer rb38t7762s9 = new RefrigeratorFreezer(3499, Brand.SAMSUNG, "RB38T7762S9", "A++", 203, 60, 66, 273, 112);
	
	private List<Appliance> appliances = new ArrayList<>();
		
	private Repository() {
		appliances.addAll(Arrays.asList(f2v9gc9w, wd90a7m48pe, f4t9rc9p, f2t9gw9w, ww80a6s28an, dc90v9v9w, dv90t6240lx, m7606150n, 
				fnkw290t21w, mff50w, x1602150, gab509saum, kgn39xi27r, rb38t7762s9));
	}
	
	public static Repository getInstance() {
		return instance;
	}
	
	public List<Appliance> getAppliances() {
		return appliances;
	}
	
	
	
	

}
