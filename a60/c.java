package a60.c;
import z1.a;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import java.lang.Object;
import z50.b;
import b60.b;
import java.nio.ByteBuffer;

public final class c implements a	// class@000030
{
    public final String a;
    public final RtcEngineVideoFrame b;

    public void c(String p0,RtcEngineVideoFrame p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       c tb = this.b;
       b uob = new b(tb.data, tb.width, tb.height, tb.timestamp, tb.format, tb.colorSpace);
       p0.c(this.a, v10);
    }
}
