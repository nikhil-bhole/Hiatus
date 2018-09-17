package com.hiatus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hiatus.entities.Record;
import com.hiatus.services.RecordService;


@RestController
@Controller
public class RecordController {
	
	private RecordService recordService;
	
	@Autowired
	public void setRecordService(RecordService recordService) {
	        this.recordService = recordService;
	}
	
	@RequestMapping(value = "saverecord", method = RequestMethod.POST)
	public String saveProduct(Record record) {
		recordService.save(record);
	        return "view-case-details";
	}
	
}
