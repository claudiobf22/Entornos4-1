package MetodoEnLinea;

public class Original {
        public static int edad = 18;
        public static String mayorDeEdad(){
            return esMayorDeEdad() ? "Es Mayor de Edad" : "No es mayor de edad";
        }

        public static boolean esMayorDeEdad() {

            return edad >= 18;
        }

        public static void main(String[] args) {
            System.out.println(mayorDeEdad());
        }

}
