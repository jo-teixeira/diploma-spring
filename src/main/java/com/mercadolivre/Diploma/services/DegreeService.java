package com.mercadolivre.Diploma.services;

import com.mercadolivre.Diploma.requests.StudentDTO;
import com.mercadolivre.Diploma.requests.SubjectDTO;
import com.mercadolivre.Diploma.responses.DegreeDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DegreeService {
    public DegreeDTO createDegree(StudentDTO studentDTO) {
        List<Integer> notes = studentDTO.getSubjects().stream().map(SubjectDTO::getNote).collect(Collectors.toList());
        Double mean = notes.stream().mapToDouble(number -> number).average().orElse(0.0);
        return new DegreeDTO("Sua média foi de " + mean, mean, studentDTO.getSubjects());
    }
}
