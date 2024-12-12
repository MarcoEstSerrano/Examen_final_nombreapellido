
package examen_final_nombreapellido;

//primero se deben crear los atributos que pidio el profesor los hice igual como los mando para no enredarme
public class Usuario {
    private String usu;
    private String pass;
    private String rol; // para Administrador o Estudiante

    //creamos el constructor, pero este es especial ya que tiene que verificar que la contraseña que se va a añadir
    //tenga 8 digitos para eso existe la opcion de hacerlo con un if PERO añadiendo de una la excepcion.
    public Usuario(String usu, String pass, String rol) {
        if (pass.length() <= 8) {
            throw new IllegalArgumentException("La contraseña debe tener más de 8 caracteres.");
        }
        if (usu.isEmpty() || pass.isEmpty() || rol.isEmpty()) {
            throw new IllegalArgumentException("Ningún campo puede estar vacío.");
        }
        this.usu = usu;
        this.pass = pass;
        this.rol = rol;
    }
// los gets:
    
    public String getUsu() {
        return usu;
    }

    public String getPass() {
        return pass;
    }

    public String getRol() {
        return rol;
    }

    public boolean verificarCredenciales(String nombreUsuario, String contraseña) {
            return this.usu.equals(nombreUsuario) && this.pass.equals(contraseña);
        }
}