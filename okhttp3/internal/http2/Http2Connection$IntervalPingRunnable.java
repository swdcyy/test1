package okhttp3.internal.http2.Http2Connection$IntervalPingRunnable;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.http2.Http2Connection;
import java.lang.Object;
import java.lang.String;

public final class Http2Connection$IntervalPingRunnable extends NamedRunnable	// class@001fa8
{
    public final Http2Connection this$0;

    public void Http2Connection$IntervalPingRunnable(Http2Connection p0){
       this.this$0 = p0;
       Object[] objArray = new Object[]{p0.hostname};
       super("OkHttp %s ping", objArray);
    }
    public void execute(){
       int i;
       Http2Connection$IntervalPingRunnable tthis$0 = this.this$0;
       _monitor_enter(tthis$0);
       Http2Connection$IntervalPingRunnable tthis$01 = this.this$0;
       Http2Connection intervalPing = tthis$01.intervalPingsSent;
       if (tthis$01.intervalPongsReceived - intervalPing < 0) {
          i = 1;
       }else {
          tthis$01.intervalPingsSent = intervalPing + 1;
          i = 0;
       }
       _monitor_exit(tthis$0);
       if (i) {
          tthis$01.failConnection();
       }else {
          tthis$01.writePing(false, 1, false);
       }
       return;
    }
}
