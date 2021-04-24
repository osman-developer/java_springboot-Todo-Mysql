package todolist.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

	@Autowired // used for dependecy injection
	private ToDoService toDoService;

	@RequestMapping("/todos")
	public List<ToDo> getAllToDos() {
		return toDoService.getAllTodos();

	}

	@RequestMapping("/todo/{id}")
	public ToDo getToDo(@PathVariable Integer id) {
		return toDoService.getTodo(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/todo")
	public void createToDo(@RequestBody ToDo todo) {
		toDoService.createTodo(todo);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/todo/{id}")
	public void updateTodo(@RequestBody ToDo todo, @PathVariable Integer id) {
		toDoService.updateTodo(todo, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/todo/{id}")
	public void deleteTodo(@PathVariable Integer id) {
		toDoService.deleteTodo(id);
		
	}
}