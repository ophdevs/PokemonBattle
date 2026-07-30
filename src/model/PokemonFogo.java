package model;
import combate.Atacavel;

public class PokemonFogo extends Pokemon implements Atacavel {

    public PokemonFogo(String nome, int hpMax, int ataque, int defesa) {
        super(nome,hpMax, ataque, defesa, TipoElemento.FOGO);
    }

    @Override
    public void atacarEspecial(Pokemon alvo){
        System.out.println(nome + " usou Lança-Chamas!");
        int dano = this.ataque * 2 - alvo.defesa;
        alvo.receberDano(dano);
    }

    @Override
    public void atacar(Pokemon alvo){
        int dano = this.ataque - alvo.defesa;
        if (dano < 0 )dano = 0;
        System.out.println( this.nome + " atacou " + alvo.nome + "e causou " + dano + " de dano ");
        alvo.receberDano(dano);
    }
}