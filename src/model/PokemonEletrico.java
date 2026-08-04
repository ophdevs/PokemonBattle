package model;
import combate.Atacavel;

public class PokemonEletrico extends Pokemon implements Atacavel {
    public PokemonEletrico(String nome, int hpMax, int ataque, int defesa) {
        super(nome,hpMax, ataque, defesa, TipoElemento.ELETRICO, "Raio do trovao");
    }

    @Override
    public void atacar(Pokemon alvo){
        int dano = this.ataque - alvo.defesa;
        if (dano < 0 ) dano = 0;
        System.out.println( this.nome + " atacou " + alvo.nome + "e causou " + dano + " de dano ");
        alvo.receberDano(dano);
    }
}
