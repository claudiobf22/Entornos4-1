package Martin;

public class RenombrarMetodo {
    public class Ejercicio {
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
        /*public double redondearAEntero() {
            return (int) Math.round(numero);
        }
        En este método como retorna un int, la firma del método debe ser int, por lo que he realizado "CTRL+SHIFT+A">Change Signature> Cambio el return type y doy en Refactor*/
        public int redondearAEntero() {
            return (int) Math.round(numero);
        }

        public int obtenerNumeroAleatorio() {
            return (int) Math.round( (redondearAEntero() * Math.random()));
        }

    }
}
