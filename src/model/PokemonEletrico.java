package model;

public class PokemonEletrico extends Pokemon{
    public PokemonEletrico(String nome, int hp, int hpMax, int ataque, int defesa, TipoElemento tipo) {
        super(nome, hp, hpMax, ataque, defesa, TipoElemento.ELETRICO);
    }

    @Override
    public void atacarEspecial(Pokemon alvo){
        System.out.println("teste");
    }
}
