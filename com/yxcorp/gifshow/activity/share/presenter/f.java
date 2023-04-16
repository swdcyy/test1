package com.yxcorp.gifshow.activity.share.presenter.f;
import com.yxcorp.gifshow.bubble.b$b;
import com.yxcorp.gifshow.activity.share.presenter.j;
import java.lang.Object;
import com.yxcorp.gifshow.widget.popup.a;
import java.util.Objects;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.bubble.a$c;
import lnc.a1;
import zw8.k;
import k07.g;
import com.yxcorp.gifshow.activity.share.presenter.e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;

public final class f implements b$b	// class@0013e2
{
    public final j a;

    public void f(j p0){
       this.a = p0;
    }
    public final void a(a p0){
       f ta = this.a;
       Objects.requireNonNull(ta);
       p0.D0(BubbleInterface$Position.BOTTOM);
       p0.C0(a1.e(-5.00f));
       p0.v0(a1.d(R.dimen.arg_RES_7f0702e3));
       p0.t0(new k(ta));
       p0.L(e.b);
    }
}
