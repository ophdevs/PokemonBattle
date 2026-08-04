package model;
import combate.Atacavel;

public class PokemonFogo extends Pokemon implements Atacavel {

    public PokemonFogo(String nome, int hpMax, int ataque, int defesa, String ataqueName) {
        super(nome,hpMax, ataque, defesa, TipoElemento.FOGO, "Lança-Chamas");
    }

    @Override
    public void atacar(Pokemon alvo){
        int dano = this.ataque - alvo.defesa;
        double vantagem = this.tipo.calcularVantagem(alvo.tipo);
        int danoFinal = (int) (dano * vantagem);
        if (dano < 0 )dano = 0;
        if (vantagem > 1.0){
            System.out.println("É super efetivo!");
        }else if (vantagem < 1.0){
            System.out.println("Não é muito efetivo...");
        }
        System.out.println( this.nome + " atacou " + alvo.nome + "e causou " + dano + " de dano ");
        alvo.receberDano(danoFinal);
    }
}