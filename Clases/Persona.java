import java.sql.Date;

public abstract class persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String correo;
    private String contraseña;
    private String legajo;
    public Date fecha_registro;

    public persona(String nombre, String apellido, String dni, String correo, String contraseña,
        String legajo, Date fecha_registro){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.contraseña = correo;
        this.fecha_registro = fecha_registro;
    }
    //GET Y SET DE NOMBRE
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

     // GET Y SET DE APELLIDO
    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    // GET Y SET DE DNI
    public String getdni() {
        return dni;
    }

    public void setdni(String dni) {
        this.dni = dni;
    }

    // GET Y SET DE CORREO
    public String getcorreo() {
        return correo;
    }

    public void setcorreo(String correo) {
        this.correo = correo;
    }

    // GET Y SET DE CONTRASEÑA
    public String getcontraseña() {
        return contraseña;
    }

    public void setcontraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // GET Y SET DE LEGAJO
    public String getlegajo() {
        return legajo;
    }

    public void setlegajo(String legajo) {
        this.legajo = legajo;
    }

    // GET Y SET DE FECHA_REGISTRO
    public Date getfecha_registro() {
        return fecha_registro;
    }

    public void setfecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
