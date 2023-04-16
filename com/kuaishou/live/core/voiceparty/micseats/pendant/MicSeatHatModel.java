package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatHatModel;
import yh3.a;
import ts2.f;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatHatModel$a;
import erd.o;
import io.reactivex.BackpressureStrategy;
import androidx.lifecycle.LiveData;
import yu2.c;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatHatModel$micSeatIds$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;

public final class MicSeatHatModel extends a	// class@0016a1
{
    public final LiveData a;
    public final LiveData b;

    public void MicSeatHatModel(f p0,t p1){
       a.p(p0, "micSeatStateService");
       a.p(p1, "usersHatInfoObservable");
       super();
       p1 = p1.map(MicSeatHatModel$a.b);
       a.o(p1, "usersHatInfoObservable.m¡­ userId\n    }.toSet\(\)\n  }");
       LiveData liveData = c.a(p1, null, 1, null);
       this.a = liveData;
       this.b = LiveDataOperators.b(IMicSeatStateServiceKt.b(p0), liveData, MicSeatHatModel$micSeatIds$1.INSTANCE);
    }
}
