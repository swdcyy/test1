package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoModel;
import yh3.a;
import ts2.f;
import brd.t;
import java.util.Set;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt;
import io.reactivex.BackpressureStrategy;
import yu2.c;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatVideoModel$micSeatIds$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;

public final class MicSeatVideoModel extends a	// class@00171a
{
    public final LiveData a;

    public void MicSeatVideoModel(f p0,t p1,Set p2){
       a.p(p0, "micSeatStateService");
       a.p(p1, "windowRenderStatus");
       a.p(p2, "forceOpenVideoUsers");
       super();
       this.a = LiveDataOperators.b(IMicSeatStateServiceKt.b(p0), c.a(p1, null, 1, null), new MicSeatVideoModel$micSeatIds$1(p2));
    }
}
