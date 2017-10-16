package com.emc.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.emc.dao.OpportunityRepository;
import com.emc.dao.mapper.OpportunityMapper;
import com.emc.domain.Opportunity;


@Repository
public class JdbcOpportunityRepository implements OpportunityRepository{

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcOpportunityRepository(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public List<Opportunity> findAll() {
		String sql = "SELECT * FROM opportunity";
		return jdbcTemplate.query(sql, new OpportunityMapper());
	}


	@Override
	public Opportunity getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Opportunity opportunity) {
		jdbcTemplate.update("INSERT INTO opportunity(id, oppid, orderid, accname, product, noofracks, tpmname, comments)" 
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?)", opportunity.getId(),
				opportunity.getOppID(), opportunity.getOrderID(), opportunity.getAccName(),
				opportunity.getProduct().toString(), opportunity.getNoOfRacks(), opportunity.getTpmName().toString(), opportunity.getComments());
			
			
	}

}
