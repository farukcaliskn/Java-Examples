package kodlamaio.northwind.core.utilities.result;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data) {
		super(false, null);
		// TODO Auto-generated constructor stub
	}

	public ErrorDataResult(boolean success, T data) {
		super(false, data);
		// TODO Auto-generated constructor stub
	}

	public ErrorDataResult(String message) {
		super(false, null, message);
		// TODO Auto-generated constructor stub
	}

	public ErrorDataResult(T data, String message) {
		super(false, data, message);
		// TODO Auto-generated constructor stub
	}

}
