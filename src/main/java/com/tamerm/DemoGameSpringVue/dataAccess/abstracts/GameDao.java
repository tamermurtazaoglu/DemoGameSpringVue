package com.tamerm.DemoGameSpringVue.dataAccess.abstracts;

import com.tamerm.DemoGameSpringVue.entities.concretes.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameDao extends JpaRepository<Game, Integer> {
    Optional<Game> findById(Integer id);

    // That is not necessary for now:
//    @Transactional
//    @Modifying
//    @Query("update Game g" +
//            "set g.name= ?1 and " +
//            "g.description = ?2 and " +
//            "g.logo = ?3 and" +
//            "where g.id = ?4")
//    int updateGame(String name, String description, String logo, Integer id);
}
