package GUI;

import java.util.*;

class PokemonFarm {
	private ArrayList<Pokemon> pokemons;
	public PokemonFarm(){
		pokemons = new ArrayList<Pokemon>();

		pokemons.add(new Eevee("this is my Eevee",25,5));
		pokemons.add(new Espeon("this is my Espoen",25,5));
		pokemons.add(new Snorlax("this is my Snorlax",25,5));
		pokemons.add(new Snorlax("this is my Snorlax2",30,6));
	}

	public void addPokemon(Pokemon pokemon){
		pokemons.add(pokemon);
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

	public void battle(String pokemonName){
		
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

	public int getPokemonSize(){
        return pokemons.size();
    }

    public String getPokemonName(int i){
        return pokemons.get(i).getName();
    }

    public Pokemon getPokemon(String name){
        Pokemon start = null;
        for(Pokemon pokemon: pokemons){
            if (pokemon.getName().equals(name)){
                return pokemon;
            }
        }
        return start;
    }
}
