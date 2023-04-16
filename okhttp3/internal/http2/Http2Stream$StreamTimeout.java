package okhttp3.internal.http2.Http2Stream$StreamTimeout;
import okio.a;
import okhttp3.internal.http2.Http2Stream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.lang.String;
import java.lang.Throwable;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

public class Http2Stream$StreamTimeout extends a	// class@001fb5
{
    public final Http2Stream this$0;

    public void Http2Stream$StreamTimeout(Http2Stream p0){
       this.this$0 = p0;
       super();
    }
    public void exitAndThrowIfTimedOut(){
       if (!this.exit()) {
          return;
       }
       throw this.newTimeoutException(null);
    }
    public IOException newTimeoutException(IOException p0){
       SocketTimeoutException socketTimeou = new SocketTimeoutException("timeout");
       if (p0 != null) {
          socketTimeou.initCause(p0);
       }
       return socketTimeou;
    }
    public void timedOut(){
       this.this$0.closeLater(ErrorCode.CANCEL);
       this.this$0.connection.sendDegradedPingLater();
    }
}
