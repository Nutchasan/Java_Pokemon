package GUI;

import java.util.*;
import java.io.*;

class CommandParser{
	private PokemonFarm pokemonFarm;
	private Wildpokemon wildPokemon;
	private Scanner commandScanner;
	private PokemonBag pokemonBag;
	private boolean isRunning;

	public CommandParser(PokemonFarm pokemonFarm/*,Wildpokemon wildPokemon,PokemonBag pokemonBag*/){
		this.pokemonFarm = pokemonFarm;
		this.wildPokemon = new Wildpokemon();
		this.pokemonBag = new PokemonBag();
		commandScanner = new Scanner(System.in);
		isRunning = false;
	}

	public void run(){
		isRunning = true;
		String command;

		System.out.println("Hello Pokemon Game");
		while(isRunning){
			System.out.print("\nWhat do you want? Type: ");
			command = commandScanner.next();
			// System.out.println("You type \'"+command+"\'");
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
			}
			else if(command.equals("add"))
				this.addPokemon();
			else if(command.equals("list"))
				this.listPokemons();
			else if(command.equals("feed"))
				this.feedPokemons();
			else if(command.equals("walk"))
				this.walkPokemons();	
			else if(command.equals("remove"))
				this.removePokemons();
			else if(command.equals("listbag"))
				this.listPokemonsBag();
			else if(command.equals("find"))
				this.findPokemon();		
		}

	}

	private void addPokemon(){
		commandScanner.nextLine();
		// input name weight length
		String pokemonType = "Eevee";
		String name = "name";
		float weight = 10f;
		float stepLength = 5f;
		

		System.out.print("Enter Species: ");
		pokemonType = commandScanner.nextLine();
		

		if(pokemonType.equals("Eevee")){
			System.out.print("Enter Name: ");
			name = commandScanner.nextLine();
			System.out.print("Enter Weight: ");
			weight = commandScanner.nextFloat();
			System.out.print("Enter Lenght: ");
			stepLength = commandScanner.nextFloat();
			
			Eevee eevee = new Eevee(name, weight, stepLength);
			pokemonFarm.addPokemon(eevee);
		}	

		if(pokemonType.equals("Snorlax")){
			System.out.print("Enter Name: ");
			name = commandScanner.nextLine();
			System.out.print("Enter Weight: ");
			weight = commandScanner.nextFloat();
			System.out.print("Enter Lenght: ");
			stepLength = commandScanner.nextFloat();

			Snorlax snorlax = new Snorlax(name ,weight ,stepLength);
			pokemonFarm.addPokemon(snorlax);
		}
		if(pokemonType.equals("Zapdos")){
			System.out.print("Enter Name: ");
			name = commandScanner.nextLine();
			System.out.print("Enter Weight: ");
			weight = commandScanner.nextFloat();
			System.out.print("Enter Lenght: ");
			stepLength = commandScanner.nextFloat();

			Zapdos zapdos = new Zapdos(name ,weight ,stepLength);
			pokemonFarm.addPokemon(zapdos);
		}	
		

	}

	private void listPokemons(){
		System.out.println("==========================================");
		System.out.println("Pokemon List");
		System.out.println("==========================================");
		this.pokemonFarm.list();
		System.out.println("==========================================");
	}

	private void listPokemonsBag(){
		System.out.println("==========================================");
		System.out.println("Pokemon Bag List");
		System.out.println("==========================================");
		this.pokemonBag.list();
		System.out.println("==========================================");
	}

	private void feedPokemons(){
		System.out.print("Which pokemon do you want to feed? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.feed("all");
		}
		else{
			this.pokemonFarm.feed(name);
		}
	}

	private void walkPokemons(){
		System.out.print("Which pokemon do you want to walk?: ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.walk("all");
		}
		else{
			this.pokemonFarm.walk(name);
		}
	}

	private void removePokemons(){
		System.out.print("Which pokemon do you want to remove?: ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.kill("all");
		}
		else{
			this.pokemonFarm.kill(name);
		}
	}

	private void removePokemonsBag(){
		System.out.print("Which pokemon in bag do you want to remove?: ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonBag.kill("all");
		}
		else{
			this.pokemonBag.kill(name);
		}
	}

	

	private void findPokemon(){
		// this.wildPokemon = new Wildpokemon();
		this.wildPokemon.wildPokemonSpawn();

		System.out.print("Catch or Run : ");

		String name = this.commandScanner.next();
		
		if(name.equals("run"))
			System.out.println("Ran away!!!");
		if(name.equals("catch")){
			this.wildPokemon.catchPokemon();
			if(this.wildPokemon.success() == true){
				this.pokemonBag.addPokemon(this.wildPokemon.getWildPokemon());
			}
		}			
		
	}

}

