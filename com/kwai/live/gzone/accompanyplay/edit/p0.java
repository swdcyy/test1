package com.kwai.live.gzone.accompanyplay.edit.p0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.edit.m;
import n37.c2;
import com.kwai.live.gzone.accompanyplay.audience.a0;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.live.gzone.accompanyplay.edit.g0;
import g37.d;
import com.kwai.live.gzone.accompanyplay.edit.g0$c;

public class p0 extends PresenterV2	// class@000c13
{
    public m p;
    public g0 q;
    public d r;
    public g0$c s;
    public PresenterV2 t;

    public void p0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "2")) {
          return;
       }
       this.X7(this.p.l.subscribe(new c2(this), a0.b));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, p0.class, "3");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_GZONE_ANCHOR_ACCOMPANY_EDIT_PARAMS");
       this.q = this.r8("LIVE_GZONE_ANCHOR_ACCOMPANY_EDIT_POPUP");
       this.r = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_SDK_SERVICE");
       this.s = this.q8(g0$c.class);
       return;
    }
}
