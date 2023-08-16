package com.tamerm.DemoGameSpringVue.api.controllers;

import com.tamerm.DemoGameSpringVue.business.abstracts.PlayerService;
import com.tamerm.DemoGameSpringVue.entities.concretes.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/player")
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/get-info")
    public Optional<Player> findById(@RequestBody Integer id){
        return this.playerService.findById(id);
    }

    @GetMapping("/get-all")
    public List<Player> getAll(){
        return this.playerService.getAll();
    }

}
