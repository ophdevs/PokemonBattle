import model.Pokemon;
import model.PokemonAgua;
import model.PokemonFogo;

public class Main {
    public static void main(String[] args) {
        PokemonFogo charmander = new PokemonFogo("charmander", 60, 70, 40);
        PokemonAgua squirtle = new PokemonAgua("squirtle", 60, 70, 40);

        charmander.atacarEspecial(squirtle);
        System.out.println(squirtle.hp);
        squirtle.atacar(charmander);
        System.out.println(charmander.hp);
    }
}
