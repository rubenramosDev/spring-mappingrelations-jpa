package com.rubenramos.example.laspalmas.laspalmasjpa.models.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class EstatusPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstatusPedido;

    @Column(table = "estatus_pedido")
    private String estatusPedido;

    @OneToMany(mappedBy = "estatusPedido")
    private List<Pedido> pedidos;

    public Long getIdEstatusPedido() {
        return idEstatusPedido;
    }

    public void setIdEstatusPedido(Long idEstatusPedido) {
        this.idEstatusPedido = idEstatusPedido;
    }

    public String getEstatusPedido() {
        return estatusPedido;
    }

    public void setEstatusPedido(String estatusPedido) {
        this.estatusPedido = estatusPedido;
    }
}
