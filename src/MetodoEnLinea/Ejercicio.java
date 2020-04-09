package MetodoEnLinea;

public class Ejercicio {
    public static int edad = 18;
    public static String mayorDeEdad(){

        return edad >= 18 ? "Es Mayor de Edad" : "No es mayor de edad";
    }

    public static void main(String[] args) {
        System.out.println(mayorDeEdad());
    }

    //Hemos refactorizado con el inline method. Teníamos un código excesivamente largo para lo que requeríamos
    // Haciendo click derecho en el método innecesario hemos refactorizado

}
