package com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNamePendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import brd.t;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.DecorationNameViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DecorationNamePendantViewController$viewModel$2 extends Lambda implements a	// class@0015e9
{
    public final t $decorationInfoObservable;
    public final LiveData $micSeatId;

    public void DecorationNamePendantViewController$viewModel$2(t p0,LiveData p1){
       this.$decorationInfoObservable = p0;
       this.$micSeatId = p1;
       super(0);
    }
    public final DecorationNameViewModel invoke(){
       Object obj = PatchProxy.apply(null, this, DecorationNamePendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DecorationNameViewModel(this.$decorationInfoObservable, this.$micSeatId);
    }
    public Object invoke(){
       return this.invoke();
    }
}
