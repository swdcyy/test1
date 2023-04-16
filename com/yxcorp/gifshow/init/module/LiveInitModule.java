package com.yxcorp.gifshow.init.module.LiveInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import o56.d;
import sxa.t;
import java.lang.Runnable;
import com.kwai.framework.init.c;
import android.app.Activity;
import crd.b;
import lnc.b9;
import tkd.b;
import tkd.d;
import os5.j;
import b76.a;
import os5.l;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.kwai.framework.model.user.QCurrentUser;
import sxa.r;
import sxa.s;
import com.kwai.framework.init.e;
import vs5.c;
import sxa.p;
import erd.g;
import eoc.f;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import sxa.q;
import jd6.g;
import qs5.d;
import com.kwai.framework.plugin.PluginManager;

public class LiveInitModule extends a	// class@001988
{
    public boolean q;
    public b r;
    public static final int s;

    public void LiveInitModule(){
       super();
       this.q = true;
    }
    public int f0(){
       return 3;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, LiveInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(LiveInitModule.class, "2");
       return Lists.e(obj);
    }
    public void i0(){
       if (PatchProxy.applyVoidWithListener(null, this, LiveInitModule.class, "5")) {
          return;
       }
       if (!PatchProxy.applyVoidWithListener(null, this, LiveInitModule.class, "6")) {
          if (d.i) {
             c.b(new t(this));
          }
          PatchProxy.onMethodExit(LiveInitModule.class, "6");
       }
       PatchProxy.onMethodExit(LiveInitModule.class, "5");
       return;
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveInitModule.class, "4")) {
          return;
       }
       b9.a(this.r);
       d.a(0x396c0e3f).l(p0);
       PatchProxy.onMethodExit(LiveInitModule.class, "4");
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveInitModule.class, "7")) {
          return;
       }
       d.a(-1492894991).lv();
       d.a(-1492894991).MC();
       PatchProxy.onMethodExit(LiveInitModule.class, "7");
       return;
    }
    public final void l0(){
       if (PatchProxy.applyVoidWithListener(null, this, LiveInitModule.class, "3")) {
          return;
       }
       RequestTiming cOLD_START = RequestTiming.COLD_START;
       d.a(-1492894991).N00(cOLD_START);
       d.a(-1492894991).G1();
       d.a(-1492894991).A9(cOLD_START);
       d.a(-1492894991).Ke();
       d.a(-1492894991).nN();
       d.a(-1492894991).rW();
       PatchProxy.onMethodExit(LiveInitModule.class, "3");
       return;
    }
    public void n(){
       if (PatchProxy.applyVoidWithListener(null, this, LiveInitModule.class, "1")) {
          return;
       }
       if (!d.i) {
          PatchProxy.onMethodExit(LiveInitModule.class, "1");
          return;
       }else if(QCurrentUser.ME.isLogined()){
          c.b(new r(this));
       }else {
          e.j(new s(this), "LiveInitModule fetchConfigs", true);
       }
       f.a(c.class, new p(this));
       this.r = RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new q(this));
       d.a(-1492894991).hm();
       String str = "live_audience_plugin";
       if (g.d(str) && d.c(str)) {
          PluginManager.H.P(str, 4);
       }
       PatchProxy.onMethodExit(LiveInitModule.class, "1");
       return;
    }
}
