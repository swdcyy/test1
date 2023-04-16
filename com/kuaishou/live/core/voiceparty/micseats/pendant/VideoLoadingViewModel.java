package com.kuaishou.live.core.voiceparty.micseats.pendant.VideoLoadingViewModel;
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
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoLoadingViewModel$micSeatIds$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;

public final class VideoLoadingViewModel extends a	// class@00175e
{
    public final LiveData a;

    public void VideoLoadingViewModel(f p0,t p1,Set p2){
       a.p(p0, "micSeatStateService");
       a.p(p1, "windowRenderStatus");
       a.p(p2, "needLoadingIds");
       super();
       this.a = LiveDataOperators.b(IMicSeatStateServiceKt.b(p0), c.a(p1, null, 1, null), new VideoLoadingViewModel$micSeatIds$1(p2));
    }
}
