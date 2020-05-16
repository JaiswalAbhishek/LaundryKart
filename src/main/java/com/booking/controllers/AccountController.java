package com.booking.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.booking.configuration.HibernateConfiguration;
import com.booking.model.Customer;
import com.booking.model.Employee;
import com.booking.model.Equipement;
import com.booking.model.StoreDetails;

@Controller
@RequestMapping(value="/admin")
public class AccountController {

	@Autowired	
	HibernateConfiguration hibernateConfig;
	
	@RequestMapping(value="/store",method = RequestMethod.GET)
	public String dashboard(Model model) {
		
		model.addAttribute("employee", new Employee());
		model.addAttribute("store", new StoreDetails());
		model.addAttribute("equipement", new Equipement());
		return "index";
	}
	
	@RequestMapping(value="/store",method = RequestMethod.POST)
	public String addStore( @Valid @ModelAttribute("store") StoreDetails storeDetails,
										BindingResult bindingResult,
										@ModelAttribute("employee") Employee employee,
										@ModelAttribute("equipement") Equipement equipement) {
		
		Session session = hibernateConfig.getHibernateSession();
		session.beginTransaction();
		session.save(storeDetails);
		System.out.println("OBj: "+storeDetails.toString());
		session.getTransaction().commit();
		session.close();
		
		return "redirect:/admin/store";
	}
	
	@RequestMapping(value="/employee",method = RequestMethod.POST)
	public String addEmployee(@Valid @ModelAttribute("employee") Employee employee,
									 BindingResult bindingResult,
									 @ModelAttribute("equipement") Equipement equipement,
									 @ModelAttribute("store")StoreDetails storeDetails) {
		System.out.println(employee.toString());
		
		Configuration config =	 new Configuration();
		SessionFactory sessionFactory = config.configure("hibernate.cfg.xml").buildSessionFactory();
	    Session session = sessionFactory.openSession();
		
		//Session session = hibernateConfig.getHibernateSession();
		session.beginTransaction();
		String res=(String)session.save(employee);
		System.out.println(res.toString());
		session.getTransaction().commit();
		session.close();
		
		return "redirect:/admin/store";
	}
	
	@RequestMapping(value="/equipement",method = RequestMethod.POST)
	public String addEmployee(@Valid @ModelAttribute("equipement") Equipement equipement,
									 BindingResult bindingResult,
									 @ModelAttribute("employee") Employee employee,
									 @ModelAttribute("store")StoreDetails storeDetails) {
		Session session = hibernateConfig.getHibernateSession();
		session.beginTransaction();
		session.save(equipement);
		session.getTransaction().commit();
		session.close();
		
		System.out.println(equipement.toString());
		return "redirect:/admin/store";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
/*
@RequestMapping(value="/account",method = RequestMethod.POST)
	public String saveAccountPage(@Valid @ModelAttribute("employee") Employee employee,BindingResult bindingResult) {
		//@ModelAttribute("store") StoreDetails storeDetails,HttpServletRequest request
		System.out.println(employee.toString());
		return "redirect:/create/account";
	}
	
	
	@RequestMapping(value="/newStore",method = RequestMethod.POST)
	public String saveStoreDetails(@Valid @ModelAttribute("store") StoreDetails storeDetails,BindingResult bindingResult) {
		//,@ModelAttribute("employee") Employee employee,HttpServletRequest request
		System.out.println(storeDetails.toString());
		return "redirect:/create/account";
	}
 */