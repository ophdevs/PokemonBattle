package combate;

import model.Pokemon;

public class Batalha {
    private Pokemon p1;
    private Pokemon p2;

    public Batalha(Pokemon p1, Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    void batalhando(){
        while (p1.hp > 0 && p2.hp < 0){
           p2.hp = p2.hp - p1.ataque;
            System.out.println(p1.nome + " atacou " + p2.nome);
           if (p2.hp > 0){
               p1.hp = p1.hp - p2.ataque;
               System.out.println(p2.nome + " atacou " + p1.nome);
           }
        }
    }
}