package batalhamk;

public class BatalhaMK {
 
    public static void main(String[] args) {
        
       // intanciar um objeto do tipo Personagem
     Personagem personagem1 = new Personagem ("Raidem", "relampago",8);
     Personagem personagem2 = new Personagem ("Sub Zero", "gelo", 6);
     Personagem personagem3 = new Personagem ("Kung Lao", "chapeu",7);
     Personagem personagem4 = new Personagem ("Kitana", "leque", 6);
     Personagem personagem5 = new Personagem ("Sindel", "cabelo", 7);
     Personagem personagem6 = new Personagem ("Sonya Blade", "aneis de energia", 5);
     
     int vidaPersonagem1 = personagem1.getVida();
     int vidaPersonagem2 = personagem2.getVida();
     int vidaPersonagem3 = personagem3.getVida();
     int vidaPersonagem4 = personagem4.getVida();
     int vidaPersonagem5 = personagem5.getVida();
     int vidaPersonagem6 = personagem6.getVida();
          
     if (vidaPersonagem1 > vidaPersonagem2)
     if (vidaPersonagem1 > vidaPersonagem3)
     if (vidaPersonagem1 > vidaPersonagem4)
     if (vidaPersonagem1 > vidaPersonagem5)
     if (vidaPersonagem1 > vidaPersonagem6)    
     {
         System.out.println(personagem1.getNome() + " VENCEU");
     }else{
      System.out.println(personagem1.getNome() + " PERDEU");   
     }
                       
    }
    
}
