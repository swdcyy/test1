package com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarFramePendantViewModel;
import jt2.c;
import ts2.f;
import brd.t;
import msd.a;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.BackpressureStrategy;
import yu2.c;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarFramePendantViewModel$frameInfo$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;

public final class AvatarFramePendantViewModel extends c	// class@0015ca
{
    public final LiveData g;
    public final a h;
    public final boolean i;

    public void AvatarFramePendantViewModel(f p0,t p1,a p2,boolean p3,LiveData p4){
       a.p(p0, "micSeatStateService");
       a.p(p1, "avatarFrameInfoListObservable");
       a.p(p2, "isNormalRoom");
       a.p(p4, "micSeatId");
       super(p0, p4);
       this.h = p2;
       this.i = p3;
       this.g = LiveDataOperators.b(c.a(p1, null, 1, null), this.w0(), new AvatarFramePendantViewModel$frameInfo$1(this));
    }
}
