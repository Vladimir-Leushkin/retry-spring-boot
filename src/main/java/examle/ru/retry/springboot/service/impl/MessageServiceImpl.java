package examle.ru.retry.springboot.service.impl;

import examle.ru.retry.springboot.domain.Message;
import examle.ru.retry.springboot.exception.MessageException;
import examle.ru.retry.springboot.service.MessageService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Log4j2
@Service
public class MessageServiceImpl implements MessageService {

  Map<Long, Message> messageMap = new HashMap<>();

  @Override
  public String saveMessage(String message) {

    int random = new Random().nextInt(4);
    if (random % 2 == 0) {
      log.info("Remote API failed");
      throw new MessageException("Remote API failed");
    }

    messageMap.put((long) ((Math.random() * (87900000 - 87850000)) + 877850000), Message.builder().id(123L).content(message).build());
    log.info("success");
    return "success";
  }

  @Override
  public String retrySaveAndFlush(MessageException e, String message) {
    log.info("Remote API failed");
    return "retry save";
  }
}
