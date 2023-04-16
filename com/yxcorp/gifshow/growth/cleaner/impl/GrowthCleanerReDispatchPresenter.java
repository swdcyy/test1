package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerReDispatchPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import fna.j;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerReDispatchPresenter$onBind$1;
import fna.z;
import msd.l;
import erd.g;
import crd.b;
import fna.j$c;
import com.kwai.robust.PatchProxyResult;
import fna.b;
import java.lang.Long;
import java.lang.Number;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;

public final class GrowthCleanerReDispatchPresenter extends PresenterV2	// class@001335
{
    public PublishSubject p;
    public a q;
    public long r;
    public long s;
    public j$c t;

    public void GrowthCleanerReDispatchPresenter(){
       super();
       this.q = new a();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerReDispatchPresenter.class, "2")) {
          return;
       }
       this.X7(RxBus.f.f(j.class).observeOn(d.a).subscribe(new z(new GrowthCleanerReDispatchPresenter$onBind$1(this))));
       return;
    }
    public final j$c P8(j$c p0){
       long l;
       long l1;
       GrowthCleanerReDispatchPresenter obj = PatchProxy.applyOneRefs(p0, this, GrowthCleanerReDispatchPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj != null) {
          b uob = p0.b();
          Long longx = Long.valueOf(obj.b().a);
          b a = uob.a;
          int i = 1;
          int i1 = (longx.longValue() - a < 0)? 1: 0;
          Long longx1 = null;
          if (!i1) {
             longx = longx1;
          }
          if (longx != null) {
             a = longx.longValue();
          }
          uob.a = a;
          longx = Long.valueOf(obj.b().b);
          b b = uob.b;
          i1 = (longx.longValue() - b < 0)? 1: 0;
          if (!i1) {
             longx = longx1;
          }
          if (longx != null) {
             b = longx.longValue();
          }
          uob.b = b;
          longx = Long.valueOf(obj.b().c);
          b = uob.c;
          i1 = (longx.longValue() - b < 0)? 1: 0;
          if (!i1) {
             longx = longx1;
          }
          if (longx != null) {
             l = longx.longValue();
          }
          uob.c = l;
          longx = Long.valueOf(obj.b().d);
          b = uob.d;
          i1 = (longx.longValue() - b < 0)? 1: 0;
          if (!i1) {
             longx = longx1;
          }
          if (longx != null) {
             l = longx.longValue();
          }
          uob.d = l;
          longx = Long.valueOf(obj.b().e);
          b = uob.e;
          i1 = (longx.longValue() - b < 0)? 1: 0;
          if (!i1) {
             longx = longx1;
          }
          if (longx != null) {
             l = longx.longValue();
          }
          uob.e = l;
          Long longx2 = Long.valueOf(obj.b().f);
          a = uob.f;
          if (longx2.longValue() - a >= 0) {
             i = 0;
          }
          if (i) {
             longx1 = longx2;
          }
          if (longx1 != null) {
             l1 = longx1.longValue();
          }
          uob.f = l1;
          this.t = p0;
       }
       return p0;
    }
    public final void R8(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerReDispatchPresenter.class, "3")) {
          return;
       }
       GrowthCleanerReDispatchPresenter tp = this.p;
       if (tp == null) {
          a.S("mCleanerEventSubject");
       }
       tp.onNext(p0);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerReDispatchPresenter.class, "5")) {
          return;
       }
       this.q.dispose();
       this.q = new a();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerReDispatchPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("CLEANER_EVENT_SUBJECT");
       a.o(obj, "inject\(CLEANER_EVENT_SUBJECT\)");
       this.p = obj;
       return;
    }
}
