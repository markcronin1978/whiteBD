package com.emc.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emc.domain.Opportunity;
import com.emc.domain.Opportunity.TpmName;
import com.emc.domain.Opportunity.Product;
import com.emc.service.OpportunityService;



@Controller
public class WebController {
	
	private OpportunityService opportunityService;
	
	@Autowired
	public WebController(OpportunityService opportunityService) {
		this.opportunityService = opportunityService;
	}
	/**
	 * this returns the opening web page. List of all Opp's and if user is logged in this will display the
	 * Add Opportunity Function
	 * @param model
	 * @return list of all Opps in the DB..
	 */
	@RequestMapping(value="/", method = RequestMethod.GET)               
	public String openingPage(Model model) {
		model.addAttribute("opportunity", new Opportunity());
		
		model.addAttribute("enumTpnName", TpmName.values());
		model.addAttribute("enumProduct", Product.values());
		
		//return "main";
		//model.addAttribute("opportunity1", opportunityService.findAll());
		//model.addAttribute("tpmName", TpmName.values());
		
		return "main"; 
	}
	
	/**
	 * display the add new Opportunity form
	 * @param model
	 * @return oppForm to add opp to DB
	 */
	/**@RequestMapping(value = "/", method = RequestMethod.GET)
	public String oppForm(Model model){
		model.addAttribute("opportunity", new Opportunity());
		
		model.addAttribute("enumValues", TpmName.values());
		model.addAttribute("enumProduct", Product.values());
		
		return "oppForm";
	}**/
	/**
	 * NOT IN USE AT THE MOMENT
	 * display the add new Opportunity form
	 * @param model
	 * @return information on selected Opp. 
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String editOpp(Model model, @PathVariable String id) {
		model.addAttribute("opportunity", opportunityService.getById(id));
		return "editOpportunityForm";
	}
	

	
	/**
	 * Save Opportunity information
	 * @param patient
	 * @param results
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/saveOpp", method = RequestMethod.POST)
	public String addOpportunity(@ModelAttribute Opportunity opportunity,Model model){
		opportunityService.save(opportunity);
		return "redirect:/";
		
	}
	
}
