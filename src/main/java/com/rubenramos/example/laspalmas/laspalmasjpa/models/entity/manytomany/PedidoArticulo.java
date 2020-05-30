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
 * <p>
 * Explicacion
 * https://www.baeldung.com/jpa-many-to-many
 */
@Entity
public class PedidoArticulo {

//    @EmbeddedId
//    private PedidoArticuloKey idPedidoArticuloKey;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedidoArticulo;

    @ManyToOne
    @MapsId("id_pedido")
    @JoinColumn(name = "id_pedido")
    Pedido pedido;

    @ManyToOne
    @MapsId("id_articulo")
    @JoinColumn(name = "id_articulo")
    Articulo articulo;

    private Integer cantidad;

    private Double precioUnitario;


//    public PedidoArticuloKey getIdPedidoArticuloKey() {
//        return idPedidoArticuloKey;
//    }
//
//    public void setIdPedidoArticuloKey(PedidoArticuloKey idPedidoArticuloKey) {
//        this.idPedidoArticuloKey = idPedidoArticuloKey;
//    }


    public Long getIdPedidoArticulo() {
        return idPedidoArticulo;
    }

    public void setIdPedidoArticulo(Long idPedidoArticulo) {
        this.idPedidoArticulo = idPedidoArticulo;
    }

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
