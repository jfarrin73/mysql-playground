package com.jfarrin.demosqlapp.Repository;

import com.jfarrin.demosqlapp.Model.Fruit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends CrudRepository<Fruit, Long> {
}
