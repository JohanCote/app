package correo_servidor.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import correo_servidor.Interfaz.InterfaceNoticia;
import correo_servidor.Objects.Noticia.Noticias;

public class RMIServer extends UnicastRemoteObject implements InterfaceNoticia{
    private List<Noticias> noticias;

    public RMIServer() throws RemoteException {
        noticias = new ArrayList<>();
    }

    @Override
    public boolean crearNotica(int id, String Nombre, String Titular, Date Fecha_Crear, Date Actual_Fecha, String Autor, String Contenido) throws RemoteException {
        Noticias nuevaNoticia = new Noticias(id, Nombre, Titular, Fecha_Crear, Actual_Fecha, Autor, Contenido);
        return noticias.add(nuevaNoticia);
    }

    @Override
    public Noticias obtenerNoticia(int id) throws RemoteException {
        return noticias.stream().filter(n -> n.getid() == id).findFirst().orElse(null);
    }

    @Override
    public boolean actualizarNoticia(int id, String Nombre, String Titular, Date Fecha_Crear, Date Actual_Fecha, String Autor, String Contenido) throws RemoteException {
        Noticias noticia = obtenerNoticia(id);
        if (noticia != null) {
            noticia.setNombre(Nombre);
            noticia.setTitular(Titular);
            noticia.setFecha_Crear(Fecha_Crear);
            noticia.setActual_Fecha(Actual_Fecha);
            noticia.setAutor(Autor);
            noticia.setContenido(Contenido);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarNoticia(int id) throws RemoteException {
        return noticias.removeIf(n -> n.getid() == id);
    }

    @Override
    public List<Noticias> listarNoticias() throws RemoteException {
        return new ArrayList<>(noticias);
    }

    @Override
    public List<Noticias> buscarNoticias(String Busqueda) throws RemoteException {
        return noticias.stream()
            .filter(n -> n.getNombre().contains(Busqueda) ||
                        n.getTitular().contains(Busqueda) ||
                        n.getAutor().contains(Busqueda) ||
                        n.getContenido().contains(Busqueda))
            .collect(Collectors.toList());
    }
}
