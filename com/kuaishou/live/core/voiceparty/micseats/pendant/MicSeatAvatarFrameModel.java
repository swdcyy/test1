package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAvatarFrameModel;
import yh3.a;
import ts2.f;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAvatarFrameModel$a;
import erd.o;
import io.reactivex.BackpressureStrategy;
import androidx.lifecycle.LiveData;
import yu2.c;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAvatarFrameModel$micSeatIds$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;

public final class MicSeatAvatarFrameModel extends a	// class@00164f
{
    public final LiveData a;
    public final LiveData b;

    public void MicSeatAvatarFrameModel(f p0,t p1,boolean p2){
       a.p(p0, "micSeatStateService");
       a.p(p1, "avatarFrameInfoListObservable");
       super();
       p1 = p1.map(new MicSeatAvatarFrameModel$a(p2));
       a.o(p1, "avatarFrameInfoListObser¡­ userId\n    }.toSet\(\)\n  }");
       LiveData liveData = c.a(p1, null, 1, null);
       this.a = liveData;
       this.b = LiveDataOperators.b(IMicSeatStateServiceKt.b(p0), liveData, MicSeatAvatarFrameModel$micSeatIds$1.INSTANCE);
    }
}
