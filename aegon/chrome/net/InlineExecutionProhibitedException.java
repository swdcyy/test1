package aegon.chrome.net.InlineExecutionProhibitedException;
import java.util.concurrent.RejectedExecutionException;
import java.lang.String;

public final class InlineExecutionProhibitedException extends RejectedExecutionException	// class@00018b
{

    public void InlineExecutionProhibitedException(){
       super("Inline execution is prohibited for this request");
    }
}
