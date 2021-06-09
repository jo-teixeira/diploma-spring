package com.mercadolivre.Diploma.responses;

import com.mercadolivre.Diploma.requests.SubjectDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DegreeDTO {
    private String message;
    private Double average;
    private List<SubjectDTO> subjects;
}
