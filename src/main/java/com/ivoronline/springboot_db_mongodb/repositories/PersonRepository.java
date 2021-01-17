package com.ivoronline.springboot_db_mongodb.repositories;

import com.ivoronline.springboot_db_mongodb.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }
