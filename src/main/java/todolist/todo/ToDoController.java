package todolist.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

	@Autowired //used for dependecy injection
	private ToDoService toDoService;
	
	@RequestMapping("/todos")
	public List<ToDo> getAllToDos(){
		return toDoService.getAllTodos();
		
	}
}
