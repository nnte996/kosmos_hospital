package com.user.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.user.app.entity.Citas;
import com.user.app.entity.Doctores;
import com.user.app.entity.Consultorios;
import com.user.app.dao.hospitalDao;

@Controller
public class hospitalController {
	@Autowired  
    hospitalDao dao;
	
	@RequestMapping("/Citasform")  
    public String showform(Model m){  
    	m.addAttribute("command", new Citas());
    	return "citasform"; 
    }  
    
	@RequestMapping(value="/save",method = RequestMethod.POST)  
    public String save(@ModelAttribute("citas") Citas citas){  
        dao.save(citas);  
        return "redirect:/vercitas";
    }  
    
	@RequestMapping("/vercitas")  
    public String vercitas(Model m){  
        List<Citas> list = dao.getCitas();  
        m.addAttribute("list",list);
        return "vercitas";  
    }  
    
	@RequestMapping(value="/editcitas/{citasId}")  
    public String edit(@PathVariable int citasId, Model m){  
        
		Citas citas = dao.getCitaById(citasId);  
        m.addAttribute("command",citas);
        return "citaseditform";  
    }  
    
	@RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("cita") Citas citas){  
        dao.update(citas);  
        return "redirect:/vercitas";  
    }  
    
	@RequestMapping(value="/deletecitas/{citaId}",method = RequestMethod.GET)  
    public String delete(@PathVariable int citaId){  
        dao.delete(citaId);  
        return "redirect:/vercitas";  
    }
	
}