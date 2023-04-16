package com.kuaishou.live.common.core.component.effect.renderer.c;
import im8.g;
import k51.c;
import com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge;
import com.kuaishou.live.common.core.component.effect.renderer.b;
import ok.x;
import com.google.common.base.Suppliers;
import com.kuaishou.live.common.core.component.effect.renderer.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gz2.h;
import p91.m;
import lp3.e;
import rp5.a;
import lp3.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import va1.g;
import ag1.g;
import va1.g$a;
import ekd.k1;
import java.util.Objects;
import java.util.Map;
import pz2.c;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.h;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGiftEffectLocalRenderTextureView;
import eg1.e;
import lp3.i;
import pz2.e;
import com.kuaishou.live.common.core.component.effect.renderer.d;
import fg1.a;
import gz2.a;
import dz2.c;
import cz2.d;
import ag1.i;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import pz2.a;
import java.lang.Long;
import com.kuaishou.android.live.log.b;
import pz2.i;
import pz2.j;
import ag1.n;
import java.util.HashMap;
import ag1.e;

public class c extends c implements g	// class@0010ef
{
    public e A;
    public LiveGiftEffectLocalRenderTextureView p;
    public h q;
    public m r;
    public e s;
    public i t;
    public i u;
    public c v;
    public long w;
    public e x;
    public final LiveEffectBridge y;
    public x z;
    public static String sLivePresenterClassName = "LiveEffectRendererPresenter";

    public void c(){
       super();
       this.y = new LiveEffectBridge();
       this.z = Suppliers.a(new b(this));
       this.A = new c$a(this);
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       this.R8();
       if (!PatchProxy.applyVoid(objArray, this, uoc, "4") && !this.r.e()) {
          g og = new g(new g(this), this.r.t5().a(a.class).t().getLifecycle(), this.r.t5().c(LiveSlidePlayService.class));
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "3")) {
          return;
       }
       k1.n("LiveEffectRendererPresenterExecuteEffect");
       this.v = objArray;
       c ty = this.y;
       Objects.requireNonNull(ty);
       if (!PatchProxy.applyVoid(objArray, ty, LiveEffectBridge.class, "7")) {
          ty.a.clear();
       }
       return;
    }
    public void P8(c p0){
    }
    public h R8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       c obj = PatchProxy.apply(null, this, uoc, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.q == null) {
          if (!PatchProxy.applyVoid(null, this, uoc, "5")) {
             this.p = (this.r.e())? h.f(this.m8(), 0x7f0a2105, 0x7f0a2104): h.f(this.m8(), 0x7f0a2188, 0x7f0a2187);
          }
       label_004a :
          if (!PatchProxy.applyVoid(null, this, uoc, "6")) {
             this.V8();
             obj = this.t;
             if (obj != null) {
                e uoe = obj.a(e.class);
                c uoc1 = PatchProxy.apply(null, this, uoc, "7");
                if (uoc1 != patchProxyRe) {
                }else if(this.s == null){
                   this.s = new d(this);
                }
                uoc1 = this.s;
                uoe.Em(uoc1);
             }
          }
          if (!PatchProxy.applyVoid(null, this, uoc, "13")) {
             long l = a.g();
             if (l - null > 0) {
                a uoa = new a(this.p, a.d(), l, this.z.get());
                this.q = obj;
             }else {
                this.q = new h(this.p, a.d(), this.z.get());
             }
          }
          obj = this.q;
          i oi = PatchProxy.apply(null, this, uoc, "12");
          if (oi != patchProxyRe) {
          }else {
             oi = new i(this);
          }
          obj.g(oi);
       }
       return this.q;
    }
    public void S8(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "9")) {
          return;
       }
       b.S(LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectRendererPresenter"), "executeEffectTask: audience streamMerge", "magicFaceId", Long.valueOf(p0.b()));
       c tu = this.u;
       if (tu != null) {
          tu.d(p0, false, "NO_SUPPORT_RENDER_TYPE");
       }
       return;
    }
    public void V8(){
    }
    public void W8(int p0,int p1,Map p2,j p3){
    }
    public void X8(String p0){
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new n());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.t = oi;
       this.x = oi.c(e.class);
       this.A = this.s8(e.class);
       return;
    }
}
