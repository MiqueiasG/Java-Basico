public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        byte a = 124;
        // A variável a é do tipo byte e pode armazenar valores de -128 a 127

        short b = 10000; 
        // A variável b é do tipo short e pode armazenar valores de -32.768 a 32.767  
        // E possivel atribuir um valor inteiro a uma variável do tipo byte, mas não o contrário

        int c = 100000; 
        // A variável c é do tipo int e pode armazenar valores de -2.147.483.648 a 2.147.483.647
        // Se o tipo inteiro não receber nenhum valor, o valor padrão é 0
        // É possivel atribuir um valor inteiro a uma variável do tipo byte, short ou long, mas não o contrário
        
        long d = 100000L; 
        // A variável d é do tipo long e precisa do sufixo 'L' para indicar que é um número inteiro longo
        // O tipo long pode armazenar valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        
        float e = 10.5f; 
        // A variável e é do tipo float e precisa do sufixo 'f' para indicar que é um número de ponto flutuante
        // O tipo float pode armazenar valores de -3.40282347E+38 a 3.40282347E+38
        
        double f = 10000.5; 
        // A variável f é do tipo double que representa números de ponto flutuante de precisão dupla
        // O tipo double pode armazenar valores de -1.7976931348623157E+308 a 1.7976931348623157E+308

        
        char g = 'A'; 
        // A variável g é do tipo char e pode armazenar um único caractere
    
        
        boolean h = true; 
        // A variável h é do tipo boolean e pode armazenar apenas os valores true ou false
        
        String i = "Hello, World!"; 
        // A variável i é do tipo String e pode armazenar uma sequência de caracteres
        // A String é uma classe em Java e não um tipo primitivo
        

    }
}
