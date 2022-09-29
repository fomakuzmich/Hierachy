package by.fomkin.homework_hierachy.bean;

import java.io.Serializable;
import java.util.Objects;

import by.fomkin.homework_hierachy.bean.enumeration.Brand;

public class Appliance implements Serializable{
	
	private static final long serialVersionUID = 3244283905713601506L;
	
	private int price;
	private Brand brand;
	private String model;
	private String energyEfficiency;
	private int height;
	private int width;
	private int depth;
	
	public Appliance() {
		
	}
	
	public Appliance(int price, Brand brand, String model, String energyEfficiency, int height, int width, int depth) {
		
		this.price = price;
		this.brand = brand;
		this.model = model;
		this.energyEfficiency = energyEfficiency;
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getEnergyEfficiency() {
		return energyEfficiency;
	}
	public void setEnergyEfficiency(String energyEfficiency) {
		this.energyEfficiency = energyEfficiency;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public String info() {
		
		return getPrice() + " BYN - " + getClass().getSimpleName() + " " + getBrand() + " " + getModel() + " (" + getEnergyEfficiency() + ") "
					+ getHeight() + "x" + getWidth() + "x" + getDepth();
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, depth, energyEfficiency, height, model, price, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		return brand == other.brand && depth == other.depth && Objects.equals(energyEfficiency, other.energyEfficiency)
				&& height == other.height && Objects.equals(model, other.model) && price == other.price
				&& width == other.width;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [price=" + price + ", brand=" + brand + ", model=" + model + ", energyEfficiency="
				+ energyEfficiency + ", height=" + height + ", width=" + width + ", depth=" + depth + "]";
	}
	

}
