package br.ufg.cinecult.controllers;

import br.ufg.cinecult.dtos.FilmeRecordDto;
import br.ufg.cinecult.models.FilmeModel;
import br.ufg.cinecult.models.ProgramacaoModel;
import br.ufg.cinecult.repositories.FilmeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilmeController {

    @Autowired
    FilmeRepository filmeRepository;

    @PostMapping("/filmes")
    public ResponseEntity<FilmeModel> saveFilme(@RequestBody @Valid FilmeRecordDto filmeRecordDto) {
        var filmeModel = new FilmeModel();
        filmeModel.setProgramacao(new ProgramacaoModel(40));
        BeanUtils.copyProperties(filmeRecordDto, filmeModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(filmeRepository.save(filmeModel));
    }

    @GetMapping("/filmes")
    public ResponseEntity<List<FilmeModel>> getFilmes() {
        return ResponseEntity.status(HttpStatus.OK).body(filmeRepository.findAll());
    }
}
