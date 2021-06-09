package com.mercadolivre.Diploma.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
    @NotNull(message = "name nao pode ser null")
    @Pattern(regexp = "(^[A-Za-z\\s]{8,50})",
            message = "O nome do estudante deve ter apenas letras e tamanho entre 8 e 50.")
    private String name;
    @NotNull(message = "subjects nao pode ser null")
    @Valid
    private List<SubjectDTO> subjects;
}
