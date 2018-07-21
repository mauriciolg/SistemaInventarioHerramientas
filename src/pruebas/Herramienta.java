/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Mauricio
 */
public class Herramienta {
    private String nombreHerramienta;
    private Categoria categoriaHerramienta;
    private int _idHerramienta;

    public String getNombreHerramienta() {
        return nombreHerramienta;
    }

    public void setNombreHerramienta(String nombreHerramienta) {
        this.nombreHerramienta = nombreHerramienta;
    }

    public Categoria getCategoriaHerramienta() {
        return categoriaHerramienta;
    }

    public void setCategoriaHerramienta(Categoria categoriaHerramienta) {
        this.categoriaHerramienta = categoriaHerramienta;
    }

    public int getIdHerramienta() {
        return _idHerramienta;
    }

    public void setIdHerramienta(int _idHerramienta) {
        this._idHerramienta = _idHerramienta;
    }

    public Herramienta(String nombreHerramienta, Categoria categoriaHerramienta, int _idHerramienta) {
        this.nombreHerramienta = nombreHerramienta;
        this.categoriaHerramienta = categoriaHerramienta;
        this._idHerramienta = _idHerramienta;
    }
    
    @Override
    public String toString(){
        return getNombreHerramienta();
    }
    
}
