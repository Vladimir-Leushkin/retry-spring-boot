package examle.ru.retry.springboot.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {

    private Long id;
    private String content;
}
