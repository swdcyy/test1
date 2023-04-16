package com.kwai.sdk.eve.internal.api.EveApi;
import com.kwai.sdk.eve.internal.api.EveApi$a;
import nsd.u;
import vm7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.api.EveApi$api$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.sdk.eve.internal.api.EveApi$retrofitApi$2;
import com.kwai.sdk.eve.internal.api.EveApi$kinsightApi$2;
import com.kwai.sdk.eve.internal.api.EveApi$kinsightRetrofitApi$2;
import com.kwai.sdk.eve.internal.api.EveApi$ztApi$2;
import com.kwai.sdk.eve.internal.api.EveApi$ztRetrofitApi$2;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2;
import w97.a;
import tm7.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.eve.InitConfig;
import sm7.g;
import m97.f;
import u97.c;
import t97.b;
import com.kwai.sdk.eve.internal.api.EveApi$b;
import com.google.gson.Gson;
import com.kwai.sdk.eve.internal.common.utils.DataKt;
import u97.g;
import t97.a;
import com.yxcorp.retrofit.a;
import tm7.d;
import com.kwai.sdk.eve.internal.api.EveApi$c;
import brd.z;
import com.yxcorp.retrofit.e;
import tm7.a;

public final class EveApi	// class@001467
{
    public g a;
    public final p b;
    public final p c;
    public final p d;
    public final p e;
    public final p f;
    public final p g;
    public final p h;
    public final a i;
    public static final EveApi$a j;

    static {
       EveApi.j = new EveApi$a(null);
    }
    public void EveApi(a p0){
       a.p(p0, "context");
       super();
       this.i = p0;
       this.b = s.c(new EveApi$api$2(this));
       this.c = s.c(new EveApi$retrofitApi$2(this));
       this.d = s.c(new EveApi$kinsightApi$2(this));
       this.e = s.c(new EveApi$kinsightRetrofitApi$2(this));
       this.f = s.c(new EveApi$ztApi$2(this));
       this.g = s.c(new EveApi$ztRetrofitApi$2(this));
       this.h = s.c(new EveApi$apiMocker$2(this));
    }
    public final b a(a p0){
       g obj = PatchProxy.applyOneRefs(p0, this, EveApi.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i.b().e().c;
       c uoc = (obj != null)? obj.get(): null;
       b uob = new b("EveApi");
       uob.m(1);
       if (p0 != null) {
          uob.g(p0);
       }
       uob.l(new EveApi$b(uoc));
       Gson gson = DataKt.a();
       a.q(gson, "gson");
       uob.c = gson;
       EveApi ta = this.a;
       if (ta != null) {
          uob.k(ta);
       }
       return uob.b().a(b.class);
    }
    public final d b(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveApi.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return e.b(new EveApi$c(p0, p0.getExecuteScheduler(), p0.getRetryRandomizedTimeMs()), d.class);
       }
       return null;
    }
    public final b c(){
       Object obj = PatchProxy.apply(null, this, EveApi.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final a d(){
       Object obj = PatchProxy.apply(null, this, EveApi.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final a e(){
       return this.i;
    }
    public final d f(){
       Object obj = PatchProxy.apply(null, this, EveApi.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
}
