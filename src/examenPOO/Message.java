package examenPOO;

import java.time.LocalDate;

public abstract class Message extends Billet{
	
	private String msg;
	
	public Message(LocalDate datePub, String billet,String msg) {
		super(datePub, billet);
		this.msg=msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return super.toString() + "Message [msg=" + msg + "]";
	}
		
}
