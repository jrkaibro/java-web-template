package com.knetapp.controllers;

import com.knetapp.dao.TechnologyDAO;
import com.knetapp.models.Technology;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Criado por Junior Kaibro.
 */

@Controller
@RequestMapping("/")
public class PageContoller {

    @Autowired
    private TechnologyDAO technologyDAO;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String printWelcome(ModelMap model) {
        List<Technology> fruits = technologyDAO.getFruits(5);
        model.addAttribute("title", "Anychart Java template");
        model.addAttribute("chartTitle", " 5 melhores Tecnologias");
        model.addAttribute("chartData", new Gson().toJson(fruits));
        return "index";
    }
}
