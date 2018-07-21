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
public class Categoria{
    private String nombreCategoria;
    private int _idCategoria;

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdCategoria() {
        return _idCategoria;
    }

    public void setIdCategoria(int _idCategoria) {
        this._idCategoria = _idCategoria;
    }

    public Categoria(String nombreCategoria, int _idCategoria) {
        this.nombreCategoria = nombreCategoria;
        this._idCategoria = _idCategoria;
    }
    
    @Override
    public String toString(){
        return getNombreCategoria();
    }
}
