package com.yxcorp.gifshow.init.module.GameCenterInitModule;
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
import android.app.Activity;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import b76.a;
import o56.d;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import sxa.l;
import erd.g;
import crd.b;
import ujc.e;
import sxa.k;
import com.kwai.sdk.switchconfig.a;
import wkd.b;
import tjc.c;
import android.os.Bundle;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.init.module.c0;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public class GameCenterInitModule extends HomeCreateInitModule	// class@001981
{
    public static final int q;

    public void GameCenterInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 8;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, GameCenterInitModule.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(GameCenterInitModule.class, "8");
       return Lists.e(obj);
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GameCenterInitModule.class, "4")) {
          return;
       }
       d.a(-1986139969).onHomeActivityDestroy();
       PatchProxy.onMethodExit(GameCenterInitModule.class, "4");
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GameCenterInitModule.class, "5")) {
          return;
       }
       String str = "1";
       if (!PatchProxy.applyVoidWithListener(null, this, GameCenterInitModule.class, str)) {
          if (!d.i) {
             PatchProxy.onMethodExit(GameCenterInitModule.class, str);
          }else {
             d.a(-1986139969).initialize(a.b());
             RxBus f = RxBus.f;
             RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
             f.g(l.class, mAIN).subscribe(new l(this));
             f.g(e.class, mAIN).subscribe(new k(this));
             PatchProxy.onMethodExit(GameCenterInitModule.class, str);
          }
       }
       if (a.t().d("LaunchOptGameCenterDelayInit", false)) {
          if (!b.a(-1608526086).S()) {
             this.n0();
          }
       }else {
          this.n0();
       }
       PatchProxy.onMethodExit(GameCenterInitModule.class, "5");
       return;
    }
    public void l0(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, GameCenterInitModule.class, "2")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          PatchProxy.onMethodExit(GameCenterInitModule.class, "2");
          return;
       }else {
          d.a(-1986139969).onHomeActivityCreate(p0);
          PatchProxy.onMethodExit(GameCenterInitModule.class, "2");
          return;
       }
    }
    public void n(){
    }
    public final void n0(){
       if (PatchProxy.applyVoidWithListener(null, this, GameCenterInitModule.class, "6")) {
          return;
       }
       e.f(c0.b, "init-gameCenter-module", true, true);
       PatchProxy.onMethodExit(GameCenterInitModule.class, "6");
       return;
    }
    public void onHomeSplashEvent(e p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GameCenterInitModule.class, "7")) {
          return;
       }
       if (a.t().d("LaunchOptGameCenterDelayInit", false) && p0.a == 4) {
          this.n0();
       }
       PatchProxy.onMethodExit(GameCenterInitModule.class, "7");
       return;
    }
    public int priority(){
       return 100;
    }
}
