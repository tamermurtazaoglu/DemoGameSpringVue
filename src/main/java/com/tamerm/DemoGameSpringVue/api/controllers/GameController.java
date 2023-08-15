package com.tamerm.DemoGameSpringVue.api.controllers;

import com.tamerm.DemoGameSpringVue.business.abstracts.GameService;
import com.tamerm.DemoGameSpringVue.entities.concretes.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/game")
public class GameController {

    private GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/get-info")
    public Optional<Game> getGameInfo(Integer id){
        return this.gameService.getGameInfo(id);
    }

}
