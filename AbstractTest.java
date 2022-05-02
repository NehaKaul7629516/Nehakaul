

public class AbstractTest {

	public static void main(String[] args) {
		
		Guitar g = new Guitar();
		g.utilize();
		g.play();
		g.tuneStr();
		g.pluck();

		

		System.out.println("-------------------------------");
		
		Violin v=new Violin();
		v.play();
		v.tuneStr();
		v.utilize();
		System.out.println("-------------------------------");
		
		ElectronicGuitar ec=new ElectronicGuitar(); 
		ec.play();
		ec.pluck();
		
		
		System.out.println("-------------------------------");
		
		Cello c= new Cello();
		c.play();
		c.playViolin();
		
		Instrument i=new Guitar();
		i.utilize();
		
	
		Cello muinst=new Cello();
		muinst.play();
		
	}

}

abstract class Instrument {
	abstract void utilize();

}

abstract class MusicalInstrument extends Instrument {
	abstract void play();
}

abstract class StringBasedInstrument extends Instrument {
	abstract void tuneStr();
}

class Guitar extends StringBasedInstrument {
	void tuneStr() {
		System.out.println("The strings of guitar are tuned..");
	}

	void play() {
		System.out.println("The guitar is playing..");
	}

	void utilize() {
		System.out.println("The guitar is utilized..");
	}

	void pluck() {
		System.out.println("Plucking the guitar..");
	}

}

class ElectronicGuitar extends Guitar {
	void electricsource() {
		System.out.println("Electronic Guitar needs electricity..");
	}
}

class Violin extends StringBasedInstrument {

	void tuneStr() {
		System.out.println("Tuning the guitar strings...");

	}

	void play() {
		System.out.println("Playing the guitar...");

	}

	@Override
	void utilize() {
		System.out.println("Utilizing the guitar...");

	}
}
	class Cello extends Violin
	{
	   void playViolin()
	   {
		   System.out.println("Playing the Cello Violin..");
	   }
	   
	}

	abstract class MedicalInstrument extends Instrument {
		abstract void diagnose();

	}

	abstract class StringBasedMusicalInstrument extends MusicalInstrument {
		abstract void tuneStr();

	}

	abstract class AirBasedMusicalInstrument extends MusicalInstrument {
		abstract void blow();
	}

	abstract class Flute extends AirBasedMusicalInstrument

	{
		abstract void airblow();

	}

	abstract class Saxaphone extends AirBasedMusicalInstrument {
		abstract void multipleairblow();

	}

	abstract class Bagpiper extends AirBasedMusicalInstrument

	{
		abstract void heavyairblow();

	}

	abstract class SurgicalBasedMediaclInstrument extends MedicalInstrument {
		abstract void sterilize();
	}

	abstract class Needle extends SurgicalBasedMediaclInstrument {
		abstract void sharptip();
	}

	abstract class Cutter extends SurgicalBasedMediaclInstrument

	{
		abstract void sharpblade();

	}

	abstract class PathalogicalMediaclInstrument extends MedicalInstrument {
		abstract void read();

		abstract void scan();
	}

	abstract class MRI extends PathalogicalMediaclInstrument

	{
		abstract void magneticrays();

	}

	abstract class Glucometer extends PathalogicalMediaclInstrument

	{
		abstract void measurementsuger();

	}

	abstract class CTIScanner extends PathalogicalMediaclInstrument {
		abstract void imagescan();
	}
