package dto;

public class UserException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	UserException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return ("Exception Occurred" + msg);
	}
}
