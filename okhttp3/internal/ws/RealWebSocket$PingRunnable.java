package okhttp3.internal.ws.RealWebSocket$PingRunnable;
import java.lang.Runnable;
import okhttp3.internal.ws.RealWebSocket;
import java.lang.Object;

public final class RealWebSocket$PingRunnable implements Runnable	// class@001fda
{
    public final RealWebSocket this$0;

    public void RealWebSocket$PingRunnable(RealWebSocket p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       this.this$0.writePingFrame();
    }
}
