package com.yxcorp.gifshow.dialog.kem.l;
import erd.g;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import ilb.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import e17.i;
import android.app.Activity;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;

public class l implements g	// class@001ac7
{
    public c b;

    public void l(c p0){
       super();
       this.b = p0;
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       this.b.q(0);
       if (!TextUtils.isEmpty(p0.mMessage)) {
          i.d(R.style.arg_RES_7f110669, p0.mMessage);
       }
       if (!TextUtils.isEmpty(p0.mLinkUrl)) {
          a.b(b.j(this.b.u(), p0.mLinkUrl), null);
       }
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
}
