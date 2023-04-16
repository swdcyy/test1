package com.yxcorp.gifshow.payment.GatewayPayBaseInitModule;
import com.kwai.framework.init.a;
import com.yxcorp.gifshow.payment.a;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.payment.b;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import o56.d;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.yxcorp.gateway.pay.api.NetWorkGlobalConfig;
import com.yxcorp.gateway.pay.api.PayInitConfig$Builder;
import com.yxcorp.gateway.pay.api.PayInitConfig;
import android.app.Application;
import o56.a;
import dwb.g;
import com.yxcorp.gateway.pay.api.PayRetrofitGlobalConfig;
import dwb.f;
import h97.g;
import dwb.e;
import com.yxcorp.gateway.pay.api.KwaiPayConfig;
import dwb.d;
import go7.k;
import com.yxcorp.gifshow.payment.c;
import go7.b;
import n5d.a;
import go7.h;
import n5d.b;
import go7.i;
import s5d.a;
import go7.f;
import com.yxcorp.plugin.payment.withdraw.WithDrawConfigImpl;
import go7.l;
import dwb.c;
import go7.a;
import com.yxcorp.gifshow.payment.d;
import go7.e;
import dwb.j;
import q87.c;
import com.yxcorp.gateway.pay.api.PayManager;
import xf6.h;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import dwb.b;
import erd.g;
import crd.b;
import eda.l;
import dwb.a;

public abstract class GatewayPayBaseInitModule extends a	// class@000e36
{
    public static final x q;
    public static final x r;

    static {
       GatewayPayBaseInitModule.q = Suppliers.a(a.b);
       GatewayPayBaseInitModule.r = Suppliers.a(b.b);
    }
    public void GatewayPayBaseInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 7;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, GatewayPayBaseInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public boolean l0(){
       Object obj = PatchProxy.apply(null, this, GatewayPayBaseInitModule.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("payKuaishouServiceToken", false);
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GatewayPayBaseInitModule.class, "1")) {
          return;
       }
       if (d.i) {
          boolean b = false;
          this.t0(RequestTiming.COLD_START, b);
          if (!PatchProxy.applyVoid(objArray, this, GatewayPayBaseInitModule.class, "2")) {
             Object[] objArray1 = new Object[b];
             j.C().w("GatewayPayInitModule", "start PayManager init!!", objArray1);
             PayManager.init(PayInitConfig.newBuilder(objArray).setApplication(a.b()).setDebugHostUrl(GatewayPayBaseInitModule.q.get()).setRetrofitConfig(new g(this)).setCommonParams(new f(this)).setKwaiPayConfig(new e(this)).setWebInitConfig(new d(this)).setPayYodaConfig(c.a).setVerifyConfig(new a()).setVideoUploadHelper(new b()).setUnionPayHelper(new a()).setEnableLogger(true).setWithDrawConfig(new WithDrawConfigImpl()).setPayLoggerConfig(new c(this)).setRubasApi(d.b).build());
             PayManager.getInstance().setDebug(h.u());
          }
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       f.g(n.class, mAIN).subscribe(new b(this));
       f.g(l.class, mAIN).subscribe(new a(this));
       return;
    }
    public abstract String n0();
    public abstract String o0();
    public abstract String p0();
    public abstract String q0();
    public abstract void r0(l p0);
    public abstract void s0(n p0);
    public abstract void t0(RequestTiming p0,boolean p1);
}
