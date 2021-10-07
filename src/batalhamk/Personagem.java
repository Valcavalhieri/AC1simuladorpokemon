package batalhamk;

public class Personagem {
    //Atributos encapsulados
    private String nome;
    private String poder;
    private int level;
    private int ataque;
    private int vida;
    private int defesa;
    
    //Construtor

    public Personagem(String nome, String poder, int level) {
        this.nome = nome;
        this.poder = poder;
        this.level = level;
        calculaAtributos ();
        calculaBonus ();
        imprimePersonagem();
    }
    
    
    //Métodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
    public void imprimePersonagem(){
        System.out.println("nome: " + nome + " | " +
                           "poder: " + poder + " | " +
                           "level: " + level + " | " +        
                           "ataque: " + ataque + " | " +
                           "vida: " + vida + " | " +                                                    
                           "defesa: " + defesa + " | ");
    }
    
    public void calculaAtributos (){
        switch (this.poder){
        case "relampago":
            this.ataque = 150;
            this.vida = 120;
            this.defesa = 90;
        break;
        case "gelo":
            this.ataque = 120;
            this.vida = 110;
            this.defesa = 80;
        break;
        case "chapeu":
            this.ataque = 130;
            this.vida = 110;
            this.defesa = 90;
        break;
        case "leque":
            this.ataque = 120;
            this.vida = 110;
            this.defesa = 80;
        break;
        case "cabelo":
            this.ataque = 130;
            this.vida = 110;
            this.defesa = 90;
        break;
        case "aneis de energia":
            this.ataque = 100;
            this.vida = 100;
            this.defesa = 80;
        break;   
        
        }
        
    }
    
    public void calculaBonus (){
        ataque = ataque + (level/2);
        vida = vida + (level/3);
        defesa = defesa + (level/2);
    }
}
