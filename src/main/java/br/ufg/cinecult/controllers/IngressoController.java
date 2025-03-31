package br.ufg.cinecult.controllers;

import br.ufg.cinecult.dtos.FilmeRecordDto;
import br.ufg.cinecult.dtos.IngressoRecordDto;
import br.ufg.cinecult.models.FilmeModel;
import br.ufg.cinecult.models.IngressoModel;
import br.ufg.cinecult.models.ProgramacaoModel;
import br.ufg.cinecult.repositories.FilmeRepository;
import br.ufg.cinecult.repositories.IngressoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
public class IngressoController {

    @Autowired
    IngressoRepository ingressoRepository;

    @Autowired
    FilmeRepository filmeRepository;

    @PostMapping("/ingresso")
    public ResponseEntity<IngressoModel> saveIngresso(@RequestBody @Valid IngressoRecordDto ingressoRecordDto) {
        var ingressoModel = new IngressoModel();
        System.out.println("o id: "+ filmeRepository.findById(ingressoRecordDto.filme().getIdFilme()));
        Optional<FilmeModel> filme0 = filmeRepository.findById(ingressoRecordDto.filme().getIdFilme());
        BeanUtils.copyProperties(ingressoRecordDto, ingressoModel);
        FilmeRecordDto fDto = new FilmeRecordDto(
                filme0.get().getIdFilme(),
                filme0.get().getTitulo(),
                filme0.get().getProgramacao(),
                filme0.get().getDirecao(),
                filme0.get().getSinopse(),
                filme0.get().getAnoEstreia(),
                filme0.get().getDuracao(),
                filme0.get().getCaminhoImagem());

        var filmeModel = filme0.get();
        BeanUtils.copyProperties(fDto, filme0);
        filmeRepository.save(filmeModel);
        ProgramacaoModel programacaoModel = filmeModel.getProgramacao();
        programacaoModel.setQuantidade(programacaoModel.getQuantidade()-1);
        filmeModel.setProgramacao(programacaoModel);
        System.out.println("idFilme"+filmeModel.getIdFilme());
        ingressoModel.setFilme(filmeModel);
        System.out.println("a data exib: "+ ingressoModel.getDataExibicao());
        return ResponseEntity.status(HttpStatus.CREATED).body(ingressoRepository.save(ingressoModel));
    }



}
