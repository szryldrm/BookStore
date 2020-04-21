package com.softisler.BookStore.Core.Utilities.Result;

public class Result {

	public boolean Success;
	public String Message;
	
	public boolean isSuccess() {
		return Success;
	}
	public String getMessage() {
		return Message;
	}
	
	public Result(boolean success, String message)
    {
		Success = success;
        Message = message;
    }
	
	public Result(boolean success)
    {
        Success = success;
    }
	
	
	
}
