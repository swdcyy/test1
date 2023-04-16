package com.kuaishou.commercial.splash.presenter.v;
import erd.g;
import com.kuaishou.commercial.splash.presenter.z;
import java.lang.Object;
import android.view.ViewGroup;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gz.u2;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import gz.r2;
import com.kuaishou.commercial.splash.presenter.x;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gz.s;
import android.widget.TextView;
import gz.q2;
import com.kuaishou.commercial.splash.presenter.w;

public final class v implements g	// class@00160e
{
    public final z b;

    public void v(z p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       v tb = this.b;
       Objects.requireNonNull(tb);
       p0 = z.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, p0, "4")) {
       }else if(!PatchProxy.applyVoid(objArray, tb, p0, "8") && !TextUtils.isEmpty(tb.A.S)){
          tb.X7(t.timer(tb.A.T, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new r2(tb), x.b));
       }
       int i = 8;
       if (!PatchProxy.applyVoid(objArray, tb, p0, "7")) {
          p0 = tb.A.h;
          if (TextUtils.isEmpty(p0)) {
             tb.u.setVisibility(i);
          }else {
             tb.u.setText(p0);
          }
       }
       p0 = tb.A;
       if (p0.e != null) {
          tb.w.setVisibility(i);
       }else {
          tb.X7(t.timer(p0.d, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new q2(tb), w.b));
       }
       if (tb.A.l == null) {
          tb.P8();
       }
       return;
    }
}
