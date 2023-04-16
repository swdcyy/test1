package okhttp3.EventListener$2;
import okhttp3.EventListener$Factory;
import okhttp3.EventListener;
import java.lang.Object;
import okhttp3.Call;

public class EventListener$2 implements EventListener$Factory	// class@002074
{
    public final EventListener val$listener;

    public void EventListener$2(EventListener p0){
       this.val$listener = p0;
       super();
    }
    public EventListener create(Call p0){
       return this.val$listener;
    }
}
