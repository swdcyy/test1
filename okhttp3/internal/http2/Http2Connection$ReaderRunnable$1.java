package okhttp3.internal.http2.Http2Connection$ReaderRunnable$1;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection$ReaderRunnable;
import java.lang.String;
import java.lang.Object;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Connection$Listener;
import okhttp3.internal.platform.Platform;
import java.lang.StringBuilder;
import java.lang.Throwable;
import okhttp3.internal.http2.ErrorCode;

public class Http2Connection$ReaderRunnable$1 extends NamedRunnable	// class@001fab
{
    public final Http2Connection$ReaderRunnable this$1;
    public final Http2Stream val$newStream;

    public void Http2Connection$ReaderRunnable$1(Http2Connection$ReaderRunnable p0,String p1,Object[] p2,Http2Stream p3){
       this.this$1 = p0;
       this.val$newStream = p3;
       super(p1, p2);
    }
    public void execute(){
       try{
          this.this$1.this$0.listener.onStream(this.val$newStream);
       }catch(java.io.IOException e0){
          Platform platform = Platform.get();
          String str = "Http2Connection.Listener failure for "+this.this$1.this$0.hostname;
          platform.log(4, str, e0);
          this.val$newStream.close(ErrorCode.PROTOCOL_ERROR);
       }catch(java.io.IOException e0){
       }
    }
}
