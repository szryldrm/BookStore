package com.softisler.BookStore.Core.Utilities.Result;

public class DataResult<T> extends Result {

	public DataResult(T data, boolean success, String message) {
		super(success, message);
		Data = data;
	}
	
	public DataResult(T data, boolean success) {
		super(success);
		Data = data;
	}
	
	public T Data;

	public T getData() {
		return Data;
	}

}
