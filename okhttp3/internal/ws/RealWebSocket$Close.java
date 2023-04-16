package okhttp3.internal.ws.RealWebSocket$Close;
import okio.ByteString;
import java.lang.Object;

public final class RealWebSocket$Close	// class@001fd8
{
    public final long cancelAfterCloseMillis;
    public final int code;
    public final ByteString reason;

    public void RealWebSocket$Close(int p0,ByteString p1,long p2){
       super();
       this.code = p0;
       this.reason = p1;
       this.cancelAfterCloseMillis = p2;
    }
}
