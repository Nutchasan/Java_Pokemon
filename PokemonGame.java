

class PokemonGame{
	public static void main(String[] args){
		PokemonFarm pokemonFarm = new PokemonFarm();
		// Wildpokemon wildPokemon = new Wildpokemon();
		// PokemonBag pokemonBag = new PokemonBag();
		CommandParser commandParser = new CommandParser(pokemonFarm/*,wildPokemon,pokemonBag*/);
		
		commandParser.run();
	}

}
