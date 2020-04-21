package com.softisler.BookStore.Core.Utilities.Result;

public class ErrorResult extends Result {

	public ErrorResult(String message) {
		super(false, message);
		
	}
	
	public ErrorResult() {
		super(false);
	}

}
