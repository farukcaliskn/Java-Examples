package kodlamaio.northwind.core.utilities.result;

public class DataResult<T> extends Result {

	private T data;

	public DataResult(boolean success, T data, String message) {
		super(success, message);
		this.data = data;
		// TODO Auto-generated constructor stub
	}

	public DataResult(boolean success, T data) {
		super(success);
		this.data = data;
	}

	public T getData() {
		return data;
	}

}
