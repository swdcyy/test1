package com.kuaishou.live.core.show.screenrecord.videocapture.gl.f$c;
import lj2.a$a;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class f$c implements a$a	// class@000ffa
{
    public final f a;

    public void f$c(f p0){
       this.a = p0;
       super();
    }
    public void u(int p0){
       f$c uoc = f$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.a.e(p0);
       return;
    }
}
