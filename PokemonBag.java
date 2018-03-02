import java.util.*;

class PokemonBag{
    private ArrayList<Pokemon> pokemons;
	public PokemonBag(){
		pokemons = new ArrayList<Pokemon>();
    }

    public void addPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
    }

    public void list(){
		for(Pokemon pokemon: pokemons){
		    pokemon.print();
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

    /*public Pokemon toFarm(){
        Pokemon pokeBuf = pokemons.get(pokemons.size()-1);
        pokemons.remove(pokemons.get(pokemons.size()-1));
        return pokeBuf;
    }*/
        

        
}