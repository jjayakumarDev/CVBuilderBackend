package com.cvbuilder.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cvbuilder.entity.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, String> {
    //Empty Login repository extends CrudRepository, which can be overrided later
}