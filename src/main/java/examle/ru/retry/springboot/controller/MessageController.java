package examle.ru.retry.springboot.controller;

import examle.ru.retry.springboot.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class MessageController {

  private final MessageService messageService;

  @GetMapping(value ="/message")
  public ModelAndView saveMessage(@RequestParam String message) {
    var modelAndView = new ModelAndView("index");

    String response = messageService.saveMessage(message);

    modelAndView.addObject("response", response);
    return modelAndView;
  }


}
