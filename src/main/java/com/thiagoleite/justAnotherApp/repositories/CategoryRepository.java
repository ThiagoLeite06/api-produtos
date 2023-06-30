package com.thiagoleite.justAnotherApp.repositories;

import com.thiagoleite.justAnotherApp.entities.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CategoryRepository {
    // Repository é uma classe especial que acessa os dados.
    // É responsável por manipular os dados.

    // Map é uma coleção de chave/valor... Dicionário.
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
}
