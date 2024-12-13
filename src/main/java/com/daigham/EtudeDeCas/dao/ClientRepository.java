package com.daigham.EtudeDeCas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daigham.EtudeDeCas.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
