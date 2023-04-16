package com.kwai.video.krtc.rtcengine.render.RtcEngineTextureView$1;
import android.view.TextureView$SurfaceTextureListener;
import com.kwai.video.krtc.rtcengine.render.RtcEngineTextureView;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.rtcengine.render.b;
import android.view.Surface;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.concurrent.CountDownLatch;
import com.kwai.video.krtc.rtcengine.render.RtcEngineTextureView$1$1;
import java.lang.Runnable;
import com.kwai.video.krtc.utils.e;
import com.kwai.video.krtc.rtcengine.RtcEngineGesture;

public class RtcEngineTextureView$1 implements TextureView$SurfaceTextureListener	// class@0008a8
{
    public final RtcEngineTextureView a;

    public void RtcEngineTextureView$1(RtcEngineTextureView p0){
       this.a = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(RtcEngineTextureView$1.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, RtcEngineTextureView$1.class, "1")) {
          return;
       }
       Log.i(RtcEngineTextureView.a(), this+" onSurfaceTextureAvailable\( "+p0+", "+p1+","+p2+"\)");
       if (RtcEngineTextureView.a(this.a) != null) {
          RtcEngineTextureView.a(this.a).b(new Surface(p0));
       }
       this.onSurfaceTextureSizeChanged(p0, p1, p2);
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RtcEngineTextureView$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.i(RtcEngineTextureView.a(), this+" onSurfaceTextureDestroyed\("+p0+"\)");
       if (RtcEngineTextureView.a(this.a) != null) {
          CountDownLatch uCountDownLa = new CountDownLatch(1);
          RtcEngineTextureView.a(this.a).a(new RtcEngineTextureView$1$1(this, uCountDownLa));
          e.a(uCountDownLa);
          Log.i(RtcEngineTextureView.a(), this+" onSurfaceTextureDestroyed\(\) done");
       }
       return false;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(RtcEngineTextureView$1.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, RtcEngineTextureView$1.class, "2")) {
          return;
       }
       Log.i(RtcEngineTextureView.a(), this+" onSurfaceTextureSizeChanged\( "+p0+", "+p1+","+p2+"\)");
       RtcEngineTextureView.a(this.a, p1);
       RtcEngineTextureView.b(this.a, p2);
       if (RtcEngineTextureView.b(this.a) != null) {
          RtcEngineTextureView.b(this.a).a(p1, p2);
       }
       if (RtcEngineTextureView.a(this.a) != null) {
          RtcEngineTextureView.a(this.a).a(p1, p2);
          if (RtcEngineTextureView.c(this.a)) {
             RtcEngineTextureView.a(this.a).renderLastFrame();
          }
       }
       return;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
    }
}
