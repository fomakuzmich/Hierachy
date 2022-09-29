package by.fomkin.homework_hierachy.bean;

import java.util.Objects;

import by.fomkin.homework_hierachy.bean.enumeration.Brand;

public class Freezer extends Appliance {

	private static final long serialVersionUID = 2835095944896678337L;
	
	private int volumeFreezer;

	public Freezer() {
		super();
	}

	public Freezer(int price, Brand brand, String model, String energyEfficiency, int height, int width, int depth, int volumeFreezer) {
		super(price, brand, model, energyEfficiency, height, width, depth);
		this.volumeFreezer = volumeFreezer;
	}

	public int getVolumeFreezer() {
		return volumeFreezer;
	}

	public void setVolumeFreeze(int volumeFreezer) {
		this.volumeFreezer = volumeFreezer;
	}
	
	public String info() {
		
		return getPrice() + " BYN - " + getClass().getSimpleName() + " " + getBrand() + " " + getModel() + " (" + getEnergyEfficiency() + ") "
					+ getHeight() + "x" + getWidth() + "x" + getDepth()+ ", " + getVolumeFreezer() + "l";
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
		Freezer other = (Freezer) obj;
		return volumeFreezer == other.volumeFreezer;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [volumeFreeze=" + volumeFreezer + "]";
	}
	

}
