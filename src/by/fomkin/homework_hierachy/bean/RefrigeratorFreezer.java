package by.fomkin.homework_hierachy.bean;

import java.util.Objects;

import by.fomkin.homework_hierachy.bean.enumeration.Brand;

public class RefrigeratorFreezer extends Fridge {

	private static final long serialVersionUID = 1L;
	
	private int volumeFreezer;

	public RefrigeratorFreezer() {
		super();
	}

	public RefrigeratorFreezer(int price, Brand brand, String model, String energyEfficiency, int height, int width, int depth, int volumeFridge, 
			int volumeFreezer) {
		super(price, brand, model, energyEfficiency, height, width, depth, volumeFridge);
		this.volumeFreezer = volumeFreezer;
	}

	public int getVolumeFreezer() {
		return volumeFreezer;
	}

	public void setVolumeFreezer(int volumeFreezer) {
		this.volumeFreezer = volumeFreezer;
	}
	
	public String info() {
		
		return getPrice() + " BYN - " + getClass().getSimpleName() + " " + getBrand() + " " + getModel() + " (" + getEnergyEfficiency() + ") "
					+ getHeight() + "x" + getWidth() + "x" + getDepth()+ ", " + getVolumeFridge() + "l/" + getVolumeFreezer() + "l";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(volumeFreezer);
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
		RefrigeratorFreezer other = (RefrigeratorFreezer) obj;
		return volumeFreezer == other.volumeFreezer;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [volumeFreezer=" + volumeFreezer + "]";
	}
	
	

}
