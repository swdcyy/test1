package com.kwai.video.krtc.rtcengine.RtcEngineGesture$2;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture$Listener;
import java.lang.Math;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture$Config;
import java.lang.Float;

public class RtcEngineGesture$2 extends GestureDetector$SimpleOnGestureListener	// class@000840
{
    public final RtcEngineGesture a;

    public void RtcEngineGesture$2(RtcEngineGesture p0){
       this.a = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       RtcEngineGesture$2 ta;
       Object obj = PatchProxy.applyOneRefs(p0, this, RtcEngineGesture$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (RtcEngineGesture.g(this.a) != null) {
          return RtcEngineGesture.g(this.a).onDoubleTap(p0);
       }
       if (Math.abs((RtcEngineGesture.a(this.a) - 0x3f800000)) - 0.01f > 0) {
          RtcEngineGesture.h(this.a);
       }else {
          ta = this.a;
          RtcEngineGesture.a(ta, RtcEngineGesture.b(ta).doubleScale);
       }
       ta = this.a;
       RtcEngineGesture.a(ta, RtcEngineGesture.c(ta), RtcEngineGesture.d(this.a));
       ta = this.a;
       ta.a(RtcEngineGesture.c(ta), RtcEngineGesture.d(this.a), RtcEngineGesture.a(this.a));
       return true;
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       if (PatchProxy.isSupport(RtcEngineGesture$2.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, RtcEngineGesture$2.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       int i = RtcEngineGesture.e(this.a);
       int i1 = RtcEngineGesture.f(this.a);
       if (i > 0 && (i1 <= 0 || Math.abs((RtcEngineGesture.a(this.a) - 0x3f800000)) - 0x3c23d70a < 0)) {
          return false;
       }else {
          float f = RtcEngineGesture.a(this.a);
          RtcEngineGesture$Config scrollSpeed = RtcEngineGesture.b(this.a).scrollSpeed;
          RtcEngineGesture.a(this.a, (RtcEngineGesture.c(this.a) - ((p2 * scrollSpeed) / ((float)i * f))), (RtcEngineGesture.d(this.a) + ((scrollSpeed * p3) / ((float)i1 * f))));
          RtcEngineGesture$2 ta = this.a;
          ta.a(RtcEngineGesture.c(ta), RtcEngineGesture.d(this.a), RtcEngineGesture.a(this.a));
          return true;
       }
    }
}
