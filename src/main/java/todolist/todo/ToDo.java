package todolist.todo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todo")//to map the todo to the db table 
public class ToDo {
	//it tells that the id is the primary in repos
	@Id
	Integer id;
	String name;
	String summary;
	String description;

	public ToDo() {

	}

	public ToDo(Integer id, String name, String summary, String description) {
		super();
		this.id = id;
		this.name = name;
		this.summary = summary;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
