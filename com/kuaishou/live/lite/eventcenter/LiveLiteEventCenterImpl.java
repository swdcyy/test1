package com.kuaishou.live.lite.eventcenter.LiveLiteEventCenterImpl;
import wa3.c;
import androidx.lifecycle.Lifecycle;
import xp5.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.TimeUnit;
import brd.t;
import com.kuaishou.live.lite.eventcenter.LiveLiteEventCenterImpl$lifecycleEventObserver$1;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lp3.e;
import lp3.c;
import lp3.b;
import androidx.lifecycle.LifecycleObserver;
import t45.d;
import brd.z;
import com.kuaishou.live.lite.eventcenter.LiveLiteEventCenterImpl$a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import com.kuaishou.live.lite.eventcenter.LiveLiteEventCenterImpl$b;

public final class LiveLiteEventCenterImpl implements c	// class@0008f2
{
    public b b;
    public b c;
    public final t d;
    public boolean e;
    public boolean f;
    public int g;
    public final LiveLiteEventCenterImpl$lifecycleEventObserver$1 h;
    public final PublishSubject i;
    public final Lifecycle j;
    public final g k;

    public void LiveLiteEventCenterImpl(Lifecycle p0,g p1){
       a.p(p0, "lifecycle");
       a.p(p1, "infoService");
       super();
       this.j = p0;
       this.k = p1;
       this.d = t.interval(1, TimeUnit.SECONDS);
       this.h = new LiveLiteEventCenterImpl$lifecycleEventObserver$1(this);
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Any>\(\)");
       this.i = publishSubje;
    }
    public void K1(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEventCenterImpl.class, "3")) {
          return;
       }
       a.p(p0, "event");
       this.i.onNext(p0);
       return;
    }
    public void create(e p0){
       z a;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEventCenterImpl.class, "1")) {
          return;
       }
       a.p(p0, "serviceManager");
       b.a(this, p0);
       this.j.addObserver(this.h);
       a = d.a;
       b uob = this.d.observeOn(a).subscribe(new LiveLiteEventCenterImpl$a(this));
       a.o(uob, "timeObservable.observeOn¡­OfEnterRoomSecond\)\)\n    }");
       this.b = uob;
       t ot = RxBus.f.f(n.class).observeOn(a);
       uob = ot.subscribe(new LiveLiteEventCenterImpl$b(this));
       a.o(uob, "RxBus.INSTANCE.toObserva¡­lowAnchorEvent\(\)\)\n      }");
       this.c = uob;
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEventCenterImpl.class, "2")) {
          return;
       }
       b.b(this);
       LiveLiteEventCenterImpl tb = this.b;
       if (tb == null) {
          a.S("timeDisposable");
       }
       tb.dispose();
       tb = this.c;
       if (tb == null) {
          a.S("followDisposable");
       }
       tb.dispose();
       this.j.removeObserver(this.h);
       return;
    }
    public t kk(){
       return this.i;
    }
}
