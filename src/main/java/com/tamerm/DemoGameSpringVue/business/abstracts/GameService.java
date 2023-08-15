package com.tamerm.DemoGameSpringVue.business.abstracts;

import com.tamerm.DemoGameSpringVue.entities.concretes.Game;

import java.util.Optional;

public interface GameService {
    Optional<Game> getGameInfo(Integer id);

    // boolean updateGame();
}
