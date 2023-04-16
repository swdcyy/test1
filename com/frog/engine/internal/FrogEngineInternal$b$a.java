package com.frog.engine.internal.FrogEngineInternal$b$a;
import com.frog.engine.view.RenderThreadCallBack;
import com.frog.engine.internal.FrogEngineInternal$b;
import com.frog.engine.view.FrogGLSurfaceView;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.opengl.GLSurfaceView;

public class FrogEngineInternal$b$a implements RenderThreadCallBack	// class@001531
{
    public final FrogGLSurfaceView a;

    public void FrogEngineInternal$b$a(FrogEngineInternal$b p0,FrogGLSurfaceView p1){
       this.a = p1;
       super();
    }
    public void run(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogEngineInternal$b$a.class, "1")) {
          return;
       }
       this.a.queueEvent(p0);
       return;
    }
}
