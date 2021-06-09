package com.mercadolivre.Diploma.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
    @Pattern(regexp = "(^[A-Za-z\\s]{8,50})",
            message = "O nome do estudante deve ter apenas letras e tamanho entre 8 e 50.")
    private String name;
    @Valid
    private List<SubjectDTO> subjects;
}
