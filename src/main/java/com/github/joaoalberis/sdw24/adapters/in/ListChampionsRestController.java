package com.github.joaoalberis.sdw24.adapters.in;

import com.github.joaoalberis.sdw24.application.ListChampionsUseCase;
import com.github.joaoalberis.sdw24.domain.model.Champion;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Campeões", description = "Endpoints do dominio de Campeões do LOL.")
@RestController
@RequestMapping("/champions")
public record ListChampionsRestController(ListChampionsUseCase useCase) {

    @GetMapping
    public List<Champion> findAllChampions(){
        return useCase.findAll();
    }

}
