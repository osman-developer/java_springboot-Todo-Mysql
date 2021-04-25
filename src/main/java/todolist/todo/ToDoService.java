package todolist.todo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

@Service
public class ToDoService {

	@Autowired
	private ToDoRepository toDoRepository;

	public List<ToDo> getAllTodos() {
		return todos;
	}

	public ToDo getTodo(Integer id) {
		return todos.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void createTodo(ToDo todo) {
		todos.add(todo);
	}

	public void updateTodo(ToDo todo, Integer id) {

		for (int i = 0; i < todos.size(); i++) {
			ToDo t = todos.get(i);
			if (t.getId().equals(id)) {
				todos.set(i, todo);
				return;
			}
		}
	}

	public void deleteTodo(Integer id) {
		todos.removeIf(t -> t.getId().equals(id));
	}
}