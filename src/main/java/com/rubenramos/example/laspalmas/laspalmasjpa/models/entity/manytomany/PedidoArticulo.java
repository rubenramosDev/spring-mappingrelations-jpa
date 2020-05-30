package com.rubenramos.example.laspalmas.laspalmasjpa.models.entity.manytomany;

import com.rubenramos.example.laspalmas.laspalmasjpa.models.entity.Articulo;
import com.rubenramos.example.laspalmas.laspalmasjpa.models.entity.Pedido;

import javax.persistence.*;
import java.util.function.DoubleBinaryOperator;


/**
 * Se crea la clase PedidoArticulo ya que en la base de datos
 * existe una relacion NM entre pedido y articulo que tiene
 * sus PROPIOS atributos, es decir, con la anotacion
 * manytomany no se puede crear dicha table, ya que ahi no es posible
 * crear atributos propios.
 *
 * Explicacion
 * https://www.baeldung.com/jpa-many-to-many
 */
@Entity
public class PedidoArticulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedidoArticulo;

//    @EmbeddedId
//    private PedidoArticuloKey pedidoArticuloKey;

    @ManyToOne
    @MapsId("id_pedido")
    @JoinColumn(name = "id_pedido")
    Pedido pedido;

    @ManyToOne
    @MapsId("id_articulo")
    @JoinColumn(name = "id_articulo")
    Articulo articulo;

    private Integer cantidad;

    @Column(name = "precio_unitario")
    private Double precioUnitario;

//
//    public PedidoArticuloKey getPedidoArticuloKey() {
//        return pedidoArticuloKey;
//    }
//
//    public void setPedidoArticuloKey(PedidoArticuloKey pedidoArticuloKey) {
//        this.pedidoArticuloKey = pedidoArticuloKey;
//    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
