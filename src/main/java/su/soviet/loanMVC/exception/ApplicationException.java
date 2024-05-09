package su.soviet.loanMVC.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "")
public class ApplicationException extends RuntimeException {
}
