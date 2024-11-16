package com.student.Exceptions;

public class GenericException extends RuntimeException {

	private int errorcode;
	private String errormessag;
	private String author;

	public int getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}

	public String getErrormessag() {
		return errormessag;
	}

	public void setErrormessag(String errormessag) {
		this.errormessag = errormessag;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public GenericException(int errorcode, String errormessag, String author) {
		super();
		this.errorcode = errorcode;
		this.errormessag = errormessag;
		this.author = author;
	}

	public GenericException() {
		super();
		// TODO Auto-generated constructor stub
	}

}
