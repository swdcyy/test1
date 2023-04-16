package com.yxcorp.plugin.setting.entries.holder.f0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.plugin.setting.entries.holder.e0$a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.f3;
import lnc.i3;
import com.yxcorp.plugin.setting.entries.holder.e0;
import k2b.e0;
import o07.o;

public class f0 implements PopupInterface$h	// class@000851
{
    public final e0$a b;

    public void f0(e0$a p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "1")) {
          return;
       }
       f3 uof3 = f3.l("3312896", "VIEW_RECORD_POPUP");
       i3 oi3 = i3.f();
       String str = (e0.b())? "open": "close";
       oi3.d("status", str);
       uof3.m(oi3.e());
       uof3.h(this.b.p);
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
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
