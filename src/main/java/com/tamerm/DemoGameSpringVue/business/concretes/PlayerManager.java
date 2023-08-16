package com.tamerm.DemoGameSpringVue.business.concretes;

import com.tamerm.DemoGameSpringVue.business.abstracts.PlayerService;
import com.tamerm.DemoGameSpringVue.dataAccess.abstracts.PlayerDao;
import com.tamerm.DemoGameSpringVue.entities.concretes.Action;
import com.tamerm.DemoGameSpringVue.entities.concretes.Player;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerManager implements PlayerService {
    PlayerDao playerDao;

    public PlayerManager(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    @Override
    public List<Player> getAll() {
        return this.playerDao.findAll();
    }

    @Override
    public Optional<Player> findById(Integer id) {
        return this.playerDao.findById(id);
    }

    @Override
    public boolean updatePlayer(String name, String surname, String gender, Date birthdate, String birthcity, Player player) {
        playerDao.updatePlayer(name, surname, gender, birthdate, birthcity, player.getId());
        return true;
    }

    @Override
    public boolean gainPoint(Action action, Player player) {
        playerDao.gainPoint(action.getPoint(), player.getId());
        return true;
    }

    @Override
    public boolean deleteById(Integer id) {
        playerDao.deleteById(id);
        return true;
    }

}