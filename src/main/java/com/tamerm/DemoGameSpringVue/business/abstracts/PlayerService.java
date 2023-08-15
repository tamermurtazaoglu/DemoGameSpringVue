package com.tamerm.DemoGameSpringVue.business.abstracts;

import com.tamerm.DemoGameSpringVue.entities.concretes.Action;
import com.tamerm.DemoGameSpringVue.entities.concretes.Player;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface PlayerService {
    List<Player> getAll();

    Optional<Player> findById(Integer id);
    
    boolean updatePlayer(String name, String surname, String gender, Date birthdate, String birthcity, Player player);

    boolean gainPoint(Action action, Player player);

    boolean deleteById(Integer id);
}
