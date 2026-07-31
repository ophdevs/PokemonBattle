package model;
import combate.Atacavel;
import combate.Curavel;

public class PokemonPlanta extends Pokemon implements Atacavel, Curavel {
    public PokemonPlanta(String nome,int hpMax, int ataque, int defesa) {
        super(nome,hpMax, ataque, defesa, TipoElemento.PLANTA);
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
        if (dano < 0 ) dano = 0;
        System.out.println( this.nome + " atacou " + alvo.nome + "e causou " + dano + " de dano ");
        alvo.receberDano(dano);
    }

    @Override
    public void curar(int quantidade){
        this.hp = Math.min(hpMax, hp + quantidade);
    }
}
