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



        public static void main(String[] args) {
            int x = 6;
            int y = 4;
            System.out.println("ETAPA 1");
            System.out.println(x + " * " + y + " = " + multiplicadorPorMeioDeSomasSucessivas(x, y));
            System.out.println("ETAPA 2");
            System.out.println(x + " + " + y + " = " + somadorPorMeioDeIncrementosSucessivos(x, y));
        }



}