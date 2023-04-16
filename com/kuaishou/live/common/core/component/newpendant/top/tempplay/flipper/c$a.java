package com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.c$a;
import ks5.h;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.c;
import java.lang.Object;
import ks5.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.LiveTopPendantViewFlipper;
import java.util.ArrayList;
import android.widget.ViewFlipper;
import android.view.animation.Animation;
import ev1.b;
import java.lang.Runnable;
import ekd.k1;

public class c$a implements h	// class@0016d1
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       c a = this.a.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(p0, a, LiveTopPendantViewFlipper.class, "5")) {
          a.stopFlipping();
          int i = a.g.indexOf(p0);
          if (i >= 0) {
             a.setClipChildren(false);
             a.setInAnimation(null);
             a.setOutAnimation(null);
             a.setDisplayedChild(i);
          }
       }
       return;
    }
    public void b(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       c a = this.a.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(p0, a, LiveTopPendantViewFlipper.class, "6")) {
          a.d();
          k1.s(new b(a), a, 200);
       }
       return;
    }
}
