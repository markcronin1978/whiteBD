package com.emc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emc.domain.Opportunity;

@Transactional
@Service
public interface OpportunityService {

	List<Opportunity> findAll();

	Opportunity getById(String id);

	void save(Opportunity opportunity);

}
