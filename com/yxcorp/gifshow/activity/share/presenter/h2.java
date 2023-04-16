package com.yxcorp.gifshow.activity.share.presenter.h2;
import erd.g;
import com.yxcorp.gifshow.activity.share.presenter.j2;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import xw8.a;
import com.yxcorp.gifshow.entity.QPhoto;
import a17.c$a;
import android.app.Activity;
import a17.g;
import lnc.a1;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.lang.CharSequence;
import java.util.List;
import java.util.Collections;
import zw8.q4;
import a17.b$b;
import com.yxcorp.gifshow.activity.share.presenter.g2;
import a17.b$a;
import a17.f;
import zw8.w4;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public final class h2 implements g	// class@0013eb
{
    public final j2 b;

    public void h2(j2 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h2 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, j2.class, "8")) {
       }else {
          boolean b = false;
          p0 = tb.P8(tb.S8(), b, tb.z);
          tb.z = p0;
          if (p0.h(tb.t)) {
             p0 = new c$a(tb.w);
             p0.l0(R.string.arg_RES_7f100f0d);
             p0.j0(Collections.singletonList(new g(a1.p(R.string.arg_RES_7f101280), SheetItemStatus.Primary)));
             p0.g0(R.string.cancel);
             p0.i0(new q4(tb));
             p0.d0(g2.a);
             f.a(p0).Y(new w4(tb));
          }else {
             tb.R8(b);
          }
       }
       return;
    }
}
