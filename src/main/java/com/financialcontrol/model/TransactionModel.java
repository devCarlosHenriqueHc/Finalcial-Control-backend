package com.financialcontrol.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionModel {
    private String description;
    private BigDecimal amount;
    private String type;
    private LocalDateTime createdAt;
}
