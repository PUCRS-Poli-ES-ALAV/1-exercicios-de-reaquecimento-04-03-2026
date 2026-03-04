public class meu {
    // ETAPA 1 - Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).

    int x; 
    int y; 
    public static int multiplicadorPorMeioDeSomasSucessivas(int x, int y) {
        int result = 0;
        for ( int i = 0; i < y; i++) {
            result += x;
        }
        return result;
    }
    

    // ETAPA 2 - Soma de dois números naturais, através de incrementos sucessivos 

    public static int somadorPorMeioDeIncrementosSucessivos(int x, int y) {
        int result = x;
        for ( int i = 0; i < y; i++) {
            result++;
        }
        return result;
    }

    // ETAPA 3 - SOMAR 1 + 1/2 + 1/3 + 1/4 + ... + 1/n, para um dado n, e devolve o valor somado

    public static double somadorDeFracoesPorMeioDeIncrementosSucessivos(int x) {
        double result = 0;
        for ( int i = 1; i <= x; i++) {
            result += 1.0/i;
        }
        return result;
    }

    // ETAPA 4 - INVERTER UMA STRING E IMPRIMIR 

    public static String inverterString(String s) {
        String result = "";
        for ( int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }



        public static void main(String[] args) {
            int x = 6;
            int y = 4;
            System.out.println("ETAPA 1");
            System.out.println(x + " * " + y + " = " + multiplicadorPorMeioDeSomasSucessivas(x, y));
            System.out.println("ETAPA 2");
            System.out.println(x + " + " + y + " = " + somadorPorMeioDeIncrementosSucessivos(x, y));
            System.out.println("ETAPA 3");
            System.out.println("O nUmero final do somatOrio bazeado em x: " + somadorDeFracoesPorMeioDeIncrementosSucessivos(x));
            System.out.println("ETAPA 4");
            String s = "Hello, World! ARARA";
            System.out.println("String original: " + s);
            System.out.println("String invertida: " + inverterString(s));
       
       
        }



}