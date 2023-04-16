package com.kuaishou.live.core.voiceparty.micseats.pendant.KsCoinPendantViewModel;
import jt2.c;
import ts2.f;
import brd.t;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.BackpressureStrategy;
import yu2.c;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KsCoinPendantViewModel$ksCoin$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import zh3.c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import yh3.a;
import it2.e0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ts2.d;
import ss2.f;
import ss2.g;

public final class KsCoinPendantViewModel extends c	// class@001614
{
    public final LiveData g;
    public final LiveEvent h;

    public void KsCoinPendantViewModel(f p0,t p1,LiveData p2){
       a.p(p0, "micSeatStateService");
       a.p(p1, "ksCoinInfoObservable");
       a.p(p2, "micSeatId");
       super(p0, p2);
       this.g = LiveDataOperators.b(c.a(p1, null, 1, null), this.w0(), KsCoinPendantViewModel$ksCoin$1.INSTANCE);
       c uoc = new c();
       this.p0(uoc);
       this.h = uoc;
    }
    public final LiveData x0(){
       return this.g;
    }
    public final LiveEvent y0(){
       return this.h;
    }
    public void z0(e0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsCoinPendantViewModel.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       d value = this.v0().getValue();
       if (value != null) {
          f uof = g.b(value);
          if (uof != null) {
             this.s0(this.h).q(uof);
          }
       }
       return;
    }
}
