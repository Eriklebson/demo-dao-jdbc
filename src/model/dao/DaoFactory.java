
package model.dao;

import db.DB;
import modal.dao.impl.DepartmentDaoJDBC;
import modal.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnetion()); 
	}
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnetion());
	}
}