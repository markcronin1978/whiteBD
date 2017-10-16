package com.emc.dao;

import java.util.List;

import com.emc.domain.Opportunity;

public interface OpportunityRepository {

	List<Opportunity> findAll();

	Opportunity getById(String id);

	void save(Opportunity opportunity);
}
