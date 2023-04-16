package com.kwai.nearby.local.presenter.secondary.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.lang.Number;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ed7.c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import prb.b;
import com.yxcorp.gifshow.nearby.common.helper.recorder.NearbyTimeRecordEvent;
import prb.a;
import md7.a;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import q2b.h$b;
import k2b.e0;
import k2b.u1;

public class b extends PresenterV2	// class@000fd0
{
    public final String p;
    public boolean q;
    public b r;
    public static final long s;

    static {
       Number number = PatchProxy.apply(null, null, LocalConfigKeyHelper.class, "15");
       if (number != PatchProxyResult.class) {
       }else {
          number = LocalConfigKeyHelper.o.getValue();
       }
       b.s = (long)number.intValue() * 1000;
    }
    public void b(String p0){
       super();
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       long s = b.s;
       if (s - null <= 0) {
          return;
       }
       if (this.q == null) {
          this.r = t.timer(s, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new c(this), Functions.d());
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       b.d().g(NearbyTimeRecordEvent.LOCAL_CACHE_DURATION);
       return;
    }
    public void H8(){
       String str = "4";
       if (PatchProxy.applyVoid(null, this, b.class, str)) {
          return;
       }
       long l = b.d().c(NearbyTimeRecordEvent.LOCAL_CACHE_DURATION).b();
       b tp = this.p;
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), tp, null, uoa, str)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "NEARBY_SEC_PAGE_STAY_DURATION";
          i3 oi3 = i3.f();
          oi3.c("stay_duration", Long.valueOf(l));
          oi3.d("from_source", tp);
          uElementPack.params = oi3.e();
          h$b uob = h$b.e(7, "NEARBY_SEC_PAGE_STAY_DURATION");
          uob.k(uElementPack);
          u1.p0("3665398", null, uob);
       }
       tp = this.r;
       if (tp != null && !tp.isDisposed()) {
          this.r.dispose();
       }
       return;
    }
    public void j8(){
       PatchProxy.applyVoid(null, this, b.class, "2");
    }
}
