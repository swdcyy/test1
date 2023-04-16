package okhttp3.internal.ws.RealWebSocket$1;
import java.lang.Runnable;
import okhttp3.internal.ws.RealWebSocket;
import java.lang.Object;
import java.lang.Exception;
import okhttp3.Response;

public class RealWebSocket$1 implements Runnable	// class@001fd5
{
    public final RealWebSocket this$0;

    public void RealWebSocket$1(RealWebSocket p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       try{
          do {
          } while (this.this$0.writeOneFrame());
       }catch(java.io.IOException e0){
          this.this$0.failWebSocket(e0, null);
       }
       return;
    }
}
