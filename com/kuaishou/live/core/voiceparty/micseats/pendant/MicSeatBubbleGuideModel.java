package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideModel;
import yh3.a;
import ts2.f;
import bt2.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashSet;
import brd.t;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideModel$a;
import erd.o;
import io.reactivex.BackpressureStrategy;
import androidx.lifecycle.LiveData;
import yu2.c;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBubbleGuideModel$micSeatIds$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;

public final class MicSeatBubbleGuideModel extends a	// class@001662
{
    public final Set a;
    public final LiveData b;
    public final LiveData c;

    public void MicSeatBubbleGuideModel(f p0,e p1){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatsGuideManager");
       super();
       this.a = new LinkedHashSet();
       t ot = p1.g().map(new MicSeatBubbleGuideModel$a(this));
       a.o(ot, "micSeatsGuideManager.mic¡­\n    }\n    guideUsers\n  }");
       LiveData liveData = c.a(ot, null, 1, null);
       this.b = liveData;
       this.c = LiveDataOperators.b(IMicSeatStateServiceKt.b(p0), liveData, MicSeatBubbleGuideModel$micSeatIds$1.INSTANCE);
    }
}
