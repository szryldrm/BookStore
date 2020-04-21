package com.softisler.BookStore.Core.Utilities.Result;

public class SuccessResult extends Result {

	public SuccessResult(String message) {
		super(true, message);
		
	}
	
	public SuccessResult() {
		super(true);
	}

}