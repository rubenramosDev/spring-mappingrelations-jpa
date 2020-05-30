package com.rubenramos.example.laspalmas.laspalmasjpa.models.entity;

import com.rubenramos.example.laspalmas.laspalmasjpa.models.entity.manytomany.PedidoArticulo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    private Date fechaInicio;
    private Date fechaFin;

    @OneToMany(mappedBy = "pedido")
    List<PedidoArticulo> pedido = new ArrayList<>();

    @ManyToOne
    private EstatusPedido estatusPedido;

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<PedidoArticulo> getPedido() {
        return pedido;
    }

    public void setPedido(List<PedidoArticulo> pedido) {
        this.pedido = pedido;
    }

    public EstatusPedido getEstatusPedido() {
        return estatusPedido;
    }

    public void setEstatusPedido(EstatusPedido estatusPedido) {
        this.estatusPedido = estatusPedido;
    }
}



