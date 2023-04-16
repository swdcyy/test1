package com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$b;
import iy2.f$a;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import pz2.c;
import pz2.e;
import iy2.f;

public final class LiveMultiMagicEffectManager$b implements f$a	// class@0010e1
{
    public final LiveMultiMagicEffectManager a;

    public void LiveMultiMagicEffectManager$b(LiveMultiMagicEffectManager p0){
       this.a = p0;
       super();
    }
    public void d(long p0){
       LiveMultiMagicEffectManager$b uob = LiveMultiMagicEffectManager$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "1")) {
          return;
       }
       LiveMultiMagicEffectManager a = this.a.a;
       if (a != null) {
          c uoc = a.d();
          if (uoc != null) {
             LiveMultiMagicEffectManager$b ta = this.a;
             boolean b = ta.b(uoc, ta.c);
             if (b == true) {
                a = this.a.a;
                if (a != null) {
                   a.a();
                }
             }
          }
       }
       return;
    }
    public void h(long p0){
    }
}
