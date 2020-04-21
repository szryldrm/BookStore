package com.softisler.BookStore.Core.Utilities.Result;

public class SuccessDataResult<T> extends DataResult<T>  {

	public SuccessDataResult(T data, boolean success, String message) {
		super(data, success, message);
	}
	
	public SuccessDataResult(T data, boolean success) {
		super(data, success);
	}

}
