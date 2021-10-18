/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LUIS
 */
public class Proveedor{
    private int id, nit, monto;
    private String nombre,nombre_comercial, direccion, telefono;

    public Proveedor(){}
    
    public Proveedor(int id,int nit, int montob, String nombre, String nombre_comercial, String direccion, String telefono) {
        this.id = id;
        this.nit = nit;
        this.monto = monto;
        this.nombre = nombre;
        this.nombre_comercial = nombre_comercial;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
        
    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
 
      public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre_comercial() {
        return nombre_comercial;
    }

    public void setNombre_comercial(String nombre_comercial) {
        this.nombre_comercial = nombre_comercial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
 
    public int agregar(){return 0;}
    public int modificar(){return 0;}
    public int eliminar(){return 0;}
}
    

