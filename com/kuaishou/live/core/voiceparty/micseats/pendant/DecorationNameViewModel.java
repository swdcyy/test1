package com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNameViewModel;
import yh3.a;
import brd.t;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.BackpressureStrategy;
import yu2.c;
import com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNameViewModel$displayName$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNameViewModel$isVip$1;

public final class DecorationNameViewModel extends a	// class@0015ef
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;

    public void DecorationNameViewModel(t p0,LiveData p1){
       a.p(p0, "decorationInfoObservable");
       a.p(p1, "micSeatId");
       super();
       LiveData liveData = c.a(p0, null, 1, null);
       this.a = liveData;
       this.b = LiveDataOperators.b(liveData, p1, DecorationNameViewModel$displayName$1.INSTANCE);
       this.c = LiveDataOperators.b(liveData, p1, DecorationNameViewModel$isVip$1.INSTANCE);
    }
}
