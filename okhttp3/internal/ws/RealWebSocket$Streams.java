package okhttp3.internal.ws.RealWebSocket$Streams;
import java.io.Closeable;
import okio.d;
import okio.c;
import java.lang.Object;

public abstract class RealWebSocket$Streams implements Closeable	// class@001fdb
{
    public final boolean client;
    public final c sink;
    public final d source;

    public void RealWebSocket$Streams(boolean p0,d p1,c p2){
       super();
       this.client = p0;
       this.source = p1;
       this.sink = p2;
    }
}
