package com.kuaishou.live.core.show.screenrecord.videocapture.gl.f$a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public class f$a implements Runnable	// class@000ff8
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$a.class, "1")) {
          return;
       }
       b.P(LiveLogTag.LIVE_SCREEN_RECORD.appendTag("SurfaceTextureHelper"), "Setting listener to "+this.b.o);
       f$a tb = this.b;
       tb.h = tb.o;
       tb.o = objArray;
       if (tb.l != null) {
          this.b.g();
          this.b.l = false;
       }
       return;
    }
}
