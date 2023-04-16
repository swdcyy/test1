package okhttp3.internal.connection.RealConnection$1;
import okhttp3.internal.ws.RealWebSocket$Streams;
import okhttp3.internal.connection.RealConnection;
import okio.d;
import okio.c;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import java.io.IOException;

public class RealConnection$1 extends RealWebSocket$Streams	// class@001f84
{
    public final RealConnection this$0;
    public final StreamAllocation val$streamAllocation;

    public void RealConnection$1(RealConnection p0,boolean p1,d p2,c p3,StreamAllocation p4){
       this.this$0 = p0;
       this.val$streamAllocation = p4;
       super(p1, p2, p3);
    }
    public void close(){
       RealConnection$1 tval$streamA = this.val$streamAllocation;
       tval$streamA.streamFinished(true, tval$streamA.codec(), -1, null);
    }
}
