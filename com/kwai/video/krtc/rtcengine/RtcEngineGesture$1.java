package com.kwai.video.krtc.rtcengine.RtcEngineGesture$1;
import android.view.ScaleGestureDetector$SimpleOnScaleGestureListener;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture;
import android.view.ScaleGestureDetector;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture$Config;

public class RtcEngineGesture$1 extends ScaleGestureDetector$SimpleOnScaleGestureListener	// class@00083f
{
    public final RtcEngineGesture a;

    public void RtcEngineGesture$1(RtcEngineGesture p0){
       this.a = p0;
       super();
    }
    public boolean onScale(ScaleGestureDetector p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RtcEngineGesture$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       float scaleFactor = p0.getScaleFactor();
       if (Math.abs((scaleFactor - 0x3f800000)) - 0x3c23d70a < 0) {
          return false;
       }
       RtcEngineGesture$1 ta = this.a;
       RtcEngineGesture.a(ta, Math.max(RtcEngineGesture.b(ta).minScale, Math.min((RtcEngineGesture.a(this.a) * scaleFactor), RtcEngineGesture.b(this.a).maxScale)));
       ta = this.a;
       RtcEngineGesture.a(ta, RtcEngineGesture.c(ta), RtcEngineGesture.d(this.a));
       ta = this.a;
       ta.a(RtcEngineGesture.c(ta), RtcEngineGesture.d(this.a), RtcEngineGesture.a(this.a));
       return true;
    }
}
