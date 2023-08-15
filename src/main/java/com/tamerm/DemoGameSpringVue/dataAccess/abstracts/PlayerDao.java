package com.tamerm.DemoGameSpringVue.dataAccess.abstracts;

import com.tamerm.DemoGameSpringVue.entities.concretes.Player;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface PlayerDao extends JpaRepository<Player, Integer> {
    List<Player> findAll();

    Optional<Player> findById(Integer id);

    @Transactional
    @Modifying
    @Query("update Player p" +
            "set p.name= ?1 and " +
            "p.surname = ?2 and " +
            "p.gender = ?3 and" +
            "p.birthdate = ?4 and " +
            "p.birthcity = ?5 " +
            "where p.id = ?6")
    int updatePlayer(String name, String surname, String gender, Date birthdate, String birthcity, Integer id);
}
