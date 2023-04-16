package com.kuaishou.live.gameinteractive.web.a$e;
import erd.g;
import com.kuaishou.live.gameinteractive.web.a;
import com.kuaishou.live.external.invoke.gzone.model.JsGamePayParams;
import java.lang.String;
import v43.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import e43.b;
import e43.a;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.gameinteractive.web.d;
import com.kuaishou.live.gameinteractive.web.e;
import crd.b;
import com.kuaishou.live.gameinteractive.web.f;
import com.kuaishou.live.gameinteractive.web.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import pp.a;
import java.lang.StringBuilder;
import q87.c;

public class a$e implements g	// class@001bfe
{
    public final JsGamePayParams b;
    public final String c;
    public final c d;
    public final a e;

    public void a$e(a p0,JsGamePayParams p1,String p2,c p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void accept(Object p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else {
          a$e uoe = null;
          if (p0.booleanValue()) {
             p0 = null;
             if (this.b.isEnergyPay()) {
                p0 = a.a().c(this.b.payData, this.c).subscribeOn(d.b).subscribe(new d(this), new e(this));
             }else if(this.b.isKcoinPay()){
                p0 = a.a().m(this.b.payData, this.c).subscribeOn(d.b).subscribe(new f(this), new g(this));
             }
             if (p0 != null) {
                this.e.X7(p0);
             }else {
                objArray = new Object[uoe];
                a.C().t("GameInteractiveCommonBridgeImpl", "invalid pay type:"+this.b.type, objArray);
             }
          }else {
             objArray = new Object[uoe];
             a.C().t("GameInteractiveCommonBridgeImpl", "request permission failed!", objArray);
             this.d.onError(-2, "request permission failed!");
          }
       }
       return;
    }
}
