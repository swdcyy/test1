package com.kuaishou.live.common.core.component.newpendant.top.activity.c$a;
import wu1.g;
import com.kuaishou.live.common.core.component.newpendant.top.activity.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wu1.a;
import java.util.Objects;
import java.util.Map;
import ks5.m;
import z51.g;
import java.lang.Integer;
import wu1.b;
import com.kuaishou.live.common.core.component.newpendant.top.activity.b;
import msd.l;
import com.kuaishou.live.basic.tk.LiveTkItemManager;
import android.view.ViewGroup;
import android.view.View;
import ks5.e;
import com.kuaishou.live.common.core.component.newpendant.top.activity.LiveTopActivityTkPendantContainer;
import z51.c;

public class c$a implements g	// class@0016ba
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       this.a.S8(p0);
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       c$a ta = this.a;
       Objects.requireNonNull(ta);
       c uoc = c.class;
       if (!PatchProxy.applyVoidOneRefs(p0, ta, uoc, "4")) {
          m om = ta.y.get(p0.k);
          if (om == null) {
             if (!PatchProxy.applyVoidOneRefs(p0, ta, uoc, "5")) {
                ta.x.b(new g(p0.e, p0.f, p0.g, Integer.valueOf(p0.h)), new b(ta, p0), b.b);
             }
          }else {
             LiveTopActivityTkPendantContainer liveTopActiv = om.b(null);
             p0 = p0.g;
             Objects.requireNonNull(liveTopActiv);
             if (!PatchProxy.applyVoidOneRefs(p0, liveTopActiv, LiveTopActivityTkPendantContainer.class, "3")) {
                liveTopActiv = liveTopActiv.c;
                if (liveTopActiv != null) {
                   liveTopActiv.e(p0, "");
                }
             }
          }
       }
       return;
    }
}
