package com.kuaishou.live.core.voiceparty.playway.pk.PkMicSeatViewControllerKt;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.core.data.MicSeatTeam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.playway.pk.PkMicSeatViewControllerKt$filterTeam$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;

public final class PkMicSeatViewControllerKt	// class@001869
{

    public static final LiveData a(LiveData p0,LiveData p1,MicSeatTeam p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, PkMicSeatViewControllerKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveDataOperators.b(p0, p1, new PkMicSeatViewControllerKt$filterTeam$1(p2));
    }
}
