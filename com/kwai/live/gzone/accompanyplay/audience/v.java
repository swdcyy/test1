package com.kwai.live.gzone.accompanyplay.audience.v;
import u07.u;
import com.kwai.live.gzone.accompanyplay.audience.u;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.audience.v$a;
import erd.g;
import hq5.a;

public class v implements u	// class@000bc1
{
    public final u b;

    public void v(u p0){
       this.b = p0;
       super();
    }
    public void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v.class, "1")) {
          return;
       }
       this.b.s.y5(90, new v$a(this));
       return;
    }
}
