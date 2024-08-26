package correo_servidor.Interfaz;

public interface InterfaceClient {
    public boolean Usuario(int id, String Nombre, String Contraseña);
    public boolean Administrador(int id, String Nombre, String Contraseña);
}
