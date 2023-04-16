package com.kwai.video.krtc.rtcengine.render.b$b;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.render.b;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.render.b$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.GL.EglBase;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import com.kwai.video.krtc.render.GLDrawer;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import java.lang.IllegalArgumentException;

public class b$b implements Runnable	// class@0008b5
{
    public final b a;
    public Object b;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void b$b(b p0,b$1 p1){
       super(p0);
    }
    public synchronized void a(Object p0){
       this.b = p0;
    }
    public synchronized void run(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       if (this.b != null && (b.a(this.a) != null && !b.a(this.a).hasSurface())) {
          b$b tb = this.b;
          if (tb instanceof Surface) {
             b.a(this.a).createSurface(this.b);
          }else if(tb instanceof SurfaceTexture){
             b.a(this.a).createSurface(this.b);
          }else {
             throw new IllegalArgumentException("Invalid surface");
          }
          b.a(this.a).makeCurrent();
          b.a(this.a, new GLDrawer());
          Log.i(b.b(), this+" render context and drawer ready done");
       }
    label_007f :
       return;
    }
}
