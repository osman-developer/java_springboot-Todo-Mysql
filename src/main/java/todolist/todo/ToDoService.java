package todolist.todo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ToDoService {

	@Autowired
	private ToDoRepository toDoRepository;

	public List<ToDo> getAllTodos() {
		List<ToDo> todos = new ArrayList<>();
		toDoRepository.findAll().forEach(todos::add);
		return todos;
	}

	public ToDo getTodo(Integer id) {
		return toDoRepository.findById(id).orElse(null);
	}

	public void createTodo(ToDo todo) {
		toDoRepository.save(todo);
	}

	public void updateTodo(ToDo todo, Integer id) {
		toDoRepository.save(todo);
	}

	public void deleteTodo(Integer id) {
		toDoRepository.deleteById(id);
	}
}