package c5c.l;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.e;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z5c.y1;
import k2b.f3;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import k2b.e0;
import java.lang.System;
import s1c.r;
import o07.o;

public class l implements PopupInterface$h	// class@00052b
{
    public final e b;

    public void l(e p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       e p = this.b.p;
       if (!PatchProxy.applyVoidOneRefs(p, null, y1.class, "136")) {
          f3 uof3 = f3.j("COMMON_POPUP_WINDOW");
          i3 oi3 = i3.f();
          oi3.c("activity_id", Integer.valueOf(8));
          oi3.d("source", "AT_LIST");
          uof3.m(oi3.e());
          uof3.h(p);
       }
       r.a(System.currentTimeMillis());
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       r.a(System.currentTimeMillis());
       return;
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
