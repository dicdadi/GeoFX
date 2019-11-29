package dad.javafx.geofx.services;
@SuppressWarnings("serial")
public class GeofxException extends Exception {
public GeofxException() {
		
	}

	public GeofxException(String message) {
		super(message);
		
	}

	public GeofxException(Throwable cause) {
		super(cause);
	
	}

	public GeofxException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public GeofxException(String message, Throwable cause, boolean enableSuppression,boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}
}
