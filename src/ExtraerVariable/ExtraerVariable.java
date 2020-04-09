package ExtraerVariable;

public class ExtraerVariable {

    /* public boolean validarNombre(String nombre) {

          if (nombre.matches("^[a-z]") && (nombre.length()<10)){
              return true;

          }
          else
              return false;
      }
      aplicamos la tecnica de inline temp
      refactorizamos el codigo con refactor > introduce variable
      para asi despejar el codigo del if
      */

   public boolean validarNombre(String nombre) {

       boolean match = nombre.matches("^[a-z]");
       boolean tamanno = nombre.length() < 10;
       if (match && tamanno){
            return true;
        }
        else
            return false;
    }

}
