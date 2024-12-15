import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor 

public class Chat{
    private UUID chat_id;
    private LocalDateTime created_at;
    private LocalDateTime last_activity;
    private UUID user_id;

}