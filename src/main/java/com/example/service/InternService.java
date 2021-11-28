package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.InternMapper;
import com.example.model.Intern;

@Service
@Transactional
public class InternService {
    @Autowired
    InternMapper internMapper;
    
    public Intern findIntern(String id) {
    	Intern intern = new Intern();
    	intern.setId(id);
    	Intern searchIntern = this.internMapper.findById(intern);
    	return searchIntern;
    }
    
    public void updateIntern(Intern uptIntern) {
    	int count = this.internMapper.update(uptIntern);
    	System.out.println("update count:" + count);
    }
}
