package com.hiatus.services;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiatus.entities.Record;
import com.hiatus.repositories.RecordRepository;

@Service
public class RecordServiceImpl implements RecordService{

	@Autowired
	private RecordRepository recordRepository;
	
	@Autowired
	public void setRecordRepository(RecordRepository recordRepository) {
	      this.recordRepository= recordRepository;
	}
	
	@Override
	public Record save(Record record) {
		
		record.setAge(25);
		return recordRepository.save(record);
	}
	
	public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

}
