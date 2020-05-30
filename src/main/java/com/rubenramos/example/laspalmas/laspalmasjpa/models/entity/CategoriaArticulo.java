package com.rubenramos.example.laspalmas.laspalmasjpa.models.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categoria_articulo")
public class CategoriaArticulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoriaArtiulo;

    @Column(unique = true)
    private String nombre;

    /*
     * Se utiliza un array list ya que varios articulos
     * pueden tener esta categoria.
     *
     * Se da la indicacion de mappedBy para indicar que
     * el proceso de relacion lo hara el atributo llamada
     * categoriaArticulo en la clase articulo.
     *
     *
     * */
    @OneToMany(mappedBy = "categoriaArticulo")
    private List<Articulo> listaArticulos;

    public CategoriaArticulo() {
        listaArticulos = new ArrayList<>();
    }

    public Long getIdCategoriaArtiulo() {
        return idCategoriaArtiulo;
    }

    public void setIdCategoriaArtiulo(Long idCategoriaArtiulo) {
        this.idCategoriaArtiulo = idCategoriaArtiulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(List<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }
}
