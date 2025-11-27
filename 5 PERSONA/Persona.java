public class Persona {
    // Atributos
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private char sexo;
    private int edad;
    private String direccion;
    private String email; // MEJORA: Nuevo atributo email

    // Constructor por defecto
    public Persona() {
        this.email = ""; // Inicialización del nuevo atributo
    }

    // Constructor de copia
    public Persona(Persona persona) {
        this.nombre = persona.nombre;
        this.apellidoPaterno = persona.apellidoPaterno;
        this.apellidoMaterno = persona.apellidoMaterno;
        this.sexo = persona.sexo;
        this.edad = persona.edad;
        this.direccion = persona.direccion;
        this.email = persona.email; // Constructor de copia con email
    }

    // Constructor común
    public Persona(String nom, String app, String apm, char sexo, int edad, String dir, String email) { // MEJORA: Añadir email al constructor
        this.nombre = nom;
        this.apellidoPaterno = app;
        this.apellidoMaterno = apm;
        this.sexo = sexo;
        this.edad = edad;
        this.direccion = dir;
        this.email = email;
    }

    // Método mayorEdad
    public void mayorEdad(int edad) {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    // Método mostrarDatos
    public String mostrarDatos(Persona persona) {
        String datos = "Los datos son: \n";
        datos += "Nombre: " + persona.nombre + "\n";
        datos += "Apellido Paterno: " + persona.apellidoPaterno + "\n";
        datos += "Apellido Materno: " + persona.apellidoMaterno + "\n";
        datos += "Sexo: " + persona.sexo + "\n";
        datos += "Edad: " + persona.edad + "\n";
        datos += "Dirección: " + persona.direccion + "\n";
        datos += "Email: " + persona.email + "\n"; // MEJORA: Mostrar email
        return datos;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // MEJORA: Getter y Setter para email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
