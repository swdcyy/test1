package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameModel;
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
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatDecorationVipFrameModel$micSeatIds$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;

public final class MicSeatDecorationVipFrameModel extends a	// class@001676
{
    public final LiveData a;

    public void MicSeatDecorationVipFrameModel(f p0,t p1,boolean p2){
       a.p(p0, "micSeatStateService");
       a.p(p1, "decorationInfoObservable");
       super();
       this.a = LiveDataOperators.b(IMicSeatStateServiceKt.b(p0), c.a(p1, null, 1, null), new MicSeatDecorationVipFrameModel$micSeatIds$1(this, p2));
    }
}
