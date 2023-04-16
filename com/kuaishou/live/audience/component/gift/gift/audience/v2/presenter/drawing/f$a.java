package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.f$a;
import com.kuaishou.live.common.core.component.gift.DrawingGiftEditView$b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.f;
import java.lang.Object;
import ug1.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import mk1.b;
import mk1.h;
import mk1.w;
import jk1.a;

public class f$a implements DrawingGiftEditView$b	// class@000b3d
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(){
       d.b(this);
    }
    public void b(int p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = 1;
       boolean b = false;
       boolean b1 = (p0 > 0)? true: false;
       if (!b1) {
          this.a.u.setEnabled(b);
          this.a.t.setEnabled(b);
       }else {
          this.a.u.setEnabled(uoa);
          this.a.t.setEnabled(uoa);
       }
       uoa = this.a;
       w.t(uoa.q, uoa.p, b1);
       h l = this.a.p.l;
       if (l != null) {
          l.b(b1);
       }
       this.a.P8(p0);
       return;
    }
    public void c(){
       d.c(this);
    }
    public void d(int p0){
       d.e(this, p0);
    }
    public void e(){
       d.d(this);
    }
}
