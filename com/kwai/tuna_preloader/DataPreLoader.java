package com.kwai.tuna_preloader.DataPreLoader;
import gu7.b;
import com.kwai.tuna_preloader.DataPreLoader$d;
import nsd.u;
import com.kwai.tuna_preloader.DataPreLoader$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.atomic.AtomicInteger;
import hu7.a;
import com.kwai.tuna_preloader.DataPreLoader$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.tuna_preloader.DataPreLoader$LoadController;
import com.kwai.tuna_preloader.DataPreLoader$preload$1;
import com.kwai.tuna_preloader.DataPreLoader$preload$2;
import msd.l;
import java.lang.Throwable;
import brd.t;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.kwai.tuna_preloader.DataPreLoader$getWithRetry$2;
import io.reactivex.g;
import io.reactivex.subjects.ReplaySubject;
import mrd.c;
import com.kwai.tuna_preloader.DataPreLoader$getWithRetry$1;
import com.kwai.tuna_preloader.preload_wrapper.ResultWrapper;
import com.kwai.tuna_preloader.DataPreLoader$b;
import com.kwai.tuna_preloader.DataPreLoader$get$1;
import com.kwai.tuna_preloader.DataPreLoader$e;
import java.lang.RuntimeException;
import java.lang.Number;
import com.kwai.tuna_preloader.DataPreLoader$getDataFromCache$1;
import com.kwai.tuna_preloader.DataPreLoader$getDataFromCache$2;
import com.kwai.tuna_preloader.DataPreLoader$notifyAllWaiters$1$1;
import gu7.a;
import com.kwai.tuna_preloader.DataPreLoader$notifyAllWaiters$1$2;
import erd.g;
import crd.b;
import com.kwai.tuna_preloader.DataPreLoader$notifyAllWaiters$1$3;
import com.kwai.tuna_preloader.DataPreLoader$notifyAllWaiters$1$4;
import brd.y;
import qrd.l1;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import c15.b;

public final class DataPreLoader implements b	// class@00196e
{
    public final AtomicInteger a;
    public DataPreLoader$e b;
    public DataPreLoader$LoadController c;
    public DataPreLoader$b d;
    public DataPreLoader$c e;
    public static final DataPreLoader$d f;

