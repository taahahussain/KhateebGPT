import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor 

public class messages {
    private UUID message_id;
    private String content;
    private LocalDateTime created_at;
    private UUID chat_id;
    private UUID user_id;
    
}
