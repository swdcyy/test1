package com.kuaishou.live.common.core.component.effect.renderer.d;
import pz2.e;
import com.kuaishou.live.common.core.component.effect.renderer.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import eg1.e;
import lp3.c;
import lp3.i;
import pz2.c;
import java.lang.System;
import ekd.k1;
import gz2.h;
import pz2.d;
import pz2.i;
import java.util.Map;
import pz2.j;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import fg1.a;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import ag1.h;
import java.lang.Runnable;

public class d implements e	// class@0010f0
{
    public final c a;

    public void d(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "3")) {
          return;
       }
       d ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, c.class, "10")) {
          c t = ta.t;
          if (t != null) {
             t = t.a(e.class).H();
             if (t != null) {
                ta.w = System.currentTimeMillis();
                k1.n("LiveEffectRendererPresenterExecuteEffect");
                int i = t.p();
                if (i != 1) {
                   if (i == 2) {
                      ta.P8(t);
                   }
                }else {
                   ta.R8().a();
                }
             }
          }
       }
       return;
    }
    public void b(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "6")) {
          return;
       }
       this.a.R8().C0(p0, p1);
       return;
    }
    public boolean c(){
       return d.b(this);
    }
    public c d(){
       return d.a(this);
    }
    public void e(i p0){
       this.a.u = p0;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       this.a.X8(p0);
       return;
    }
    public void g(int p0,int p1,Map p2,j p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, this, d.class, "5")) {
          return;
       }
       this.a.W8(p0, p1, p2, p3);
       return;
    }
    public void n5(c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "1")) {
          return;
       }
       k1.n("LiveEffectRendererPresenterExecuteEffect");
       long l = 500;
       c obj = PatchProxy.applyOneRefs(p0, this, uod, "2");
       boolean b = true;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          uod = this.a;
          if ((System.currentTimeMillis() - uod.w) - 1000 <= 0) {
             obj = uod.v;
             a uoa = (obj != null && obj.p() == b)? 1: null;
             int i = (a.i(p0) || (p0.p() == b || (a.i(p0) && p0.p() == 2)))? 1: 0;
             if (uoa && i) {
                b = false;
             }
          }
       }
       obj = PatchProxy.apply(null, null, a.class, "11");
       boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("enableEffectRenderDelayOptimize", false);
       if (b1 && b) {
          l = 0;
       }
       this.a.v = p0;
       k1.s(new h(this, p0), "LiveEffectRendererPresenterExecuteEffect", l);
       return;
    }
    public void pause(){
       d.c(this);
    }
    public void release(){
       d.d(this);
    }
    public void resume(){
       d.e(this);
    }
}
