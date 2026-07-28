package model;

public abstract class Pokemon {
    public String nome;
    public int hp, hpMax, ataque, defesa;
    public TipoElemento tipo;

    public Pokemon(String nome, int hpMax, int ataque, int defesa, TipoElemento tipo) {
        this.nome = nome;
        this.hp = hpMax;
        this.hpMax = hpMax;
        this.ataque = ataque;
        this.defesa = defesa;
        this.tipo = tipo;
    }

    public abstract void atacarEspecial(Pokemon alvo);

    public void receberDano(int dano){
        this.hp = Math.max(0, hp - dano);
    }
}
