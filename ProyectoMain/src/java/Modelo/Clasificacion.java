/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Clasificacion {
    int id;
    String NCodigo, Nombre, Estado;

    public Clasificacion() {
    }

    public Clasificacion(int id, String NCodigo, String Nombre, String Estado) {
        this.id = id;
        this.NCodigo = NCodigo;
        this.Nombre = Nombre;
        this.Estado = Estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNCodigo() {
        return NCodigo;
    }

    public void setNCodigo(String NCodigo) {
        this.NCodigo = NCodigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
