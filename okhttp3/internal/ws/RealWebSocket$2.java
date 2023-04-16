package okhttp3.internal.ws.RealWebSocket$2;
import okhttp3.Callback;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.Request;
import java.lang.Object;
import okhttp3.Call;
import java.io.IOException;
import java.lang.Exception;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.ws.RealWebSocket$Streams;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import java.lang.StringBuilder;
import java.lang.String;
import okhttp3.HttpUrl;
import java.net.Socket;
import java.io.Closeable;
import okhttp3.internal.Util;

public class RealWebSocket$2 implements Callback	// class@001fd6
{
    public final RealWebSocket this$0;
    public final Request val$request;

    public void RealWebSocket$2(RealWebSocket p0,Request p1){
       this.this$0 = p0;
       this.val$request = p1;
       super();
    }
    public void onFailure(Call p0,IOException p1){
       this.this$0.failWebSocket(p1, null);
    }
    public void onResponse(Call p0,Response p1){
       try{
          this.this$0.checkResponse(p1);
          StreamAllocation streamAlloca = Internal.instance.streamAllocation(p0);
          streamAlloca.noNewStreams();
          RealWebSocket$Streams streams = streamAlloca.connection().newWebSocketStreams(streamAlloca);
          try{
             RealWebSocket$2 tthis$0 = this.this$0;
             tthis$0.listener.onOpen(tthis$0, p1);
             this.this$0.initReaderAndWriter("OkHttp WebSocket "+this.val$request.url().redact(), streams);
             streamAlloca.connection().socket().setSoTimeout(0);
             this.this$0.loopReader();
          }catch(java.lang.Exception e4){
             this.this$0.failWebSocket(e4, null);
          }
          return;
       }catch(java.net.ProtocolException e4){
          this.this$0.failWebSocket(e4, p1);
          Util.closeQuietly(p1);
          return;
       }
    }
}
