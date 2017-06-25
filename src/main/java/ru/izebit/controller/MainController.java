package ru.izebit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a href="mailto:izebit@gmail.com">Artem Konovalov</a> <br/>
 *         Creation date: 6/25/17.
 * @since 1.0
 */
@Controller
@RequestMapping("/blog")
public class MainController {


    @RequestMapping
    public String mainPage(Model model) {
        model.addAttribute("message", "Здравствуй мир!");
        return "main";
    }

}
