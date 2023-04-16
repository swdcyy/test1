package com.kwai.video.krtc.rtcengine.render.RtcEngineSurfaceView$1;
import android.opengl.GLSurfaceView$EGLContextFactory;
import com.kwai.video.krtc.rtcengine.render.RtcEngineSurfaceView;
import java.lang.Object;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.GL.EglBase$Context;
import com.kwai.video.krtc.EglContextHolder;
import com.kwai.video.krtc.GL.EglBase10$Context;

public class RtcEngineSurfaceView$1 implements GLSurfaceView$EGLContextFactory	// class@0008a5
{
    public final RtcEngineSurfaceView a;

    public void RtcEngineSurfaceView$1(RtcEngineSurfaceView p0){
       this.a = p0;
       super();
    }
    public EGLContext createContext(EGL10 p0,EGLDisplay p1,EGLConfig p2){
       EglBase$Context uContext1;
       EGLContext obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, RtcEngineSurfaceView$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.i(RtcEngineSurfaceView.a(), this+" createContext\(\)");
       obj = null;
       EglBase$Context uContext = EglContextHolder.sharedContext();
       if (uContext instanceof EglBase10$Context) {
          uContext1 = uContext;
       }else {
          Log.e(RtcEngineSurfaceView.a(), "RtcEngineSurfaceView wrong eglbase, should be eglbase 10");
       }
       int[] uContext2 = new int[3]{0x3098,2,0x3038};
       obj = (uContext1 == null)? EGL10.EGL_NO_CONTEXT: uContext1.nativeEglContext();
       return p0.eglCreateContext(p1, p2, obj, uContext2);
    }
    public void destroyContext(EGL10 p0,EGLDisplay p1,EGLContext p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RtcEngineSurfaceView$1.class, "2")) {
          return;
       }
       RtcEngineSurfaceView.a(this.a);
       p0.eglDestroyContext(p1, p2);
       Log.i(RtcEngineSurfaceView.a(), this+" destroyContext\(\) done");
       return;
    }
}
