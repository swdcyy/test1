package okhttp3.internal.http2.Http2Connection$Listener$1;
import okhttp3.internal.http2.Http2Connection$Listener;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.ErrorCode;

public class Http2Connection$Listener$1 extends Http2Connection$Listener	// class@0020cc
{

    public void Http2Connection$Listener$1(){
       super();
    }
    public void onStream(Http2Stream p0){
       p0.close(ErrorCode.REFUSED_STREAM);
    }
}
