package edu.sofia.primeirasemana;

// Aula 4 - Anatomia de Classes 
public class BoletimEstudantil {
    public static void main(String[] args){
        
         // SEM INDENTAÇÃO
    int smediaFinal = 7;
    if(smediaFinal<6)
    System.out.println("REPROVADO");
    else if(smediaFinal==6)
    System.out.println("PROVA MINERVA");
    else 
    System.out.println("APROVADO");

        // COM INDENTAÇÃO
        int cmediaFinal = 7;
            if(cmediaFinal<6)
                System.out.println("REPROVADO");
            else if(cmediaFinal==6)
                System.out.println("PROVA MINERVA");
            else 
                System.out.println("APROVADO");
    }
}
