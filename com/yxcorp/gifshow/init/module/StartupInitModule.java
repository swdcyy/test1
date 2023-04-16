package com.yxcorp.gifshow.init.module.StartupInitModule;
import com.kwai.framework.init.HomeCreateInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.log.c0;
import com.yxcorp.gifshow.log.v;
import k2b.k;
import com.yxcorp.gifshow.log.e$c;
import o96.u;
import com.yxcorp.plugin.tencent.map.MapLocationManager;
import com.yxcorp.gifshow.init.module.StartupInitModule$StartupTask;
import java.lang.Thread;
import java.lang.System;
import oe6.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import b76.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import sxa.h0;
import erd.g;
import crd.b;
import eda.n;
import sxa.g0;
import com.kwai.framework.network.diffinfo.DiffInfoSwitch;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import e66.a;
import gb6.e;
import io7.a;
import gb6.f;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import java.util.Set;
import oe6.c;

public class StartupInitModule extends HomeCreateInitModule	// class@0019a1
{
    public boolean q;
    public static final int r;

    public void StartupInitModule(){
       super();
       this.q = true;
    }
    public int f0(){
       return 21;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, StartupInitModule.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(StartupInitModule.class, "7");
       return Lists.e(obj);
    }
    public void h0(){
       if (PatchProxy.applyVoidWithListener(null, this, StartupInitModule.class, "5")) {
          return;
       }
       String str = "8";
       if (!PatchProxy.applyVoidWithListener(null, this, StartupInitModule.class, str)) {
          c0.q().j();
          k.l().j();
          e$c.k().j();
          PatchProxy.onMethodExit(StartupInitModule.class, str);
       }
       if (!PatchProxy.applyVoid(null, null, u.class, "30")) {
          MapLocationManager.getInstance().pauseAllRequest();
       }
       PatchProxy.onMethodExit(StartupInitModule.class, "5");
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoidWithListener(null, this, StartupInitModule.class, "6")) {
          return;
       }
       new StartupInitModule$StartupTask(this.q).start();
       this.q = false;
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putLong("start_time", System.currentTimeMillis());
       g.a(uEditor);
       if (!PatchProxy.applyVoid(null, null, u.class, "31")) {
          MapLocationManager.getInstance().resumePausedRequest();
       }
       PatchProxy.onMethodExit(StartupInitModule.class, "6");
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, StartupInitModule.class, "1")) {
          return;
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       f.g(l.class, mAIN).subscribe(new h0(this));
       f.g(n.class, mAIN).subscribe(new g0(this));
       DiffInfoSwitch c = DiffInfoSwitch.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoid(null, c, DiffInfoSwitch.class, "3")) {
          a.h(a.t().d("networkDiffInfoSwitch", false));
          a.t().p("networkDiffInfoSwitch", e.b);
          a.i(a.t().d("keyConfigDiffInfoSwitch", false));
          a.t().p("keyConfigDiffInfoSwitch", f.b);
       }
       PatchProxy.onMethodExit(StartupInitModule.class, "1");
       return;
    }
    public void l0(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, StartupInitModule.class, "4")) {
          return;
       }
       if (p1 == null || (p0.getIntent() != null && (p0.getIntent().getCategories() != null && p0.getIntent().getCategories().contains("android.intent.category.LAUNCHER")))) {
          a.m((a.e() + 1));
       }
    label_0036 :
       if (!c.a() - null) {
          SharedPreferences$Editor uEditor = c.a.edit();
          uEditor.putLong("FirstInstallTime", System.currentTimeMillis());
          g.a(uEditor);
       }
       PatchProxy.onMethodExit(StartupInitModule.class, "4");
       return;
    }
    public void n(){
    }
}
