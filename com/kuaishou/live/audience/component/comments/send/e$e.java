package com.kuaishou.live.audience.component.comments.send.e$e;
import ft5.d;
import com.kuaishou.live.audience.component.comments.send.e;
import java.lang.Object;
import ft5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import d61.y;
import t02.a0;
import gq5.f;
import tj3.k;
import tj3.e;
import java.util.Objects;
import java.lang.System;
import z12.n;
import kuaishou.perf.page.impl.b;

public class e$e implements d	// class@000abe
{
    public final e a;

    public void e$e(e p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       c.a(this, p0, p1);
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, e$e.class, "2")) {
          return;
       }
       if (a1.i(this.a.getActivity()) && y.d(this.a.getActivity())) {
          this.a.r.g2.q(false);
       }
       return;
    }
    public void onShow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$e.class, "1")) {
          return;
       }
       k ok = this.a.s.x();
       Objects.requireNonNull(ok);
       if (!PatchProxy.applyVoid(objArray, ok, k.class, "33") && !ok.q0 - null) {
          ok.q0 = System.currentTimeMillis() - ok.s0;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, n.class, "10")) {
          b.d("live_click_to_destroy").h("CommentPanelReactDuration");
       }
       return;
    }
}
