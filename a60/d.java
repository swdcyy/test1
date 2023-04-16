package a60.d;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import z1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Iterable;
import b35.d;
import java.lang.Long;
import a60.b;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import jw4.c;
import a60.c;

public class d extends IRtcEngineEventHandler	// class@000031
{
    public final Set a;

    public void d(){
       super();
       this.a = Collections.newSetFromMap(new ConcurrentHashMap(4));
    }
    public final void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       d.b(this.a, p0);
       return;
    }
    public void onFileStreamPosition(String p0,long p1,long p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, d.class, "3")) {
          return;
       }
       b uob = new b(p0, p1, p2);
       this.a(v0);
       return;
    }
    public void onFileStreamStatus(String p0,int p1){
    }
    public void onFileStreamVideoDecoded(String p0,RtcEngineVideoFrame p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "4")) {
          return;
       }
       if (p1 == null) {
          c.a("Arya5FileStreamObserverDelegate", "onFileStreamVideoDecoded ,but frame is null ");
          return;
       }else {
          this.a(new c(p0, p1));
          return;
       }
    }
}
