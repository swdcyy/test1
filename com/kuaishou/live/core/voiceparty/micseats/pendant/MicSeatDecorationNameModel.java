package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationNameModel;
import yh3.a;
import ts2.f;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt;
import io.reactivex.BackpressureStrategy;
import yu2.c;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationNameModel$micSeatIds$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;

public final class MicSeatDecorationNameModel extends a	// class@00166c
{
    public final LiveData a;

    public void MicSeatDecorationNameModel(f p0,t p1){
       a.p(p0, "micSeatStateService");
       a.p(p1, "decorationInfoObservable");
       super();
       this.a = LiveDataOperators.b(IMicSeatStateServiceKt.b(p0), c.a(p1, null, 1, null), MicSeatDecorationNameModel$micSeatIds$1.INSTANCE);
    }
}
