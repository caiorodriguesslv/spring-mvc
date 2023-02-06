package com.caio.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.caio.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
