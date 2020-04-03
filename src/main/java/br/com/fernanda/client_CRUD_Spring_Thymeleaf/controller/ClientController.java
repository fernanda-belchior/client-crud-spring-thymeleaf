package br.com.fernanda.client_CRUD_Spring_Thymeleaf.controller;

import br.com.fernanda.client_CRUD_Spring_Thymeleaf.model.Client;
import br.com.fernanda.client_CRUD_Spring_Thymeleaf.service.impl.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/home")
    public ModelAndView getAll(){
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("clients", clientService.getAll());
        return  modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView add(Client client){
        ModelAndView modelAndView = new ModelAndView("/add");
        modelAndView.addObject("client", client);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") long id) {
        return add(clientService.getById(id));
    }

    @DeleteMapping("/remove/{id}")
    public ModelAndView remove(@PathVariable("id") long id) {
        clientService.remove(id);
        return getAll();
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid Client client, BindingResult result) {
        if(result.hasErrors()) {
            return add(client);
        }

        clientService.record(client);

        return getAll();
    }

}
