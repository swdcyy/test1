package com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView$setup$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import java.lang.Object;
import re3.o;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import re3.l;

public final class RenderAreaView$setup$4 extends Lambda implements l	// class@000c13
{
    public final RenderAreaView this$0;

    public void RenderAreaView$setup$4(RenderAreaView p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(o p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderAreaView$setup$4.class, str)) {
          return;
       }
       a.p(p0, "it");
       RenderAreaView l = this.this$0.L;
       a.m(l);
       Objects.requireNonNull(l);
       if (!PatchProxy.applyVoidOneRefs(p0, l, l.class, str)) {
          a.p(p0, "render");
          l b = l.b;
          l c = l.c;
          l d = l.d;
          l e = l.e;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidFourRefs(b, c, d, e, p0, o.class, "6")) {
             a.p(b, "container");
             a.p(c, "renderViewFactory");
             if (p0.f == null) {
                p0.f = b;
                p0.g = c;
                p0.h = d;
                p0.i = e;
             }
          }
       }
       return;
    }
}
