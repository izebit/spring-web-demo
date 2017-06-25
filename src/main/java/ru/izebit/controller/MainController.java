package ru.izebit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.izebit.service.ArticleService;

/**
 * @author <a href="mailto:izebit@gmail.com">Artem Konovalov</a> <br/>
 *         Creation date: 6/25/17.
 * @since 1.0
 */
@Controller
@RequestMapping("/blog")
public class MainController {

    @Autowired
    private ArticleService service;

    @RequestMapping
    public String mainPage(Model model) {
        model.addAttribute("message", "Здравствуй мир!");
        return "main";
    }

    @RequestMapping(value = "editor", method = RequestMethod.POST)
    public String editorPage(Model model) {
        return "editor";
    }
}
