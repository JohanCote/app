package correo_servidor.Interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceSistem extends Remote{
    void crearNotica(String email) throws RemoteException;
    String readNoticia(int id)  throws RemoteException;
    void updateNoticia(int id, String newContent) throws RemoteException;
    void deleteNoticia(int id) throws RemoteException;
    String searchNoticia(String keyword) throws RemoteException;
}
