package ExtraccionDelMetodo;

public class Ejercicio {


//esta rama es solo para los metodos de composición .... cada uno se tiene que inventar un metodo explicarlo y hacer lo que tienen que hacer ....


        private double numero;

        //getters y setters
        public double getNumero() {
            return numero;
        }

        public void setNumero(double numero) {
            this.numero = numero;
        }

        public double calcularRaizCuadrada() {
            return Math.sqrt(numero);
        }

        public double calcularRaizCubica() {
            return Math.abs(Math.cbrt(numero));
        }
        public int redondearAEntero() {
            return (int) Math.round(numero);
        }

        public int obtenerNumeroAleatorio() {
            return (int) Math.round( (redondearAEntero() * Math.random()));
        }




        //codigo de refactorizacion russell
        int a ;
        int b ;




    }


