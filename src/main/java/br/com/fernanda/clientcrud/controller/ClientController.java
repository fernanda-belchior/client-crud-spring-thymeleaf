package br.com.fernanda.clientcrud.controller;

import br.com.fernanda.clientcrud.dto.ClientDTO;
import br.com.fernanda.clientcrud.service.impl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class ClientController {

    @Autowired
    private ClientServiceImpl clientServiceImpl;

    @GetMapping("/home")
    public ModelAndView getAll() {
        ModelAndView modelAndView = new ModelAndView("/home");
        modelAndView.addObject("clients", clientServiceImpl.getAll());
        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView add(ClientDTO client) {
        ModelAndView modelAndView = new ModelAndView("/add");
        modelAndView.addObject("client", client);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") long id) {
        return add(clientServiceImpl.getById(id));
    }

    @GetMapping("/remove/{id}")
    public ModelAndView remove(@PathVariable("id") Long id) {
        clientServiceImpl.remove(id);
        return getAll();
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid ClientDTO client, BindingResult result) {
        if (result.hasErrors()) {
            return add(client);
        }

        clientServiceImpl.record(client);

        return getAll();
    }

}
