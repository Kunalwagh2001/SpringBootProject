package StudentMain.Project1.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerClass {

	
	@ExceptionHandler(value = ResousreNotFound.class)
	public ResponseEntity <ApiError>HandleResousreNotFound() {
		ApiError err = new ApiError(400, "Id is Not Available", new Date());
		return new ResponseEntity<ApiError>(err, HttpStatus.BAD_REQUEST);
		
	}
	
}
