package com.kuaishou.live.core.voiceparty.micseats.pendant.UserFollowPendantViewModel;
import jt2.c;
import ts2.f;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import it2.u;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserFollowPendantViewModel$userFollowState$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserFollowPendantViewModel$a;
import z0.a;
import androidx.lifecycle.Transformations;
import zh3.c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import yh3.a;

public final class UserFollowPendantViewModel extends c	// class@00174c
{
    public Boolean g;
    public final LiveData h;
    public final LiveEvent i;

    public void UserFollowPendantViewModel(f p0,LiveData p1){
       a.p(p0, "micSeatStateService");
       a.p(p1, "micSeatId");
       super(p0, p1);
       LiveData liveData = Transformations.map(LiveDataOperators.b(this.w0(), new u(), UserFollowPendantViewModel$userFollowState$1.INSTANCE), new UserFollowPendantViewModel$a(this));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.h = liveData;
       c uoc = new c();
       this.p0(uoc);
       this.i = uoc;
    }
}
