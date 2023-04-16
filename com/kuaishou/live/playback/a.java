package com.kuaishou.live.playback.a;
import os5.k;
import java.lang.Object;
import com.smile.gifshow.annotation.plugin.a;
import java.lang.Class;
import com.smile.gifshow.annotation.plugin.Factory;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ei3.i;
import android.content.Context;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LiveShellActivity;
import com.kwai.framework.model.feed.BaseFeed;
import ki3.q0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import android.app.Activity;
import java.lang.Boolean;
import ei3.g;
import ei3.h;
import com.kwai.feature.api.live.service.basic.model.LivePlaybackParam;
import ei3.f;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import tkd.b;
import tkd.d;
import ei3.b;
import brd.t;
import com.kwai.feature.api.live.plugin.dva.LoadPolicy;
import brd.a0;
import ei3.e;
import erd.o;

public class a implements k	// class@000d20
{
    public final k b;

    public void a(){
       super();
       this.b = new a(k.class).getInstance();
    }
    public void BM(GifshowActivity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       LiveShellActivity.u3(p0, new i(this, p0, p1), "startPlaybackActivity4");
       return;
    }
    public void IS(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, q0.class, "31")) {
          ClientEvent$ElementPackage uElementPack = q0.c("SHOW_LIVE_PLAYBACK");
          uElementPack.params = q0.e(p0);
          u1.u0(3, uElementPack, q0.b(p0));
       }
       return;
    }
    public void TU(Activity p0,BaseFeed p1,String p2,String p3,boolean p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
             return;
          }
       }
       g og = new g(this, p0, p1, p2, p3, p4);
       LiveShellActivity.u3(p0, uoa, "startPlaybackActivity2");
       return;
    }
    public void gE(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, q0.class, "30")) {
          ClientEvent$ElementPackage uElementPack = q0.c("CLICK_LIVE_PLAYBACK");
          uElementPack.params = q0.e(p0);
          u1.u(1, uElementPack, q0.b(p0));
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void j30(Activity p0,BaseFeed p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "2")) {
          return;
       }
       LiveShellActivity.u3(p0, new h(this, p0, p1, p2), "startPlaybackActivity1");
       return;
    }
    public void kr(Activity p0,LivePlaybackParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       LiveShellActivity.u3(p0, new f(this, p0, p1), "startPlaybackActivity3");
       return;
    }
    public final k n(){
       a tb;
       k obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (LivePluginManager.c())? d.a(-308178806).S8(): this.b;
       return obj;
    }
    public t zh(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePluginManager.e(k.class, LoadPolicy.SILENT, objArray, "getPlaybackTabClass").u(new e(this)).d0();
    }
}
