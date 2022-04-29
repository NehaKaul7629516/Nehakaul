
public class ProducesARelationship

{

	public static void main(String[] args)
	
	{

		

		Jelly jl = new Eatables().areOneofthem().grow().processMango().processJuice();
		jl.Sweet();
		
		MouthWatering mw = new MouthWatering();
		Jelly jl1 = mw.purchase();
	
		
	}

}

class MouthWatering
{
	Jelly purchase()
	{
		Eatables et = new Eatables();
		Fruits ft = et.areOneofthem();
		Mango mg = ft.grow();
		Juice jc = mg.processMango();
		Jelly jl = jc.processJuice();
		return jl;

	}
}

class Eatables {
	Fruits areOneofthem() {
		Fruits ft = new Fruits();
		return ft;
	}
}

class Fruits extends Eatables {
	Mango grow() {
		Mango mg = new Mango();
		return mg;
	}

}

class Mango extends Fruits {
	Juice processMango() {
		Juice j = new Juice();
		return j;
	}
}

class Juice {
	Jelly processJuice() {
		Jelly jl = new Jelly();
		return jl;
	}
}

class Jelly {
	public void Sweet()
	{
		System.out.println("Mango Jelly is the sweetest.");
	}

}
		
	
