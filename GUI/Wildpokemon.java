package GUI;

import java.util.*;

class Wildpokemon{
    private Random random;
    private int n;
    private Pokemon wildPokemon;
    private PokeBall pokeBall;
    private double mood;

    public Wildpokemon(/*Pokemon wildPokemon,Pokemon pokeBall*/){
        // this.wildPokemon = wildPokemon;
        // this.pokeBall = pokeBall;
        random = new Random();
    }

    public void wildPokemonSpawn(){
        n = random.nextInt(4);

        if(n==0){
            System.out.println("You found Snorlax!!!");
            this.wildPokemon = new Snorlax("wild Snorlax", (float)random.nextInt(30)+20 , random.nextInt(5)+1);
        }

        if(n==1){
            System.out.println("You found Zapdos!!!");
            this.wildPokemon = new Zapdos("wild Zapdos", (float)random.nextInt(30)+20 , random.nextInt(5)+1);
        }
        if(n==2){
            System.out.println("You found Eevee!!!");
            this.wildPokemon = new Eevee("wild Eevee", (float)random.nextInt(30)+20 , random.nextInt(5)+1);
        }
        if(n==3){
            System.out.println("You found Espeon!!!");
            this.wildPokemon = new Espeon("wild Espeon", (float)random.nextInt(30)+20 , random.nextInt(5)+1);
        }

        this.mood = (this.random.nextInt(10)+1/10.1);
    }

    public void catchPokemon(){
        this.mood += 0.05;
        pokeBall = new PokeBall(random.nextInt(3));
        System.out.println(this.pokeBall.getName());

        if(success() ==  true){
            System.out.println("You got "+ this.wildPokemon.getName());
            System.out.print(mood);
        }
        else{
            System.out.println("Try again");
            System.out.print(mood);    
        }   
    }

    public boolean success(){
        if((this.mood*(this.pokeBall.getChance()))>0.5)
            return true;
        else
            return false;
    }

    public Pokemon getWildPokemon(){
        return this.wildPokemon;
    }



    
}