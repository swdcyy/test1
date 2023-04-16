package com.kuaishou.live.core.show.conditionredpacket.grab.base.k$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.k;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import b62.j0;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import u52.t;
import j62.a;
import brd.t;
import i62.t$c;
import t45.d;
import brd.z;
import b62.k0;
import b62.l0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class k$b extends m	// class@000a8e
{
    public final k c;

    public void k$b(k p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "1")) {
          return;
       }
       k$b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, k.class, "5")) {
          tc.Y8(8);
          tc.C.setVisibility(8);
          tc.E.setVisibility(0);
          tc.E.k();
          j0 q = tc.q;
          tc.X7(tc.p.c.m(q.a, q.b).subscribeOn(d.b).observeOn(d.a).subscribe(new k0(tc), new l0(tc)));
       }
       return;
    }
}
