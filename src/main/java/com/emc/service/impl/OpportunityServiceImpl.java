package com.emc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emc.dao.OpportunityRepository;
import com.emc.domain.Opportunity;
import com.emc.service.OpportunityService;


@Service
public class OpportunityServiceImpl implements OpportunityService {
	
	private OpportunityRepository opportunityRepository;
	
	@Autowired
	public OpportunityServiceImpl(OpportunityRepository opportunityRepository) {
		this.opportunityRepository = opportunityRepository;
	}

	@Override
	public List<Opportunity> findAll() {
		return opportunityRepository.findAll();
	}

	@Override
	public Opportunity getById(String id) {
		return opportunityRepository.getById(id);
	}

	@Override
	public void save(Opportunity opportunity) {
		opportunityRepository.save(opportunity);
		
	}

}
