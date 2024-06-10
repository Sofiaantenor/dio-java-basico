// Aula 1 - Anatomia de Classes 
public class MinhaClasse {
    
    public static void main(String[] args) {
        
        //System.out.print("Olá Turma, sejam bem-vindos");

        // Aula 2 - Anatomia de Classes 
        //final String BR = "Brasil"; //variável imutável - "final", ou letras maiúscula
        // declaralção de variáveis válidas
        //int numero$um = 1;
        //int numero1 = ~2;
        //int numeroum =3;
        //int longo = 4;

        // Aula 3 - Anatomia de Classes 
        //String meuNome = "Sofia";
        //int anoFrabricacao = 2024;
        //boolean verdadeira = false;
        //anoFrabricacao = 2005;

        String primeiroNome = "Sofia";
        String segundoNome = "Teixeira";
        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);

    }

        // Aula 3 - Anatomia de Classes 
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    } 
}
