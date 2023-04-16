package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerReDispatchPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerReDispatchPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import fna.j;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import fna.j$d;
import java.lang.System;
import fna.j$c;
import com.kwai.robust.PatchProxyResult;
import fna.b;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import java.util.List;
import fna.j$a;
import fna.w;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import fna.x;
import fna.y;
import erd.g;
import crd.b;
import crd.a;

public final class GrowthCleanerReDispatchPresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@001334
{

    public void GrowthCleanerReDispatchPresenter$onBind$1(GrowthCleanerReDispatchPresenter p0){
       super(1, p0, GrowthCleanerReDispatchPresenter.class, "dispatch", "dispatch\(Lcom/yxcorp/gifshow/growth/cleaner/impl/GrowthCleanerEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(j p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerReDispatchPresenter$onBind$1.class, str)) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, GrowthCleanerReDispatchPresenter.class, "6")) {
          j$c uoc = null;
          if (p0 instanceof j$d) {
             treceiver.S8();
             treceiver.r = System.currentTimeMillis();
             treceiver.s = 0;
             treceiver.t = uoc;
             treceiver.R8(p0);
          }else {
             long l = 100;
             if (p0 instanceof j$c) {
                if (((System.currentTimeMillis() - treceiver.r) / 20) - treceiver.s >= 0) {
                   treceiver.S8();
                   long l1 = treceiver.s + 1;
                   treceiver.s = l1;
                   if (l1 - l < 0) {
                      Object obj = p0;
                      Objects.requireNonNull(obj);
                      b uob = PatchProxy.apply(uoc, obj, j$c.class, str);
                      if (uob != PatchProxyResult.class) {
                      }else {
                         uob = obj.e.c(obj.d);
                      }
                      if (uob.b() - ((obj.c().b() / l) * treceiver.s) > 0) {
                         j$c uoc1 = new j$c(p0.a(), p0.b, p0.c, obj.c().a(l).d((l - treceiver.s)), p0.c(), p0.f);
                         treceiver.R8(treceiver.P8(uob));
                      }else {
                         treceiver.R8(treceiver.P8(obj));
                      }
                   }else {
                      treceiver.R8(treceiver.P8(p0));
                   }
                }
             }else if(p0 instanceof j$a){
                treceiver.S8();
                if (treceiver.s - l < 0) {
                   treceiver.q.c(t.create(new w(treceiver, p0)).subscribeOn(d.c).observeOn(d.a).subscribe(new x(treceiver), new y(treceiver, p0)));
                }else {
                   treceiver.t = uoc;
                   treceiver.R8(p0);
                }
             }else {
                treceiver.S8();
                treceiver.t = uoc;
                treceiver.R8(p0);
             }
          }
       }
       return;
    }
}
