package model;

public class PokemonPlanta extends Pokemon {
    public PokemonPlanta(String nome, int hp, int hpMax, int ataque, int defesa, TipoElemento tipo) {
        super(nome, hp, hpMax, ataque, defesa, TipoElemento.PLANTA);
    }

    @Override
    public void atacarEspecial(Pokemon alvo){
        System.out.println("teste");
    }
}
