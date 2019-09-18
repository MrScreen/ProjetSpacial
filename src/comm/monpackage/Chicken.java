package comm.monpackage;

public class Chicken extends Animal implements Flying {

	
	@Override
	public boolean takeOff() {
		if (this.inAir=false)
		{
			this.inAir=true;
		}
		return inAir;
	}

	@Override
	public boolean land() {
		if(this.inAir=true) {
			this.inAir=false;
		}
		return inAir;
	}

	@Override
	public String communicate() {
		// TODO Auto-generated method stub
		return null;
	}

}
