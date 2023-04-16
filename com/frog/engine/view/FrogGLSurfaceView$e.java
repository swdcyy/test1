package com.frog.engine.view.FrogGLSurfaceView$e;
import java.lang.Runnable;
import com.frog.engine.view.FrogGLSurfaceView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.view.FrogRender;

public class FrogGLSurfaceView$e implements Runnable	// class@001588
{
    public final int[] a;
    public final float[] b;
    public final float[] c;
    public final FrogGLSurfaceView d;

    public void FrogGLSurfaceView$e(FrogGLSurfaceView p0,int[] p1,float[] p2,float[] p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogGLSurfaceView$e.class, "1")) {
          return;
       }
       FrogGLSurfaceView$e td = this.d;
       FrogGLSurfaceView mFrogRender = td.mFrogRender;
       if (mFrogRender != null) {
          mFrogRender.onActionCancel(this.a, td.getRealXs(this.b), this.d.getRealYs(this.c));
       }
       return;
    }
}
