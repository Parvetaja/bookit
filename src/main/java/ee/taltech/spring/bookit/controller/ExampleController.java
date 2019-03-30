package ee.taltech.spring.bookit.controller;

import ee.taltech.spring.bookit.domain.Todo;
import ee.taltech.spring.bookit.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("todos")
public class ExampleController {

    @Resource
    TodoService service;

    @GetMapping(value = "/{id}")
    public String getTodoById(Model model, @PathVariable Long id) {
        Todo todo = service.getTodoById(id);
        model.addAttribute(todo);
        return "index";
    }

    @GetMapping(value = "api/{id}")
    @ResponseBody
    public Todo GetTodoById(@PathVariable Long id) {
        return service.getTodoById(id);
    }
}
