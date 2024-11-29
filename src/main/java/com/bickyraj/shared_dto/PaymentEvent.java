package com.bickyraj.shared_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class PaymentEvent {
    private Long userId;
    private LocalDateTime createdDate;
    private double totalAmount;
}
