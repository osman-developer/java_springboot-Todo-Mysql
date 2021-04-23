package todolist.todo;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ToDoService {
	private List<ToDo> todos = new ArrayList<>(Arrays.asList(
			new ToDo(1, "task1", "summary1", "descript1"),
			new ToDo(2, "task2", "summary2", "descript2")
			)
		);
	
	public List<ToDo> getAllTodos(){
		return todos;
	}

	public ToDo getTodo(Integer id) {
		return todos.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
