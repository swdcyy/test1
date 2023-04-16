package okhttp3.internal.http2.Http2Connection$Builder;
import java.lang.Object;
import okhttp3.internal.http2.Http2Connection$Listener;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.http2.Http2Connection;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.lang.String;
import okio.n;
import okio.l;
import okio.d;
import okio.m;
import okio.c;

public class Http2Connection$Builder	// class@001fa7
{
    public boolean client;
    public String hostname;
    public Http2Connection$Listener listener;
    public int pingIntervalMillis;
    public PushObserver pushObserver;
    public c sink;
    public Socket socket;
    public d source;

    public void Http2Connection$Builder(boolean p0){
       super();
       this.listener = Http2Connection$Listener.REFUSE_INCOMING_STREAMS;
       this.pushObserver = PushObserver.CANCEL;
       this.client = p0;
    }
    public Http2Connection build(){
       return new Http2Connection(this);
    }
    public Http2Connection$Builder listener(Http2Connection$Listener p0){
       this.listener = p0;
       return this;
    }
    public Http2Connection$Builder pingIntervalMillis(int p0){
       this.pingIntervalMillis = p0;
       return this;
    }
    public Http2Connection$Builder pushObserver(PushObserver p0){
       this.pushObserver = p0;
       return this;
    }
    public Http2Connection$Builder socket(Socket p0){
       return this.socket(p0, p0.getRemoteSocketAddress().getHostName(), l.d(l.l(p0)), l.c(l.h(p0)));
    }
    public Http2Connection$Builder socket(Socket p0,String p1,d p2,c p3){
       this.socket = p0;
       this.hostname = p1;
       this.source = p2;
       this.sink = p3;
       return this;
    }
}
