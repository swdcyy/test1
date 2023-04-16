package com.kwai.video.player.surface.DummySurface;
import android.view.Surface;
import com.kwai.video.player.surface.DummyThread;
import android.graphics.SurfaceTexture;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.opengl.EGLContext;
import com.kwai.video.player.surface.Assertions;
import com.kwai.video.player.surface.DummySurface$1;

public final class DummySurface extends Surface	// class@000b98
{
    public final boolean secure;
    public final DummyThread thread;
    public boolean threadReleased;
    public static int secureMode;
    public static boolean secureModeInitialized;

    public void DummySurface(DummyThread p0,SurfaceTexture p1,boolean p2){
       super(p1);
       this.thread = p0;
       this.secure = p2;
    }
    public static void assertApiLevel17OrHigher(){
       PatchProxy.applyVoid(null, null, DummySurface.class, "4");
    }
    public static int getSecureMode(Context p0){
       return 0;
    }
    public static synchronized boolean isSecureSupported(Context p0){
       _monitor_enter(DummySurface.class);
       Object obj = PatchProxy.applyOneRefs(p0, null, DummySurface.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(DummySurface.class);
          return obj.booleanValue();
       }else {
          boolean b = true;
          if (!DummySurface.secureModeInitialized) {
             DummySurface.secureMode = DummySurface.getSecureMode(p0);
             DummySurface.secureModeInitialized = b;
          }
          if (!DummySurface.secureMode) {
             b = false;
          }
          _monitor_exit(DummySurface.class);
          return b;
       }
    }
    public static DummySurface newInstanceV17(Context p0,boolean p1,EGLContext p2){
       if (PatchProxy.isSupport(DummySurface.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, null, DummySurface.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       DummySurface.assertApiLevel17OrHigher();
       int i = 0;
       boolean b = (!p1 || DummySurface.isSecureSupported(p0))? true: false;
       Assertions.checkState(b);
       DummySurface$1 u1 = new DummySurface$1();
       if (p1) {
          i = DummySurface.secureMode;
       }
       return u1.init(i, p2);
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, DummySurface.class, "3")) {
          return;
       }
       super.release();
       DummySurface tthread = this.thread;
       _monitor_enter(tthread);
       if (this.threadReleased == null) {
          this.thread.release();
          this.threadReleased = true;
       }
       _monitor_exit(tthread);
       return;
    }
}
