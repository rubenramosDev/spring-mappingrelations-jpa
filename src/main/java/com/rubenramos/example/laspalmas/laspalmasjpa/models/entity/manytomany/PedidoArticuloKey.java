package com.rubenramos.example.laspalmas.laspalmasjpa.models.entity.manytomany;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Se crea esta clase, ya que va a contener los ID de los
 * registros que se vayan creando.
 *
 * Explicacion.
 * https://www.baeldung.com/jpa-many-to-many
 */


@Embeddable
public class PedidoArticuloKey implements Serializable {

    @Column(name = "id_pedido")
    private Long idPedido;

    @Column(name = "id_articulo")
    private Long idArticulo;

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Long getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Long idArticulo) {
        this.idArticulo = idArticulo;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private static final long serialVersionUID = 1L;

}
