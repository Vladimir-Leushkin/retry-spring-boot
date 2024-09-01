package examle.ru.retry.springboot.service;

import examle.ru.retry.springboot.exception.MessageException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;

public interface MessageService {

    @Retryable(retryFor = {MessageException.class}, maxAttempts = 3, backoff = @Backoff(delay = 1000))
    String saveMessage(String message);

    @Recover
    String retrySaveAndFlush(MessageException e, String message);

}