    static {
       DataPreLoader.f = new DataPreLoader$d(null);
    }
    public void DataPreLoader(DataPreLoader$a p0){
       DataPreLoader$a a;
       a.p(p0, "builder");
       super();
       this.a = new AtomicInteger(1);
       this.d = new a();
       this.c = p0.c;
       a = p0.a;
       if (a != null) {
          this.d = a;
       }
       p0 = p0.b;
       if (p0 != null) {
          this.e = p0;
       }
       DataPreLoader te = this.e;
       if (te != null && !PatchProxy.applyVoidOneRefs(this, te, DataPreLoader$c.class, "1")) {
          a.p(this, "dataPreLoader");
          te.a = this;
       }
       return;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DataPreLoader.class, "1")) {
          return;
       }
       DataPreLoader te = this.e;
       if (te != null) {
          te.f();
       }
       int i = 1;
       if (this.a.get() == i) {
          te = this.c;
          if (te != null && (te.d() == i && this.a.compareAndSet(i, 2))) {
             te = this.e;
             if (te != null) {
                te.l();
             }
             te = this.c;
             if (te != null) {
                te.c(new DataPreLoader$preload$1(this), new DataPreLoader$preload$2(this));
             }
          }else {
          label_0048 :
             te = this.e;
             if (te != null) {
                te.i(objArray);
             }
          }
       }else {
          goto label_0048 ;
       }
       return;
    }
    public synchronized t b(boolean p0,DataPreLoader$LoadController p1){
       DataPreLoader$LoadController obj;
       t ot;
       DataPreLoader uDataPreLoad = DataPreLoader.class;
       if (PatchProxy.isSupport(uDataPreLoad)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uDataPreLoad, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uDataPreLoad = this.e;
       if (uDataPreLoad != null) {
          uDataPreLoad.e();
       }
       obj = (p1 != null)? p1: this.c;
       if (obj != null) {
          int i = this.a.get();
          if (i != 1) {
             if (i != 2 && i != 3) {
                if (i != 4) {
                   this.k(new IllegalStateException("Unexpected state: "+this.a.get()+" on get"));
                   ot = t.error(this.g());
                   a.o(ot, "Observable.error\(createGetDataException\(\)\)");
                }else {
                   ot = t.create(new DataPreLoader$getWithRetry$2(this, p0, obj));
                   a.o(ot, "Observable.create { emit¡­  }\n          \)\n        }");
                }
             }else {
                ReplaySubject replaySubjec = ReplaySubject.g();
                a.o(replaySubjec, "ReplaySubject.create<ResultWrapper<Result>>\(\)");
                this.f(replaySubjec, p1, true, p0);
                ot = replaySubjec;
             }
          }else {
             ot = t.create(new DataPreLoader$getWithRetry$1(this, obj));
             a.o(ot, "Observable.create { emit¡­  }\n          \)\n        }");
          }
          return ot;
       }else {
          ot = t.error(this.g());
          a.o(ot, "Observable.error\(createGetDataException\(\)\)");
          return ot;
       }
    }
    public ResultWrapper c(){
       Object[] objArray = null;
       DataPreLoader obj = PatchProxy.apply(objArray, this, DataPreLoader.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj != null) {
          objArray = obj.c();
       }
       return objArray;
    }
    public boolean d(){
       Object[] objArray = null;
       t obj = PatchProxy.apply(objArray, this, DataPreLoader.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.a.get() != 4) {
          return b;
       }
       try{
          obj = this.e(b);
          if (obj != null) {
             objArray = obj.blockingFirst(objArray);
          }
       }catch(java.lang.Exception e0){
       }
       if (objArray != null) {
          b = true;
       }
       return b;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, DataPreLoader.class, "6")) {
          return;
       }
       DataPreLoader te = this.e;
       if (te != null) {
          te.d();
       }
       this.j();
       te = this.c;
       if (te != null) {
          te.a();
       }
       te = this.d;
       if (te != null) {
          te.b();
       }
       return;
    }
    public synchronized t e(boolean p0){
       ReplaySubject obj;
       DataPreLoader uDataPreLoad = DataPreLoader.class;
       if (PatchProxy.isSupport(uDataPreLoad)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uDataPreLoad, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uDataPreLoad = this.e;
       if (uDataPreLoad != null) {
          uDataPreLoad.e();
       }
       int i = this.a.get();
       t ot = null;
       if (i != 1) {
          if (i != 2 && i != 3) {
             if (i != 4) {
                this.k(new IllegalStateException("Unexpected state: "+this.a.get()+" on get"));
                ot = t.error(this.g());
             }else {
                ot = t.create(new DataPreLoader$get$1(this, p0));
             }
          }else {
             obj = ReplaySubject.g();
             a.o(obj, "ReplaySubject.create<ResultWrapper<Result>>\(\)");
             this.f(obj, ot, false, p0);
             return obj;
          }
       }else {
          DataPreLoader te = this.e;
          if (te != null) {
             te.g(false, ot);
          }
       }
       return ot;
    }
    public final void f(c p0,DataPreLoader$LoadController p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(DataPreLoader.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, DataPreLoader.class, "9")) {
          return;
       }
       DataPreLoader$e uoe = new DataPreLoader$e(p0, p2, p3);
       uoe.a = p1;
       if (this.b == null) {
          this.b = uoe;
       }else {
          uoe.b(this.b);
          this.b = uoe;
       }
       return;
    }
    public final Exception g(){
       Object obj = PatchProxy.apply(null, this, DataPreLoader.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RuntimeException("DataPreLoader get failed");
    }
    public int getState(){
       Object obj = PatchProxy.apply(null, this, DataPreLoader.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.get();
    }
    public final void h(boolean p0,l p1,l p2){
       if (PatchProxy.isSupport(DataPreLoader.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, DataPreLoader.class, "2")) {
          return;
       }
       if (this.a.get() == 4) {
          DataPreLoader td = this.d;
          if (td != null && td.e() == true) {
             td = this.d;
             if (td != null) {
                td.d(new DataPreLoader$getDataFromCache$1(this, p1, p0), new DataPreLoader$getDataFromCache$2(this, p2, p0));
             }
          }else {
          label_0040 :
             p2.invoke(null);
          }
       }else {
          goto label_0040 ;
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, DataPreLoader.class, "10")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       _monitor_enter(this);
       for (DataPreLoader tb = this.b; tb != null; tb = tb.b) {
          DataPreLoader$e c = tb.c;
          if (tb.d != null) {
             this.b(tb.a(), tb.a).subscribe(new a(new DataPreLoader$notifyAllWaiters$1$1(c)), new a(new DataPreLoader$notifyAllWaiters$1$2(c)));
          }else {
             t ot = this.e(tb.a());
             if (ot == null || ot.subscribe(new a(new DataPreLoader$notifyAllWaiters$1$3(c)), new a(new DataPreLoader$notifyAllWaiters$1$4(c))) == null) {
                c.onError(this.g());
                l1 a = l1.a;
             }
          }
          tb.b(null);
       }
       _monitor_exit(this);
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, DataPreLoader.class, "8")) {
          return;
       }
       this.a.set(1);
       return;
    }
    public final void k(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DataPreLoader.class, "11")) {
          return;
       }
       b.c(KsLogTunaCoreTag.TUNA_DEBUG.appendTag("DataPreLoader"), p0);
       return;
    }
}
