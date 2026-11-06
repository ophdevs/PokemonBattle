import combate.Batalha;
import model.Pokemon;
import model.PokemonAgua;
import model.PokemonFogo;
import model.TipoElemento;

public class Main {
    public static void main(String[] args) {
        PokemonFogo charmander = new PokemonFogo("charmander", 60, 70, 40);
        PokemonAgua squirtle = new PokemonAgua("squirtle", 60, 70, 40);

        double vantagem = squirtle.tipo.calcularVantagem(charmander);

        new Batalha(charmander, squirtle);
        charmander.atacarEspecial(squirtle);
        System.out.println(squirtle.hp);
        squirtle.atacar(charmander);
        System.out.println(charmander.hp);
    }
}
