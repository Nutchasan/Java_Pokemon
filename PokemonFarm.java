import java.util.*;

class PokemonFarm {
	private ArrayList<Pokemon> pokemons;
	public PokemonFarm(){
		pokemons = new ArrayList<Pokemon>();
	}

	public void addPokemon(Pokemon pokemon){
		pokemons.add(pokemon);
	}

	public void feed(){
	}

	public void list(){
		for(Pokemon pokemon: pokemons){
			pokemon.print();
		}
	}

	public void feed(String pokemonName){
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.eat();
			}
		}
		else{
			for(Pokemon pokemon: pokemons){
				if(pokemonName.equals(pokemon.getName()))
					pokemon.eat();
			}
		}
	}

	public void walk(String pokemonName){
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.walk();
			}
		}
		else
			for(Pokemon pokemon:pokemons){
				if(pokemonName.equals(pokemon.getName()))
					pokemon.walk();
			}
	}

	public void kill(String pokemonName){
		if(pokemonName.equals("all")){
			pokemons.clear();
		}
		else{
			for(Pokemon pokemon:pokemons){
				if(pokemonName.equals(pokemon.getName()))
					pokemons.remove(pokemon);
					break;
			}
		}	
	}
}
