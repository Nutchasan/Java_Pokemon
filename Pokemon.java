
import java.util.*;

class Pokemon{
	private String name;
	private float weight;
	private float stepLength;
	private int step;
	private float gainingWeightStep;
	private String[] types;
	private float mood;

	public Pokemon(String name,
		       float weight,
		       float stepLength,
		       float gainingWeightStep,
		       String[] types
			   float mood){
		this.name = name;
		this.weight = weight;
		this.stepLength = stepLength;
		this.gainingWeightStep = gainingWeightStep;
		
		step = 0;


		if(types == null)
			this.types = new String[] {"normal"};
		else
			this.types = types;
		
		this.mood = mood;
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

	public void catch(){
		mood = mood*
		return mood;
	}

	public String getName(){
		return this.name;
	}

}
