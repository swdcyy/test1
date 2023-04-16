package com.frog.engine.view.FrogGLSurfaceView$g;
import java.lang.Runnable;
import com.frog.engine.view.FrogGLSurfaceView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.view.FrogRender;

public class FrogGLSurfaceView$g implements Runnable	// class@00158a
{
    public final FrogGLSurfaceView a;

    public void FrogGLSurfaceView$g(FrogGLSurfaceView p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogGLSurfaceView$g.class, "1")) {
          return;
       }
       FrogGLSurfaceView mFrogRender = this.a.mFrogRender;
       if (mFrogRender != null) {
          mFrogRender.setGLThreadId();
       }
       return;
    }
}
