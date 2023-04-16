package com.frog.engine.view.FrogGLSurfaceView$k;
import java.lang.Runnable;
import com.frog.engine.view.FrogGLSurfaceView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.view.FrogRender;

public class FrogGLSurfaceView$k implements Runnable	// class@00158e
{
    public final Runnable a;
    public final FrogGLSurfaceView b;

    public void FrogGLSurfaceView$k(FrogGLSurfaceView p0,Runnable p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FrogGLSurfaceView$k.class, "1")) {
          return;
       }
       FrogGLSurfaceView mFrogRender = this.b.mFrogRender;
       if (mFrogRender != null) {
          mFrogRender.onDestroy();
          FrogGLSurfaceView.access$202(this.b, objArray);
       }
       FrogGLSurfaceView$k ta = this.a;
       if (ta != null) {
          ta.run();
       }
       FrogGLSurfaceView.access$302(this.b, true);
       return;
    }
}
