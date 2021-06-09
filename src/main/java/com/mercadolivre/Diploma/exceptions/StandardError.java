package com.mercadolivre.Diploma.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StandardError {
    private Integer status;
    private String message;
    private Long timestemp;
}
