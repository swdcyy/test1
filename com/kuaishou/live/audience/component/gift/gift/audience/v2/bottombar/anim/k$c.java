package com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.k$c;
import com.kuaishou.live.common.core.basic.resource.c$b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.k;
import java.lang.Object;
import java.lang.ref.SoftReference;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qm1.a;
import gz0.a;
import android.widget.ImageView;

public class k$c implements c$b	// class@000b10
{
    public SoftReference a;

    public void k$c(k p0){
       super();
       this.a = new SoftReference(p0);
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k$c.class, "1")) {
          return;
       }
       k ok = this.a.get();
       if (ok != null && !PatchProxy.applyVoid(objArray, ok, k.class, "6")) {
          ok.i.onAnimationStart();
          ok.b.setVisibility(8);
          ok.b();
       }
       return;
    }
}
