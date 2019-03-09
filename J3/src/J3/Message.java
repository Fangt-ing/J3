package J3;

public class Message extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Message (String error) {
	}
	
	public static void err(boolean legal) throws Message {
		if(!Move.check) throw new Message("\nIllegal move!\n");
	}
}
