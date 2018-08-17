package br.com.sinergia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginCtrl {

    @RequestMapping("/")
    private ModelAndView none() {
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        return modelAndView;
    }

    @RequestMapping("/login")
    private ModelAndView login(@RequestParam(value = "error", required = false) String error,
                               @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView modelAndView = new ModelAndView("/login");
        if (error != null)
            modelAndView.getModelMap().addAttribute("error");
        else if (logout != null)
            modelAndView.getModelMap().addAttribute("mensagem");
        return modelAndView;
    }

}
