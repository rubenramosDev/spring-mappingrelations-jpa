package com.rubenramos.example.laspalmas.laspalmasjpa.models.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.rubenramos.example.laspalmas.laspalmasjpa.models.entity.manytomany.PedidoArticulo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "articulos")
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticulo;

    private String nombre;

    /*
    * Un articulo puede tener solamente una categoria de
    * articulo.
    * */
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoriaArticulo categoriaArticulo;

    @OneToMany(mappedBy = "articulo")
    List<PedidoArticulo> articulo = new ArrayList<>();

    public Long getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Long idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CategoriaArticulo getCategoriaArticulo() {
        return categoriaArticulo;
    }

    public void setCategoriaArticulo(CategoriaArticulo categoriaArticulo) {
        this.categoriaArticulo = categoriaArticulo;
    }

    public List<PedidoArticulo> getArticulo() {
        return articulo;
    }

    public void setArticulo(List<PedidoArticulo> articulo) {
        this.articulo = articulo;
    }
}
