package com.kuaishou.live.lite.recommendsidebar.panel.i;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import i2b.a;
import com.kuaishou.live.lite.recommendsidebar.panel.i$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.lite.recommendsidebar.panel.j;
import brd.t;
import yc3.e;
import erd.g;
import crd.b;
import yc3.d;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment;

public class i extends c	// class@000afe
{
    public j p;
    public LiveLiteRecommendPanelFragment q;
    public View r;

    public void i(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       View view = a.a(this.getContext(), R.layout.arg_RES_7f0d098d);
       this.r = view;
       view.setOnClickListener(new i$a(this));
       this.X7(this.p.d.hide().subscribe(new e(this)));
       this.X7(this.p.e.hide().subscribe(new d(this)));
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       if (this.q.ia() != null) {
          this.q.ia().m1(this.r);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.q8(j.class);
       this.q = this.r8("FRAGMENT");
       return;
    }
}
