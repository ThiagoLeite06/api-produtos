package com.thiagoleite.justAnotherApp.repositories;

import com.thiagoleite.justAnotherApp.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
/*
    # Repository é uma classe especial que acessa os dados.
    É responsável por manipular os dados.

    # Map é uma coleção de chave/valor... Dicionário.

    private Map<Long, Category> map = new HashMap<>();

    public void save(Category obj) {
        map.put(obj.getId(), obj);
    }

    public Category findById(Long id) {
        return map.get(id);
    }

    public List<Category> findAll() {
        return new ArrayList<Category>(map.values());
    }

    # O JpaRepository já tem todos esses métodos implementados.
      Apenas criamos a interface desse jeito.
*/
}
