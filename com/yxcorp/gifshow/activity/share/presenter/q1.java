package com.yxcorp.gifshow.activity.share.presenter.q1;
import lnc.o;
import com.yxcorp.gifshow.activity.share.presenter.p1;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zw8.k3;
import java.lang.Runnable;
import ekd.k1;
import tkd.b;
import tkd.d;
import ln6.a;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import android.content.Context;
import jn6.b;
import ln6.b;

public class q1 extends o	// class@001425
{
    public final p1 b;

    public void q1(p1 p0){
       this.b = p0;
       super();
    }
    public void b(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q1.class, "1")) {
          return;
       }
       q1 tb = this.b;
       if (tb.s == null) {
          return;
       }
       tb.x();
       k1.r(new k3(this), 300);
       tb = this.b;
       if (tb.p != null && tb.n == null) {
          q1 tb1 = this.b;
          tb.a(d.a(-863649994).b00(tb1.q, tb1.p.getType(), this.b.p));
       }
       return;
    }
}
