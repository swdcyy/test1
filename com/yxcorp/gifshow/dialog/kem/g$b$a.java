package com.yxcorp.gifshow.dialog.kem.g$b$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.dialog.kem.g$b;
import com.kwai.library.widget.popup.common.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.response.dialog.KemCommonDialogResponse;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Activity;
import android.content.Context;
import xh7.b;
import java.lang.Boolean;
import xh7.a;
import qh7.b;
import qh7.a;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import x9a.j0;

public class g$b$a extends m	// class@001ab6
{
    public final c c;
    public final g$b d;

    public void g$b$a(g$b p0,c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b$a.class, "1")) {
          return;
       }
       if (!TextUtils.isEmpty(this.d.d.mLinkUrl)) {
          KemCommonDialogResponse mLinkUrl = this.d.d.mLinkUrl;
          b uob = b.j(this.c.u(), mLinkUrl);
          if (this.d.b != null && mLinkUrl.startsWith("market://details")) {
             uob.h("com.kwai.platform.krouter.3party_app_allowed", Boolean.TRUE);
          }
          a.b(uob, null);
       }
       j0.k(this.d.d, 67);
       this.c.q(4);
       return;
    }
}
