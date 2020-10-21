package modal.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obs);
	void update(Seller obs);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
