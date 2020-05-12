package com.xtg.employeeleave.eceptions;

public class DataNotFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataNotFoundException(String message){
        super(message);
    }
}