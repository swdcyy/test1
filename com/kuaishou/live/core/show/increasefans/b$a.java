package com.kuaishou.live.core.show.increasefans.b$a;
import mq5.h;
import com.kuaishou.live.core.show.increasefans.b;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;

public class b$a implements h	// class@000c61
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       x.E(this.b.q);
       return;
    }
}
