package com.kuaishou.live.gzone.treasurebox.presenter.r$a;
import mq5.h;
import com.kuaishou.live.gzone.treasurebox.presenter.r;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f37.b0;

public class r$a implements h	// class@001c92
{
    public final r b;

    public void r$a(r p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, r$a.class, "1")) {
          return;
       }
       this.b.R8();
       this.b.S8();
       return;
    }
}
