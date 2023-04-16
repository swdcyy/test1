package com.kwai.live.gzone.accompanyplay.anchor.t$a;
import mq5.h;
import com.kwai.live.gzone.accompanyplay.anchor.t;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.PopupWindow;

public class t$a implements h	// class@000b37
{
    public final t b;

    public void t$a(t p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, t$a.class, "1")) {
          return;
       }
       t p = this.b.p;
       if (p != null) {
          p.dismiss();
       }
       return;
    }
}
