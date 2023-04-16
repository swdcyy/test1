package com.kuaishou.live.core.show.redpacket.redpackrain2.notify.e$a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.e$b;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.LiveRedPackRainNotifyDialogFragment;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public class e$a implements e$b	// class@000f11
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       e v = this.a.v;
       if (v != null && v.d()) {
          this.a.v.dismissAllowingStateLoss();
       }
       return;
    }
}
