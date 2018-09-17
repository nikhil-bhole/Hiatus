package com.hiatus.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiatus.entities.Record;


@Repository("recordRepository")
public interface RecordRepository extends CrudRepository<Record, Integer>{

}
