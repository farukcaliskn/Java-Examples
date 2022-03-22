package kodlamaio.northwind.core.utilities.result;

public class SuccesDataResult<T> extends DataResult<T> {

	public SuccesDataResult(T data) {
		super(true, null);
		// TODO Auto-generated constructor stub
	}

	public SuccesDataResult(boolean success, T data) {
		super(true, data);
		// TODO Auto-generated constructor stub
	}

	public SuccesDataResult(String message) {
		super(true, null, message);
		// TODO Auto-generated constructor stub
	}

	public SuccesDataResult(T data, String message) {
		super(true, data, message);
		// TODO Auto-generated constructor stub
	}

}
