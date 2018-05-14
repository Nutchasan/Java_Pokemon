package GUI;

import java.util.*;

class Pokemon{
	private String name;
	private float weight;
	private float stepLength;
	private int step;
	protected float gainingWeightStep;
	private String[] types;
	private float mood;
	private int healt;
	private int level ;
	private int exp;

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
		
		this.step = 0;

		this.healt = 100;
		this.level = 1;



		if(types == null)
			this.types = new String[] {"normal"};
		else
			this.types = types;
	}

	public void walk(){
		step += 1;
		if(weight > 10 ){
			weight -= gainingWeightStep;
		}
		if(weight < 10 ){
			weight = 10;
		}

	}

	public void eat(){
		weight += gainingWeightStep;
		if(healt < 100)
			healt += 8;
		if(healt > 100)
			healt = 100;
	}

	public void levelUp(){
		if(exp < 100 && healt > 0 && weight < 40 && weight >20){
			exp += 10;
			healt -= 7;
		}
		if(healt < 0){
			healt = 0;
		}
		if(exp >= 100){
			level += 1;
			exp = 0;
		}
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

	public float getWeight() {
        return weight;
    }

    public float getStepLength() {
        return stepLength;
    }

	public int getHealt(){
		return healt;
	}

	public int getEXP(){
		return exp;
	}

	public int getLevel(){
		return level;
	}

}
