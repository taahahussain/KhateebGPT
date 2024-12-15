package messages;


import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor 

public class BotResponses {
    private UUID bot_response_id;
    private String content;
    private LocalDateTime created_at;
    private UUID chat_id;
    private UUID user_id;
    private UID message_id;
    
}
