package com.financialcontrol.repositories;

import com.financialcontrol.entities.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, UUID> { //1° parametro seleciono entidade e o 2° parametro seleciono o id da entidade.
}
