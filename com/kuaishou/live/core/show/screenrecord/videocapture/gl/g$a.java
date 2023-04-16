package com.kuaishou.live.core.show.screenrecord.videocapture.gl.g$a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.f;

public class g$a implements Runnable	// class@000ffd
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       this.b.b.l = true;
       this.b.b.f();
       return;
    }
}
