package ee.taltech.spring.bookit.service;

import ee.taltech.spring.bookit.domain.Todo;
import ee.taltech.spring.bookit.repository.TodoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TodoService {

    @Resource
    TodoRepository repo;

    public Todo getTodoById(Long id) {
        return repo.getOne(id);
    }
}
