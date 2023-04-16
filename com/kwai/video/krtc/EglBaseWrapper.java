package com.kwai.video.krtc.EglBaseWrapper;
import java.lang.Object;
import com.kwai.video.krtc.GL.EglBase$Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.krtc.GL.EglBase;
import java.lang.Throwable;
import com.kwai.video.krtc.utils.Log;
import java.lang.Long;
import com.kwai.video.krtc.GL.EglBase14;

public class EglBaseWrapper	// class@00073c
{
    public EglBase eglBase;

    public void EglBaseWrapper(){
       super();
    }
    public final boolean init(EglBase$Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EglBaseWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       EglBase uEglBase = EglBase.create(p0, EglBase.CONFIG_PIXEL_BUFFER);
       this.eglBase = uEglBase;
       uEglBase.createDummyPbufferSurface();
       return true;
    }
    public final boolean makeCurrent(){
       Object obj = PatchProxy.apply(null, this, EglBaseWrapper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          this.eglBase.makeCurrent();
          return true;
       }catch(java.lang.RuntimeException e0){
          Log.e("EglBaseWrapper", "makeCurrent failed", e0);
          return false;
       }
    }
    public final boolean release(){
       EglBaseWrapper obj = PatchProxy.apply(null, this, EglBaseWrapper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.d("EglBaseWrapper", "eglbase release.");
       obj = this.eglBase;
       if (obj != null) {
          obj.release();
          this.eglBase = null;
       }
       return true;
    }
    public final void swapBuffers(long p0){
       EglBaseWrapper uEglBaseWrap = EglBaseWrapper.class;
       if (PatchProxy.isSupport(uEglBaseWrap) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uEglBaseWrap, "3")) {
          return;
       }
       uEglBaseWrap = this.eglBase;
       if (uEglBaseWrap != null) {
          if (uEglBaseWrap instanceof EglBase14) {
             uEglBaseWrap.a(p0);
          }else {
             uEglBaseWrap.swapBuffers();
          }
       }else {
          Log.e("EglBaseWrapper", "eglbase should not null here.");
       }
       return;
    }
}
