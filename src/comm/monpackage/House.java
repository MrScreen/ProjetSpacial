package comm.monpackage;

import java.util.List;

public class House extends SpacialElement  {

	private int price;
	
	Ematerial material; //Enumeration
	
	//Par défaut un humain n'a pas de maison
	private Human owner =null;
	
	public House(Human humain) {
		this.owner = humain;
	}

	
	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Human getOwner() {
		return owner;
	}


	public void setOwner(Human owner) {
		this.owner = owner;
	}

	
}
