package com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$c;
import oh1.c;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oh1.a;
import lj1.b;
import oh1.b;
import java.lang.Integer;
import th1.b;

public final class LiveComboManager$c implements c	// class@00116e
{
    public final LiveComboManager a;

    public void LiveComboManager$c(LiveComboManager p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveComboManager$c.class, "1")) {
          return;
       }
       this.a.a("onAnimationFinished");
       this.a.b.a();
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveComboManager$c.class, "6")) {
          return;
       }
       this.a.b.b(p0);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveComboManager$c.class, "4")) {
          return;
       }
       this.a.b.c();
       return;
    }
    public void d(){
       b.f(this);
    }
    public void e(int p0,b p1){
       LiveComboManager$c uoc = LiveComboManager$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "2")) {
          return;
       }
       this.a.r.f();
       this.a.b.e(p0, p1);
       return;
    }
    public void f(int p0,b p1){
       LiveComboManager$c uoc = LiveComboManager$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "3")) {
          return;
       }
       this.a.b.f(p0, p1);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, LiveComboManager$c.class, "5")) {
          return;
       }
       this.a.r.f();
       this.a.b.g();
       return;
    }
}
