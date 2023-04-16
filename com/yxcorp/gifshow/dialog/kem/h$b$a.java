package com.yxcorp.gifshow.dialog.kem.h$b$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.dialog.kem.h$b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import x9a.d0;
import x9a.j0;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.model.response.dialog.KemCommonVideoDialogResponse;
import android.app.Activity;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;

public final class h$b$a extends m	// class@001aba
{
    public final h$b c;

    public void h$b$a(h$b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b$a.class, "1")) {
          return;
       }
       a.p(p0, "v");
       h$b$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, h$b.class, "5")) {
          j0.k(tc.h.b(), 72);
          h$b c = tc.c;
          if (c == null) {
             a.S("dialog");
          }
          c.q(4);
          KemCommonVideoDialogResponse mLinkUrl = tc.g.mLinkUrl;
          if (mLinkUrl != null) {
             h$b c1 = tc.c;
             if (c1 == null) {
                a.S("dialog");
             }
             a.b(b.j(c1.u(), mLinkUrl), null);
          }
       }
       return;
    }
}
