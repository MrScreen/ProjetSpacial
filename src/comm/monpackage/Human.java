package comm.monpackage;

import java.util.ArrayList;
import java.util.List;

public class Human extends Being implements Adopter, Buyer {
	private int money=0;
	
	List<House> houses = new ArrayList<House>();
	List<Animal> animals = new ArrayList<Animal>();

	
	@Override
	public boolean buy(House h) {
		if(money!=0)
		{
			//Assigner une maison à un humain
			h.setOwner(this);
			this.houses.add(h);
			
		}
		return false;
	}


	@Override
	public boolean sell(House h) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean adopte(Animal a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean revoke(Animal a) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
