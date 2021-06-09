package com.mercadolivre.Diploma.controller;

import com.mercadolivre.Diploma.requests.StudentDTO;
import com.mercadolivre.Diploma.services.DegreeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mercadolivre.Diploma.responses.DegreeDTO;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
public class DegreeController {
    private final DegreeService degreeService;

    @PostMapping("/analyzeNotes")
    public ResponseEntity<DegreeDTO> createDegree(@RequestBody @Valid StudentDTO studentDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(degreeService.createDegree(studentDTO));
    }
}
