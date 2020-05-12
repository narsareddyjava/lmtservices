package com.xtg.employeeleave.eceptions;

public class UnauthorizedRequest extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnauthorizedRequest(String message){super(message);}
}