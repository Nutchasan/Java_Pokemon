
import java.util.*;

class Pokemon{
	private String name;
	private float weight;
	private float stepLength;
	private int step;
	protected float gainingWeightStep;
	private String[] types;
	private float mood;
	Random random = new Random();

	public Pokemon(String name,
		       float weight,
		       float stepLength,
		       float gainingWeightStep,
		       String[] types){
		this.name = name;
		this.weight = weight;
		this.stepLength = stepLength;
		this.gainingWeightStep = gainingWeightStep;
		
		step = 0;


		if(types == null)
			this.types = new String[] {"normal"};
		else
			this.types = types;
	}

	public void walk(){
		step += 1;
		weight -= gainingWeightStep;
	}

	public void eat(){
		weight += gainingWeightStep;
	}

	public void print(){
		System.out.println("Pokemon name: " + name);
 		System.out.print("        Type: ");
		for(String type: types){
			System.out.print(type+",");
		}
		System.out.println();
		System.out.println("      Weight: " + weight);
		System.out.println(" Step length: " + stepLength);
		System.out.println("  Today Step: " + step);
		System.out.println("------------------------------------------");
	}

	public String getName(){
		return this.name;
	}

}
