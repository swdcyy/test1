package com.kuaishou.commercial.splash.presenter.z0;
import erd.g;
import com.kuaishou.commercial.splash.presenter.c1;
import java.lang.Object;
import android.view.ViewGroup;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gz.s;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;
import brd.t;
import gz.d5;
import erd.o;
import com.kuaishou.commercial.splash.presenter.b1;
import erd.r;
import t45.d;
import brd.z;
import gz.c5;
import com.kuaishou.commercial.splash.presenter.a1;
import gz.b5;
import erd.a;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class z0 implements g	// class@001616
{
    public final c1 b;

    public void z0(c1 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       z0 tb = this.b;
       Objects.requireNonNull(tb);
       p0 = c1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, p0, "4")) {
       }else if(tb.w != null){
          tb.w = true;
          if (!PatchProxy.applyVoid(objArray, tb, p0, "5")) {
             p0 = tb.q;
             if (p0.e != null) {
                tb.s.setVisibility(8);
             }else {
                long l = 0;
                if (p0.d - l > 0) {
                   tb.s.setEnabled(false);
                   long l1 = TimeUnit.MILLISECONDS.toSeconds(tb.q.d);
                   tb.X7(t.interval(l, 1, TimeUnit.SECONDS).take((1 + l1)).map(new d5(l1)).filter(b1.b).observeOn(d.a).subscribe(new c5(tb), a1.b, new b5(tb)));
                }else {
                   tb.P8(tb.s);
                }
             }
          }
       }
       return;
    }
}
