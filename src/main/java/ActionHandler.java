import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
public class ActionHandler {
    String action;
    public ActionHandler(String action){
        this.action=action;
    }
}
