package com.kuaishou.live.core.show.conditionredpacket.pendant.a;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i62.z;
import i62.t$c;
import brd.t;
import l62.c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import l62.b;
import vq5.b;
import vq5.d;
import z52.j$b;

public class a extends c	// class@000abd
{
    public t$c p;
    public j$b q;
    public d r;
    public int s;
    public static String sLivePresenterClassName = "LiveConditionRedPacketAutoOpenRouterPresenter";

    public void a(){
       super();
       this.s = 0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.X7(this.p.n().d(1).subscribe(new c(this)));
       this.r.t5("openconditionredpacketdialog", new b(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.r.Z4("openconditionredpacketdialog");
       this.s = 0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(t$c.class);
       this.q = this.q8(j$b.class);
       this.r = this.r8("LIVE_ROUTER_SERVICE");
       return;
    }
}
