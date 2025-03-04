package com.financialcontrol.controllers;

import com.financialcontrol.dto.TransactionDTO;
import com.financialcontrol.entities.TransactionEntity;
import com.financialcontrol.mappers.TransactionMapper;
import com.financialcontrol.model.TransactionModel;
import com.financialcontrol.services.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/transactions") //criando endereço da minha controller
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;
    private final TransactionMapper transactionMapper;

    @PostMapping
    public ResponseEntity<TransactionDTO> addTransaction(@RequestBody TransactionModel transactionModel) {
        TransactionEntity transactionEntity = transactionService.addTransaction(transactionModel);
        TransactionDTO transactionDTO = transactionMapper.toDTO(transactionEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(transactionMapper.toDTO(transactionEntity));
    }



}

