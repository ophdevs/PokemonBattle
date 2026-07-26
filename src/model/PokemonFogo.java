package model;

public class PokemonFogo extends Pokemon{

    public PokemonFogo(String nome, int hp, int hpMax, int ataque, int defesa, TipoElemento tipo) {
        super(nome, hp, hpMax, ataque, defesa, TipoElemento.FOGO);
    }

    @Override
    public void atacarEspecial(Pokemon alvo){
        System.out.println("teste");
    }
}
