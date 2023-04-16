package com.frog.engine.view.FrogGLSurfaceView$a;
import java.lang.Runnable;
import com.frog.engine.view.FrogGLSurfaceView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.view.FrogGLSurfaceView$a$a;
import android.os.Handler;

public class FrogGLSurfaceView$a implements Runnable	// class@001584
{
    public final FrogGLSurfaceView a;

    public void FrogGLSurfaceView$a(FrogGLSurfaceView p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogGLSurfaceView$a.class, "1")) {
          return;
       }
       this.a.mMainThreadHandler.post(new FrogGLSurfaceView$a$a(this));
       return;
    }
}
