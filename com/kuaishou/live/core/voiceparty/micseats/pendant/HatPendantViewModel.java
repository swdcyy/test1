package com.kuaishou.live.core.voiceparty.micseats.pendant.HatPendantViewModel;
import jt2.c;
import ts2.f;
import brd.t;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.BackpressureStrategy;
import yu2.c;
import com.kuaishou.live.core.voiceparty.micseats.pendant.HatPendantViewModel$hatInfo$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import com.kuaishou.live.core.voiceparty.micseats.pendant.HatPendantViewModel$a;
import z0.a;
import androidx.lifecycle.Transformations;

public final class HatPendantViewModel extends c	// class@00160c
{
    public final LiveData g;
    public Integer h;
    public final LiveData i;

    public void HatPendantViewModel(f p0,t p1,LiveData p2){
       a.p(p0, "micSeatStateService");
       a.p(p1, "usersHatInfoObservable");
       a.p(p2, "micSeatId");
       super(p0, p2);
       LiveData liveData = c.a(p1, null, 1, null);
       this.g = liveData;
       liveData = Transformations.map(LiveDataOperators.b(liveData, this.w0(), HatPendantViewModel$hatInfo$1.INSTANCE), new HatPendantViewModel$a(this));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.i = liveData;
    }
}
