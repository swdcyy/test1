package com.kuaishou.live.core.voiceparty.micseats.pendant.KtvTagPendantViewModel;
import jt2.c;
import ts2.f;
import brd.t;
import java.lang.String;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import kotlin.jvm.internal.a;
import io.reactivex.BackpressureStrategy;
import yu2.c;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KtvTagPendantViewModel$userIdentity$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KtvTagPendantViewModel$a;
import z0.a;
import androidx.lifecycle.Transformations;

public final class KtvTagPendantViewModel extends c	// class@00161e
{
    public final LiveData g;
    public final LiveData h;
    public final LiveData i;

    public void KtvTagPendantViewModel(f p0,t p1,String p2,LiveData p3){
       a.p(p0, "micSeatStateService");
       a.p(p1, "singerCandidates");
       a.p(p2, "anchorId");
       a.p(p3, "micSeatId");
       super(p0, p3);
       LiveData liveData = c.a(p1, null, 1, null);
       this.g = liveData;
       this.h = LiveDataOperators.b(this.w0(), liveData, new KtvTagPendantViewModel$userIdentity$1(p2));
       liveData = Transformations.map(this.w0(), new KtvTagPendantViewModel$a());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.i = liveData;
    }
}
