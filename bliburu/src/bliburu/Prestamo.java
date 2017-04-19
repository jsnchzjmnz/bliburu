/*
 * Copyright (C) 2017 julio
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package bliburu;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author julio
 */
public class Prestamo {
    private List<RecursoLiterario> productosPrestados;
    private Cliente cliente;
    private Date fechaActualDeSistema;
    private Date fechaDevolucionLibros;
    private Date fechaDevolucionRevistas;




    
    public Prestamo(){
        Calendar calendar = Calendar.getInstance();
        this.fechaActualDeSistema = calendar.getTime();
    }
    
    public Prestamo(Cliente cliente,List<RecursoLiterario> productosPrestados,
            Date fechaActualDeSistema, Date fechaDevolucionLibros, Date fechaDevolucionRevistas ){
        this.cliente = cliente;
        this.productosPrestados = productosPrestados;
        this.fechaActualDeSistema = fechaActualDeSistema;
        this.fechaDevolucionLibros = fechaDevolucionLibros;
        this.fechaDevolucionRevistas = fechaDevolucionRevistas;
    }


    /*
    GETTERS
    */

    public List<RecursoLiterario> getProductosPrestados() {
        return productosPrestados;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public Date getFecha() {
        return fechaActualDeSistema;
    }
    
    public Date getFechaDevolucionLibros() {
        return fechaDevolucionLibros;
    }
    
    public Date getFechaDevolucionRevistas() {
        return fechaDevolucionRevistas;
    }
    /*
     Setters   
     */    
    public void setProductosPrestados(List<RecursoLiterario> productosPrestados) {
        this.productosPrestados = productosPrestados;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fechaActualDeSistema = fecha;
    }
    
    public void setFechaDevolucionRevistas(Date fechaDevolucionRevistas) {
        this.fechaDevolucionRevistas = fechaDevolucionRevistas;
    }
    
    public void setFechaDevolucionLibros(Date fechaDevolucionLibros) {
        this.fechaDevolucionLibros = fechaDevolucionLibros;
    }
    
    
    
}
