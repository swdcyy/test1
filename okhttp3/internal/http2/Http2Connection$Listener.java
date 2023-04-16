package okhttp3.internal.http2.Http2Connection$Listener;
import okhttp3.internal.http2.Http2Connection$Listener$1;
import java.lang.Object;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;

public abstract class Http2Connection$Listener	// class@0020cd
{
    public static final Http2Connection$Listener REFUSE_INCOMING_STREAMS;

    static {
       Http2Connection$Listener.REFUSE_INCOMING_STREAMS = new Http2Connection$Listener$1();
    }
    public void Http2Connection$Listener(){
       super();
    }
    public void onSettings(Http2Connection p0){
    }
    public abstract void onStream(Http2Stream p0);
}
