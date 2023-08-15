package com.tamerm.DemoGameSpringVue.dataAccess.abstracts;

import com.tamerm.DemoGameSpringVue.entities.concretes.Game;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface GameDao extends JpaRepository<Game, Integer> {
    Game findFirst();

    @Transactional
    @Modifying
    @Query("update Game g" +
            "set g.name= ?1 and " +
            "g.description = ?2 and " +
            "g.logo = ?3 and" +
            "where g.id = ?4")
    int updateGame(String name, String description, String logo, Integer id);

}
