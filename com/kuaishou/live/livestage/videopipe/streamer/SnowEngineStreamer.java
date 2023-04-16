package com.kuaishou.live.livestage.videopipe.streamer.SnowEngineStreamer;
import com.kuaishou.live.livestage.videopipe.base.VideoSink3;
import je3.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Handler;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.livestage.videopipe.base.VideoSink3$a;
import com.kuaishou.live.livestage.videopipe.base.VideoSink2$a;
import ue3.a;
import fe3.a;
import pe3.e;
import java.lang.Exception;
import oe3.e;
import java.lang.StringBuilder;
import java.lang.Throwable;
import pe3.c;
import pe3.a;
import ue3.e;

public class SnowEngineStreamer implements VideoSink3	// class@000c20
{
    public e b;
    public a c;
    public final k d;

    public void SnowEngineStreamer(k p0){
       a.p(p0, "snow");
       super();
       this.d = p0;
    }
    public Handler createDataDispatcher(){
       Object[] objArray = null;
       Object[] obj = PatchProxy.apply(objArray, this, SnowEngineStreamer.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(this, objArray, VideoSink3$a.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          Object obj1 = PatchProxy.applyOneRefs(this, objArray, VideoSink2$a.class, "2");
          if (obj1 != PatchProxyResult.class) {
             objArray = obj1;
          }
          obj = objArray;
       }
       return obj;
    }
    public final k getSnow(){
       return this.d;
    }
    public void onCameraFrame(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SnowEngineStreamer.class, "5")) {
          return;
       }
       a.p(p0, "frame");
       this.onReceiveCameraFrame(p0);
       a uoa = new a(p0.getVideoWidth(), p0.getVideoHeight());
       if (a.g(this.c, uoa) ^ 0x01) {
          this.c = uoa;
          this.d.w(uoa);
          this.d.u(uoa);
       }
       return;
    }
    public void onEndOfInput(e p0,Exception p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SnowEngineStreamer.class, "4")) {
          return;
       }
       a.p(p0, "source");
       e d = e.d;
       e.d(d, "LiveStage", "[Streamer] "+"receive "+p0+" endOfInput", null, 4, null);
       if (a.g(p0, this.b)) {
          e.d(d, "LiveStage", "[Streamer] close camera source", null, 4, null);
          this.b = null;
          this.c = null;
       }
       return;
    }
    public void onFrame1(c p0){
       this.onFrame1(p0);
    }
    public synchronized void onFrame1(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SnowEngineStreamer.class, "1")) {
          return;
       }
       a.p(p0, "frame");
       this.onCameraFrame(p0);
       this.d.s(p0.getVideoData());
       return;
    }
    public synchronized void onFrame2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SnowEngineStreamer.class, "2")) {
          return;
       }
       a.p(p0, "frame");
       return;
    }
    public void onFrame2(c p0){
       this.onFrame2(p0);
    }
    public void onFrame3(c p0){
       this.onFrame3(p0);
    }
    public synchronized void onFrame3(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SnowEngineStreamer.class, "3")) {
          return;
       }
       a.p(p0, "frame");
       return;
    }
    public final void onReceiveCameraFrame(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SnowEngineStreamer.class, "6")) {
          return;
       }
       a.p(p0, "frame");
       if (this.b == null) {
          this.b = p0.getSource();
          this.d.r(true);
       }
       return;
    }
    public void release(){
    }
}
