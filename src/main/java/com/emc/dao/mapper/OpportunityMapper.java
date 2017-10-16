package com.emc.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.emc.domain.Opportunity;
import com.emc.domain.Opportunity.Product;
import com.emc.domain.Opportunity.TpmName;


public class OpportunityMapper implements RowMapper<Opportunity> {

	public Opportunity mapRow(ResultSet rs, int rowNum) throws SQLException {
		Opportunity p = new Opportunity();
		
		p.setId(rs.getString("id"));
		p.setOppID(rs.getString("oppID"));
		p.setOrderID(rs.getString("orderID"));
		p.setAccName(rs.getString("accName"));
		//p.setProduct(rs.getString("product"));
		p.setProduct(Product.valueOf(rs.getString("product")));
		p.SetNoOfRacks(rs.getInt("noofracks"));
		//p.setTpmName(rs.getString("tpmName"));
		p.setTpmName(TpmName.valueOf(rs.getString("tpmname")));
		p.setComments(rs.getString("comments"));
	
		return p;
	}

}
