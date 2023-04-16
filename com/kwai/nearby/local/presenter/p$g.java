package com.kwai.nearby.local.presenter.p$g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.nearby.local.presenter.p;
import nr4.a$a;
import android.graphics.Bitmap;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import qd7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mrb.a;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import k2b.f3;
import lnc.i3;
import java.lang.Integer;
import jn5.b;
import jn5.a$a;
import jn5.a;
import android.view.View;
import com.kwai.nearby.local.presenter.p$g$a;
import android.view.View$OnClickListener;
import o07.o;

public final class p$g implements PopupInterface$h	// class@000fc3
{
    public final p b;
    public final a$a c;
    public final Bitmap d;

    public void p$g(p p0,a$a p1,Bitmap p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void B(c p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, p$g.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       Object[] objArray = new Object[0];
       a.C().s("HomeLocalTopBubblePresenter", "onBubbleShowed", objArray);
       int i = TextUtils.x(this.c.b) ^ 0x01;
       p$g tb = this.b;
       tb.t = p0;
       p$g td = this.d;
       if (td != null) {
          tb.Z8(this.c, td);
       }
       this.b.X8(this.c);
       String str = String.valueOf(this.b.y);
       td = this.b;
       p z = td.z;
       p w = td.w;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidThreeRefs(str, z, Boolean.valueOf(w), null, b.class, "1")) {
          a.p(str, "popId");
          a.p(z, "popContent");
          String str1 = (w != null)? "3291784": "2695139";
          f3 uof3 = f3.l(str1, "NEARBY_GUIDE_POP");
          i3 oi3 = i3.f();
          oi3.d("pop_id", str);
          oi3.d("pop_content", z);
          uof3.m(oi3.e());
          uof3.g();
       }
       tb = this.b;
       p y = tb.y;
       p z1 = tb.z;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(y), "TopNearby", z1, Boolean.valueOf(i), null, b.class, "6")) {
          a.p("TopNearby", "loc");
          uob = b.a;
          a$a uoa = new a$a();
          uoa.c(y);
          uoa.h(z1);
          int i1 = (i)? 3: 2;
          uoa.g(i1);
          uoa.d("TopNearby");
          uob.d(uoa.a());
       }
       View view = p0.z();
       if (view != null) {
          view.setOnClickListener(new p$g$a(this, i, p0));
       }
       return;
    }
    public void H(c p0,int p1){
       p$g og = p$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "2")) {
          return;
       }
       a.p(p0, "popup");
       Object[] objArray = new Object[0];
       a.C().s("HomeLocalTopBubblePresenter", "onBubbleDismiss", objArray);
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
