package okhttp3.internal.ws.RealWebSocket$CancelRunnable;
import java.lang.Runnable;
import okhttp3.internal.ws.RealWebSocket;
import java.lang.Object;

public final class RealWebSocket$CancelRunnable implements Runnable	// class@001fd7
{
    public final RealWebSocket this$0;

    public void RealWebSocket$CancelRunnable(RealWebSocket p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       this.this$0.cancel();
    }
}
