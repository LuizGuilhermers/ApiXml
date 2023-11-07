package com.ApiXml.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiXml.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
