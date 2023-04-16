package com.kuaishou.live.gzone.treasurebox.i$e;
import mq5.h;
import com.kuaishou.live.gzone.treasurebox.i;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f37.b0;

public class i$e implements h	// class@001c6f
{
    public final i b;

    public void i$e(i p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, i$e.class, "1")) {
          return;
       }
       this.b.R8();
       return;
    }
}
