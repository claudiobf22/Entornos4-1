package ExtraccionDelMetodo;

public class ExtraccionDeMetodoRussell {

    public static void main(String[] args) {
         int a =1 ;
        int b =10 ;
        int c = 8 ;

        //primero colocamos este codigo y luego lo refactorizamos.
        //System.out.println( "la suma de los tres valores son : " +  (a + b + c));
        //y nos crea el metodo sumar , aprte de cambiarnos en el system out prinln el nombre del metodo sumar añadiendolo directamente con sus tres variables dentro.
        


        System.out.println( "la suma de los tres valores son : " + sumar(a, b, c));

        }

    private static int sumar(int a, int b, int c) {
        return a + b + c;
    }
}


