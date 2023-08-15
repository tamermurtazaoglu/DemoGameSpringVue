package com.tamerm.DemoGameSpringVue.business.concretes;

import com.tamerm.DemoGameSpringVue.business.abstracts.GameService;
import com.tamerm.DemoGameSpringVue.dataAccess.abstracts.GameDao;
import com.tamerm.DemoGameSpringVue.entities.concretes.Game;

public class GameManager implements GameService {
    GameDao gameDao;

    public GameManager(GameDao gameDao) {
        this.gameDao = gameDao;
    }

    @Override
    public Game getGameInfo() {
        return gameDao.findFirst();
    }

}
