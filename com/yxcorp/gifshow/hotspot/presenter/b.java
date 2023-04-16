package com.yxcorp.gifshow.hotspot.presenter.b;
import erd.g;
import com.yxcorp.gifshow.hotspot.presenter.d;
import java.lang.Object;
import kwa.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.t;
import gwa.a;
import com.yxcorp.gifshow.hotspot.presenter.c;
import crd.b;

public final class b implements g	// class@0018e5
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "11")) {
       }else {
          Activity activity = tb.getActivity();
          if (activity == null || (activity.hashCode() != p0.a || (tb.A != null && p0.b != null))) {
             tb.X7(t.timer(500, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).subscribe(new a(tb, p0), c.b));
          }
       }
       return;
    }
}
