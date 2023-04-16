package com.kuaishou.live.gzone.treasurebox.presenter.b0;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.gzone.treasurebox.presenter.w;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pm8.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kuaishou.live.gzone.treasurebox.presenter.v;
import io.reactivex.g;
import p53.k2;
import com.kuaishou.live.gzone.treasurebox.presenter.a0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b0 extends m	// class@001c7a
{
    public final w c;

    public void b0(w p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "1")) {
          return;
       }
       if (a.D0()) {
          a.Z1(false);
       }
       b0 tc = this.c;
       Objects.requireNonNull(tc);
       t ot = PatchProxy.apply(null, tc, w.class, "17");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.create(new v(tc));
       }
       tc.X7(ot.subscribe(new k2(this), a0.b));
       return;
    }
}
