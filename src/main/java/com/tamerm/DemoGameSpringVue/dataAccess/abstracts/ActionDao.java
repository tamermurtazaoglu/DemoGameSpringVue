package com.tamerm.DemoGameSpringVue.dataAccess.abstracts;

import com.tamerm.DemoGameSpringVue.entities.concretes.Action;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionDao extends JpaRepository<Action, Integer> {
    
}
