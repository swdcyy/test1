package com.gifshow.tuna.player.poi.d;
import erd.g;
import com.gifshow.tuna.player.poi.f;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.util.Objects;
import oj.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import e17.i;
import nj.a;
import nj.g;
import android.content.Context;
import android.view.View;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.gifshow.tuna.player.poi.c;
import w07.l;
import com.kwai.library.widget.popup.common.c$b;
import oj.f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.gifshow.tuna.player.poi.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;
import lnc.a1;
import java.lang.CharSequence;
import oj.j;
import oj.a;

public final class d implements g	// class@0015f3
{
    public final f b;
    public final boolean c;
    public final String d;

    public void d(f p0,boolean p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       p0 = f.class;
       int i = 1;
       int i1 = this.c ^ i;
       b uob = new b();
       uob.a = this.d;
       uob.b = i1;
       RxBus.f.b(uob);
       if (i1) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, p0, "3")) {
             i oi = i.l();
             if (oi != null) {
                oi.h();
             }
          }
          if (!PatchProxy.applyVoid(objArray, tb, p0, "5")) {
             p0 = tb.a.d.getContext();
             tb.d();
             a uoa = new a(p0);
             uoa.K0(KwaiBubbleOption.e);
             uoa.o0(tb.f);
             uoa.D0(BubbleInterface$Position.TOP);
             uoa.b0(new c(tb));
             uoa.T(3000);
             uoa.z(i);
             uoa.A(i);
             uoa.P(i);
             uoa.M(new f(tb));
             uoa.L(new b(tb, p0));
             p0 = uoa.k();
             p0.Z();
             tb.l = p0;
          }
       }else {
          tb.d();
          i.d(R.style.arg_RES_7f110669, a1.p(R.string.arg_RES_7f10072b));
       }
       tb.a.e.setPoiCollected(i1);
       return;
    }
}
