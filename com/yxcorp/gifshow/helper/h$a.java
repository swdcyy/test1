package com.yxcorp.gifshow.helper.h$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import qra.r;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import my5.a;
import com.yxcorp.gifshow.helper.h;
import com.yxcorp.gifshow.util.rx.RxBus;
import qra.l;
import com.yxcorp.gifshow.helper.PushNotifyAuthoritySource;
import o07.o;

public class h$a implements PopupInterface$h	// class@001638
{
    public final r b;

    public void h$a(r p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       a.a(k1.i());
       h.d(this.b, "OPEN_NOTICE");
       RxBus.f.b(new l(this.b.a, true));
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
