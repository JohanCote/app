package correo_servidor.Objects.Noticia;

import java.sql.Date;

public class Noticias {
    private int id;
    private String Nombre;
    private String Titular;
    private Date Fecha_Crear;
    private Date Actual_Fecha;
    private String Autor;
    private String Contenido;

    public Noticias(int id, String Nombre, String Titular, Date Fecha_Crear, Date Actual_Fecha, String Autor, String Contenido) {
        this.id = id;
        this.Nombre = Nombre;
        this.Titular = Titular;
        this.Fecha_Crear = Fecha_Crear;
        this.Actual_Fecha = Actual_Fecha;
        this.Autor = Autor;
        this.Contenido = Contenido;
    }

    ////////// GET //////////
    public int getid() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTitular() {
        return Titular;
    }

    public Date getFecha_Crear() {
        return Fecha_Crear;
    }

    public Date getActual_Fecha() {
        return Actual_Fecha;
    }

    public String getAutor() {
        return Autor;
    }

    public String getContenido() {
        return Contenido;
    }

    ////////// SET //////////
    public void setid(int id) {
        this.id = id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public void setFecha_Crear(Date Fecha_Crear) {
        this.Fecha_Crear = Fecha_Crear;
    }

    public void setActual_Fecha(Date Actual_Fecha) {
        this.Actual_Fecha = Actual_Fecha;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }
}
