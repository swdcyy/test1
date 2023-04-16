package com.kuaishou.live.core.voiceparty.micseats.pendant.UserMutedPendantViewModel;
import jt2.c;
import ts2.f;
import brd.t;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.BackpressureStrategy;
import yu2.c;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserMutedPendantViewModel$showMuted$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;

public final class UserMutedPendantViewModel extends c	// class@00174e
{
    public final LiveData g;

    public void UserMutedPendantViewModel(f p0,t p1,LiveData p2){
       a.p(p0, "micSeatStateService");
       a.p(p1, "userMutedInfoObservable");
       a.p(p2, "micSeatId");
       super(p0, p2);
       this.g = LiveDataOperators.b(c.a(p1, null, 1, null), this.v0(), UserMutedPendantViewModel$showMuted$1.INSTANCE);
    }
    public final LiveData x0(){
       return this.g;
    }
}
