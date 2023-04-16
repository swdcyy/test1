package com.kwai.video.krtc.GL.EglBase;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.krtc.GL.EglBase$Context;
import com.kwai.video.krtc.GL.EglBase14;
import com.kwai.video.krtc.GL.EglBase14$Context;
import com.kwai.video.krtc.GL.EglBase10;
import com.kwai.video.krtc.GL.EglBase10$Context;
import javax.microedition.khronos.egl.EGLContext;
import android.opengl.EGLContext;
import android.graphics.SurfaceTexture;
import android.view.Surface;

public abstract class EglBase	// class@000746
{
    public static final int[] CONFIG_PIXEL_BUFFER;
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER;
    public static final int[] CONFIG_PLAIN;
    public static final int[] CONFIG_RECORDABLE;
    public static final int[] CONFIG_RGBA;
    public static final Object lock;

    static {
       EglBase.lock = new Object();
       EglBase.CONFIG_PLAIN = new int[9]{0x3024,8,0x3023,8,0x3022,8,0x3040,4,0x3038};
       EglBase.CONFIG_RGBA = new int[11]{0x3024,8,0x3023,8,0x3022,8,0x3021,8,0x3040,4,0x3038};
       EglBase.CONFIG_PIXEL_BUFFER = new int[11]{0x3024,8,0x3023,8,0x3022,8,0x3040,4,0x3033,1,0x3038};
       EglBase.CONFIG_PIXEL_RGBA_BUFFER = new int[13]{0x3024,8,0x3023,8,0x3022,8,0x3021,8,0x3040,4,0x3033,1,0x3038};
       EglBase.CONFIG_RECORDABLE = new int[11]{0x3024,8,0x3023,8,0x3022,8,0x3040,4,0x3142,1,0x3038};
    }
    public void EglBase(){
       super();
    }
    public static EglBase create(){
       Object obj = PatchProxy.apply(null, null, EglBase.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EglBase.create(null, EglBase.CONFIG_PLAIN);
    }
    public static EglBase create(EglBase$Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EglBase.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EglBase.create(p0, EglBase.CONFIG_PLAIN);
    }
    public static EglBase create(EglBase$Context p0,int[] p1){
       EglBase10 uEglBase10;
       EglBase14 obj = PatchProxy.applyTwoRefs(p0, p1, null, EglBase.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (EglBase14.a() && (p0 == null || p0 instanceof EglBase14$Context))? new EglBase14(p0, p1): new EglBase10(p0, p1);
       return obj;
    }
    public static EglBase createEgl10(EGLContext p0,int[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EglBase.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EglBase10(new EglBase10$Context(p0), p1);
    }
    public static EglBase createEgl10(int[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EglBase.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EglBase10(null, p0);
    }
    public static EglBase createEgl14(EGLContext p0,int[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EglBase.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EglBase14(new EglBase14$Context(p0), p1);
    }
    public static EglBase createEgl14(int[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EglBase.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EglBase14(null, p0);
    }
    public static boolean isEgl14Context(EglBase$Context p0){
       return p0 instanceof EglBase14$Context;
    }
    public abstract void createDummyPbufferSurface();
    public abstract void createPbufferSurface(int p0,int p1);
    public abstract void createSurface(SurfaceTexture p0);
    public abstract void createSurface(Surface p0);
    public abstract void detachCurrent();
    public abstract EglBase$Context getEglBaseContext();
    public abstract boolean hasSurface();
    public abstract void makeCurrent();
    public abstract void release();
    public abstract void releaseSurface();
    public abstract int surfaceHeight();
    public abstract int surfaceWidth();
    public abstract void swapBuffers();
}
