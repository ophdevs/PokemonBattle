package model;

public class PokemonAgua extends Pokemon{
    public PokemonAgua(String nome, int hp, int hpMax, int ataque, int defesa, TipoElemento tipo) {
        super(nome, hp, hpMax, ataque, defesa, TipoElemento.AGUA);
    }

    @Override
    public void atacarEspecial(Pokemon alvo){
        System.out.println("teste");
    }
}
