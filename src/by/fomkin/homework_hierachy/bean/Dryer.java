package by.fomkin.homework_hierachy.bean;

import java.util.Objects;

import by.fomkin.homework_hierachy.bean.enumeration.Brand;
import by.fomkin.homework_hierachy.bean.enumeration.TypeDryer;

public class Dryer extends Appliance {

	private static final long serialVersionUID = -1053760130411964692L;
	
	private int capacityDry;
	private TypeDryer typeDryer;
	
	public Dryer() {
		super();
	}

	public Dryer(int price, Brand brand, String model, String energyEfficiency, int height, int width, int depth, int capacityDry, TypeDryer typeDryer) {
		super(price, brand, model, energyEfficiency, height, width, depth);
		this.capacityDry = capacityDry;
		this.typeDryer = typeDryer;
	}

	public int getCapacityDry() {
		return capacityDry;
	}

	public void setCapacityDry(int capacityDry) {
		this.capacityDry = capacityDry;
	}

	public TypeDryer getTypeDryer() {
		return typeDryer;
	}

	public void setTypeDryer(TypeDryer typeDryer) {
		this.typeDryer = typeDryer;
	}
	
	public String info() {
		
		return getPrice() + " BYN - " + getClass().getSimpleName() + " " + getBrand() + " " + getModel() + " (" + getEnergyEfficiency() + ") "
					+ getHeight() + "x" + getWidth() + "x" + getDepth()+ ", " + getCapacityDry() + "kg, " + getTypeDryer();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(capacityDry, typeDryer);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dryer other = (Dryer) obj;
		return capacityDry == other.capacityDry && typeDryer == other.typeDryer;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [capacityDry=" + capacityDry + ", typeDryer=" + typeDryer + "]";
	}
	
	

}
