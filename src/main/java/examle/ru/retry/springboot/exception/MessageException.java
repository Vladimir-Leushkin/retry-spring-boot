package examle.ru.retry.springboot.exception;

public class MessageException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public MessageException(String msg) {
	super(msg);
    }

    public MessageException(String msg, Exception ex) {
	super(msg, ex);
    }
}
