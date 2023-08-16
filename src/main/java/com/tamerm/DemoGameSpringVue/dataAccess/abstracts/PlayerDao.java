package com.tamerm.DemoGameSpringVue.dataAccess.abstracts;

import com.tamerm.DemoGameSpringVue.entities.concretes.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface PlayerDao extends JpaRepository<Player, Integer> {
    List<Player> findAll();

    Optional<Player> findById(Integer id);

    @Transactional
    @Modifying
    @Query("UPDATE Player p SET p.name = :name, p.surname = :surname, p.gender = :gender, p.birthdate = :birthdate, p.birthcity = :birthcity WHERE p.id = :id")
    int updatePlayer(@Param("name") String name, @Param("surname") String surname, @Param("gender") String gender, @Param("birthdate") Date birthdate, @Param("birthcity") String birthcity, @Param("id") Integer id);

    @Transactional
    @Modifying
    @Query(value = "update Player p " +
            "set p.point = (p.point + ?1) " +
            "where p.id = ?2", nativeQuery = true)
    boolean gainPoint(Integer point, Integer player_id);

}
