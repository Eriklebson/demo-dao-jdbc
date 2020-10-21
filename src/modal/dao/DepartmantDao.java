package modal.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmantDao {

	void insert(Department obs);
	void update(Department obs);
	void deleteById(Integer id);
	Department findByIn(Integer id);
	List<Department> findAll();
}
