package fr.lernejo.todo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.web.bind.annotation.*;

@RestController
class TodoListController {
    private final List<Todo> listodo = new ArrayList<>();
    @PostMapping("/api/todo")
    void voidAddtodolist(@RequestBody Todo todovalue){
        listodo.add(todovalue);
    }
    @GetMapping("/api/todo")
    List<Todo> getListodo() {
        return listodo;
    }

}
