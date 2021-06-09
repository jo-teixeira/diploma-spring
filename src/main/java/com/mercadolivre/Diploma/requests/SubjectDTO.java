package com.mercadolivre.Diploma.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SubjectDTO {
    @NotNull(message = "subject nao pode ser null")
    @Pattern(regexp = "(^[A-Za-z\\s]{8,50})", message = "O nome da materia deve ter apenas letras " +
                                                            "e deve ter tamanho entre 8 e 50.")
    private String subject;
    @NotNull(message = "note nao pode ser null")
    @Range(min = 0, max = 10, message = "A nota dever estar entre 0 e 10")
    private Integer note;
}
