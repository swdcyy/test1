package com.kwai.live.gzone.tab.accompanyplay.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.kwai.live.gzone.tab.page.a;
import com.kwai.live.gzone.tab.accompanyplay.c$a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import i63.b;

public class c extends PresenterV2	// class@000e04
{
    public RecyclerFragment p;
    public b q;

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.X7(this.q.Z0().subscribe(new c$a(this)));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, c.class, "3");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_GZONE_PARENT_FRAGMENT");
       this.q = this.r8("LIVE_GZONE_PARENT_TAB_PAGE");
       return;
    }
}
