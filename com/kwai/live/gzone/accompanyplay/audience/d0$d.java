package com.kwai.live.gzone.accompanyplay.audience.d0$d;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.audience.d0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k37.v;
import erd.a;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;

public class d0$d implements View$OnClickListener	// class@000b76
{
    public final d0 b;

    public void d0$d(d0 p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0$d.class, "1")) {
          return;
       }
       d0$d tb = this.b;
       tb.s.z(tb.y, new v(this));
       return;
    }
}
