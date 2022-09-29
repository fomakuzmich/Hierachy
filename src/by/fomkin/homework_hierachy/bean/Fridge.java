package by.fomkin.homework_hierachy.bean;

import java.util.Objects;

import by.fomkin.homework_hierachy.bean.enumeration.Brand;

public class Fridge extends Appliance {

	private static final long serialVersionUID = 6481004185266319493L;
	
	private int volumeFridge;

	public Fridge() {
		super();
	}

	public Fridge(int price, Brand brand, String model, String energyEfficiency, int height, int width, int depth, int volumeFridge) {
		super(price, brand, model, energyEfficiency, height, width, depth);
		this.volumeFridge = volumeFridge;
	}

	public int getVolumeFridge() {
		return volumeFridge;
	}

	public void setVolumeFridge(int volumeFridge) {
		this.volumeFridge = volumeFridge;
	}
	
	public String info() {
		
		return getPrice() + " BYN - " + getClass().getSimpleName() + " " + getBrand() + " " + getModel() + " (" + getEnergyEfficiency() + ") "
					+ getHeight() + "x" + getWidth() + "x" + getDepth()+ ", " + getVolumeFridge() + "l";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(volumeFridge);
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
		Fridge other = (Fridge) obj;
		return volumeFridge == other.volumeFridge;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [volumeFridge=" + volumeFridge + "]";
	}
	

}
