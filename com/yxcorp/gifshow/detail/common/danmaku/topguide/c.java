package com.yxcorp.gifshow.detail.common.danmaku.topguide.c;
import erd.g;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.d;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.BaseOpenCloseGuideElement;
import com.yxcorp.gifshow.entity.QPhoto;
import sm5.d;
import tx9.f;
import k2b.e0;
import java.lang.String;
import msd.l;
import sx9.t;
import qp7.b;

public final class c implements g	// class@001400
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          d.k(tb.B);
          t.d(tb.A, tb.B, "DAMAKU_OPEN_GUIDE_TOAST", new f(tb));
       }else {
          tb.b0();
       }
       return;
    }
}
