package todolist.todo;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

	@RequestMapping("/todos")
	public List<ToDo> getAllToDos(){
		return null;
		
	}
}
