package correo_servidor.Interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.List;

import correo_servidor.Objects.Noticia.Noticias;

public interface InterfaceNoticia extends Remote{
    public boolean crearNotica(int id, String Nombre, String Titular, Date Fecha_Crear, Date Actual_Fecha, String Autor, String Contenido) throws RemoteException;
    public Noticias obtenerNoticia(int id) throws RemoteException;
    public boolean actualizarNoticia(int id, String Nombre, String Titular, Date Fecha_Crear, Date Actual_Fecha, String Autor, String Contenido) throws RemoteException;
    public boolean eliminarNoticia(int id) throws RemoteException;
    public List<Noticias> listarNoticias() throws RemoteException;
    public List<Noticias> buscarNoticias(String Busqueda) throws RemoteException;
}
