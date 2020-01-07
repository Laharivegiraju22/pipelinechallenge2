package com.mindtree.company.exception;

public class ControllerException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ControllerException() {
		super();
		
	}
//webhook
	public ControllerException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		
	}

	public ControllerException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public ControllerException(String arg0) {
		super(arg0);
		
	}

	public ControllerException(Throwable arg0) {
		super(arg0);
		
	}
	
	

	
}
