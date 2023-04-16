package com.kuaishou.merchant.live.robot.LiveAudienceCartEffectPresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.live.robot.LiveAudienceCartEffectPresenter$a;
import com.kuaishou.merchant.live.robot.LiveAudienceCartEffectPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qr5.b$a;
import qr5.b;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import i74.c;
import java.util.Map;
import java.util.HashMap;
import fq5.b;
import ks3.r;
import ks3.d0;
import ks3.i0;
import lp3.i;
import lp3.c;

public class LiveAudienceCartEffectPresenter extends PresenterV2 implements g	// class@001acb
{
    public b p;
    public r q;
    public d0 r;
    public i0 s;
    public b t;
    public long u;
    public boolean v;
    public LiveAudienceCartEffectPresenter$c w;
    public final b$a x;

    public void LiveAudienceCartEffectPresenter(){
       super();
       this.u = Long.MAX_VALUE;
       this.w = new LiveAudienceCartEffectPresenter$a(this);
       this.x = new LiveAudienceCartEffectPresenter$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceCartEffectPresenter.class, "2")) {
          return;
       }
       this.t.oi(this.x);
       this.u = System.currentTimeMillis();
       this.v = false;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceCartEffectPresenter.class, "3")) {
          return;
       }
       this.t.j8(this.x);
       this.u = Long.MAX_VALUE;
       this.v = false;
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceCartEffectPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceCartEffectPresenter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAudienceCartEffectPresenter.class, new c());
       }else {
          obj.put(LiveAudienceCartEffectPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceCartEffectPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.r8("LIVE_MERCHANT_AUDIENCE_BOTTOM_BAR_SERVICE");
       this.r = this.r8("LIVE_MERCHANT_EFFECT_SERVICE");
       this.s = this.t8("LIVE_MERCHANT_PLAY_CONFIG_SERVICE");
       this.t = this.r8("LIVE_SERVICE_MANAGER").a(b.class);
       return;
    }
}
