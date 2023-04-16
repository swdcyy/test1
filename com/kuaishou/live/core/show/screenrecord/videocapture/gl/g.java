package com.kuaishou.live.core.show.screenrecord.videocapture.gl.g;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.f;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.g$a;
import java.lang.Runnable;

public class g implements SurfaceTexture$OnFrameAvailableListener	// class@000ffe
{
    public final f b;

    public void g(f p0){
       this.b = p0;
       super();
    }
    public void onFrameAvailable(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.b.c(new g$a(this));
       return;
    }
}
