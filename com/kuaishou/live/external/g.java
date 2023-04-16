package com.kuaishou.live.external.g;
import i33.d;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.profile.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import ia1.h;
import com.kwai.framework.cache.a$a;
import com.kwai.framework.cache.a;
import dm1.i;
import dm1.h;
import com.kuaishou.live.effect.resource.download.track.LiveEffectResCleanManager;
import tz2.b;
import a03.a$c;
import a03.a;
import b03.a;
import ao2.b;
import com.kwai.robust.PatchProxyResult;
import ao2.k;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse;
import com.kuaishou.live.common.core.component.authority.c;
import com.kuaishou.live.effect.resource.download.common.e;
import wkd.b;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import fg6.a;
import com.google.gson.Gson;
import pp.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import dx5.h$a;
import dx5.h;
import yf6.h;
import com.kuaishou.live.core.show.test.z0;
import m33.b;
import w43.a;
import android.app.Activity;
import android.content.Context;
import x33.f;
import o02.f;
import o02.e;
import brd.t;
import com.kuaishou.live.core.basic.utils.g;
import x33.d;
import java.lang.Runnable;
import erd.o;
import cjd.e;
import x33.c;
import x33.b;
import erd.g;
import crd.b;

public class g implements d	// class@001b74
{
    public h b;

    public void g(){
       super();
       this.b = new c();
    }
    public void D30(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "1")) {
          return;
       }
       b.P(d.r0, "registerAppCacheHandler");
       if (!PatchProxy.applyVoid(objArray, objArray, LiveResourceFileUtil.class, "2")) {
          a.p(new h());
       }
       if (!PatchProxy.applyVoid(objArray, objArray, i.class, "12")) {
          a.p(new h());
       }
       if (!PatchProxy.applyVoid(objArray, objArray, LiveEffectResCleanManager.class, "10")) {
          if (b.c.a()) {
             a.a().c("³õÊ¼»¯Lru×´Ì¬");
          }
          a.p(new a());
       }
       return;
    }
    public b Dl(){
       Object obj = PatchProxy.apply(null, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k();
    }
    public void Xf(LiveConfigStartupResponse p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "6")) {
          return;
       }
       e.b().kb();
       int i = -416381922;
       b.a(i).c = p0.mMaintenanceConfig;
       c uoc1 = b.a(i);
       LiveConfigStartupResponse mLiveAnchorB = p0.mLiveAnchorBottomServerConfig;
       Objects.requireNonNull(uoc1);
       if (!PatchProxy.applyVoidOneRefs(mLiveAnchorB, uoc1, uoc, "3")) {
          b.c0(LiveLogTag.ANCHOR_FUNCTION_STATUS, "updateLiveAnchorBottomBarConfig", "mLiveAnchorBottomServerConfig", a.a.q(uoc1.d));
          uoc1.d = mLiveAnchorB;
       }
       b.a(i).e = p0.mLiveMakeupTipConfig;
       c uoc2 = b.a(i);
       p0 = p0.mLiveAnchorUVCConfig;
       Objects.requireNonNull(uoc2);
       if (!PatchProxy.applyVoidOneRefs(p0, uoc2, uoc, "11")) {
          uoc2.f = p0;
          b.c0(LiveLogTag.ANCHOR_FUNCTION_STATUS, "getLiveAnchorUvcConfig", a.a.q(p0), null);
       }
       return;
    }
    public void d3(GifshowActivity p0,String p1,ProfileTemplateCard p2,h$a p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, g.class, "8")) {
          return;
       }
       this.b.d3(p0, p1, p2, p3);
       return;
    }
    public h dc(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.P(d.r0, "createLiveTestConfigPage");
       return new z0();
    }
    public boolean isAvailable(){
       return true;
    }
    public b j4(){
       Object obj = PatchProxy.apply(null, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public void oV(Activity p0,Context p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "3")) {
          return;
       }
       b.P(d.r0, "handleLiveApplyItemClick");
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "1")) {
          e.a().G().retryWhen(new g(d.b)).map(new e()).subscribe(new c(p0, p1), new b(p0));
       }
       return;
    }
    public void ta(GifshowActivity p0,String p1,ProfileTemplateCard p2,h$a p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, g.class, "7")) {
          return;
       }
       this.b.f3(p0, p1, p2, p3);
       return;
    }
}
