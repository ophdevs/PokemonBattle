package model;
import combate.Atacavel;

public class PokemonFogo extends Pokemon implements Atacavel {

    public PokemonFogo(String nome, int hpMax, int ataque, int defesa) {
        super(nome,hpMax, ataque, defesa, TipoElemento.FOGO);
    }

    @Override
    public void atacarEspecial(Pokemon alvo){
        System.out.println(nome + " usou Lança-Chamas!");
        int danoBase = this.ataque * 2 - alvo.defesa;
        double vantagem = this.tipo.calcularVantagem(alvo.tipo);
        int danoFinal = (int) (danoBase * vantagem);
        if (vantagem > 1.0){
            System.out.println("É super efetivo!");
        }else if (vantagem < 1.0){
            System.out.println("Não é muito efetivo...");
        }
        alvo.receberDano(danoFinal);
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