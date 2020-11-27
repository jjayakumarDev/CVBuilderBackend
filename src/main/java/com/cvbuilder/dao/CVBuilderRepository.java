package com.cvbuilder.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import com.cvbuilder.entity.CVInfo;

@Repository
public interface CVBuilderRepository extends CrudRepository<CVInfo, String> {

}
