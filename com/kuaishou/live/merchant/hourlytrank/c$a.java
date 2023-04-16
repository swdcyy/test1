package com.kuaishou.live.merchant.hourlytrank.c$a;
import fg3.s;
import com.kuaishou.live.merchant.hourlytrank.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import t02.a0;
import ks3.r;
import e17.i;
import com.kuaishou.live.merchant.hourlytrank.model.LiveMerchantHourlyRankResponse;
import brd.y;
import vf3.b;
import vf3.a;
import p91.m;

public class c$a implements s	// class@000ccd
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.a.P8(p0);
       return;
    }
    public t b(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.t.hide();
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "5")) {
          return;
       }
       c p = this.a.p;
       if (p == null) {
          return;
       }
       if (p.z1.c()) {
          this.a.p.z1.f();
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f1032a7);
       }
       return;
    }
    public void d(LiveMerchantHourlyRankResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "4")) {
          return;
       }
       this.a.u.onNext(p0);
       return;
    }
    public void e(){
       this.a.w = 0;
    }
    public t f(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.u.hide();
    }
    public t g(int p0){
       c w;
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 <= 0) {
          w = this.a.w;
       }
       return a.a().g(w, this.a.q.getLiveStreamId());
    }
}
