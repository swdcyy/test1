package com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$g$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$g;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o07.o;
import ms3.c$a;
import ms3.c;
import java.lang.Integer;

public final class LivePendantRightArea$g$b implements PopupInterface$h	// class@0018ab
{
    public final LivePendantRightArea$g b;

    public void LivePendantRightArea$g$b(LivePendantRightArea$g p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LivePendantRightArea$g$b.class, "1")) {
          return;
       }
       o.e(this, p0);
       LivePendantRightArea$g f = this.b.f;
       if (f != null) {
          c$a uoa = f.b();
          if (uoa != null) {
             uoa.onShow();
          }
       }
       PatchProxy.onMethodExit(LivePendantRightArea$g$b.class, "1");
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport2(LivePendantRightArea$g$b.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, LivePendantRightArea$g$b.class, "2")) {
          return;
       }
       o.b(this, p0, p1);
       LivePendantRightArea$g f = this.b.f;
       if (f != null) {
          c$a uoa = f.b();
          if (uoa != null) {
             uoa.onDismiss();
          }
       }
       PatchProxy.onMethodExit(LivePendantRightArea$g$b.class, "2");
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
