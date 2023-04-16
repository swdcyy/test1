package com.kuaishou.live.gameinteractive.web.a$h;
import erd.g;
import com.kuaishou.live.gameinteractive.web.a;
import v43.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e43.b;
import e43.a;
import t02.a0;
import p91.m;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.gameinteractive.web.h;
import com.kuaishou.live.gameinteractive.web.i;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import pp.a;
import q87.c;

public class a$h implements g	// class@001c01
{
    public final long b;
    public final long c;
    public final c d;
    public final a e;

    public void a$h(a p0,long p1,long p2,c p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$h.class, "1")) {
       }else if(p0.booleanValue()){
          this.e.X7(a.a().f(this.b, this.c, this.e.R8(), this.e.p.Z2.getLiveStreamId()).subscribeOn(d.b).subscribe(new h(this), new i(this)));
       }else {
          Object[] objArray = new Object[0];
          a.C().t("GameInteractiveCommonBridgeImpl", "sendKCoinGift error -- request permission failed!", objArray);
          this.d.onError(-2, "request permission failed!");
       }
       return;
    }
}
