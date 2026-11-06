package model;

import combate.Atacavel;

public abstract class Pokemon{
    public String nome;
    public double hp, hpMax, ataque, defesa;
    public TipoElemento tipo;
    public String ataqueName;

    public Pokemon(String nome, int hpMax, int ataque, int defesa, TipoElemento tipo, String ataqueName) {
        this.nome = nome;
        this.hpMax = hpMax;
        this.hp = hpMax;
        this.ataque = ataque;
        this.defesa = defesa;
        this.tipo = tipo;
        this.ataqueName = ataqueName;
    }

    public void atacarEspecial(Pokemon alvo){
        System.out.println("usou " + this.ataqueName);
        double danoBase = this.ataque * 2 - alvo.defesa;
        double vantagem = this.tipo.calcularVantagem(alvo.tipo);
        int danoFinal = (int) (danoBase * vantagem);
        if (vantagem > 1.0){
            System.out.println("É super efetivo!");
        }else if (vantagem < 1.0){
            System.out.println("Não é muito efetivo...");
        }
        alvo.receberDano(danoFinal);
    }

    public void receberDano(int dano){
        this.hp = Math.max(0, hp - dano);
    }
}
