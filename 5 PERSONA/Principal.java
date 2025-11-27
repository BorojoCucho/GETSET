public class Principal {
    public static void main(String[] args) {
        // Guardamos los datos
        Persona persona = new Persona();
        persona.setNombre("Linda");
        persona.setApellidoPaterno("Gómez");
        persona.setApellidoMaterno("Pérez");
        persona.setSexo('H');
        persona.setEdad(28);
        persona.setDireccion("Calle Aribau, Madrid");
        persona.setEmail("linda.gomez@ejemplo.com"); // MEJORA: Asignar email

        // Obtenemos los datos y los imprimimos
        String nombre = persona.getNombre();
        String app = persona.getApellidoPaterno();
        String apm = persona.getApellidoMaterno();
        char sexo = persona.getSexo();
        int edad = persona.getEdad();
        String direccion = persona.getDireccion();
        String email = persona.getEmail(); // MEJORA: Obtener email

        System.out.println("los datos de la persona son: " + nombre + ", " + app + ", " + apm + ", " + sexo + ", " + edad + ", " + direccion + ", " + email);
    }
}
