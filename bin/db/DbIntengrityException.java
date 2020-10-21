package db;

public class DbIntengrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DbIntengrityException(String msg) {
		super(msg);
	}
}
