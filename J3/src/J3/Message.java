package J3;

public class Message extends Exception{

	/**
	 * 
	 */
	String error;
	public Message (String error) {
		this.error=error;
	}
	
	@Override
	public String getMessage() {
		return error;
	}
}
