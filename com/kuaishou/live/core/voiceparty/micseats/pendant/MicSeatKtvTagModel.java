package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKtvTagModel;
import yh3.a;
import ts2.f;
import brd.t;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt;
import io.reactivex.BackpressureStrategy;
import yu2.c;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKtvTagModel$micSeatIds$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;

public final class MicSeatKtvTagModel extends a	// class@0016b3
{
    public final LiveData a;

    public void MicSeatKtvTagModel(f p0,t p1,String p2){
       a.p(p0, "micSeatStateService");
       a.p(p1, "singerCandidates");
       a.p(p2, "anchorId");
       super();
       this.a = LiveDataOperators.b(IMicSeatStateServiceKt.b(p0), c.a(p1, null, 1, null), new MicSeatKtvTagModel$micSeatIds$1(p2));
    }
}
