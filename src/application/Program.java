package application;

import modal.dao.DaoFactory;
import modal.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller finById ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
