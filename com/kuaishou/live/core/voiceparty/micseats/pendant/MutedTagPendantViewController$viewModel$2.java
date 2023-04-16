package com.kuaishou.live.core.voiceparty.micseats.pendant.MutedTagPendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import jt2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MutedTagPendantViewController$viewModel$2 extends Lambda implements a	// class@001725
{
    public final LiveData $micSeatId;
    public final f $micSeatStateService;

    public void MutedTagPendantViewController$viewModel$2(f p0,LiveData p1){
       this.$micSeatStateService = p0;
       this.$micSeatId = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       Object obj = PatchProxy.apply(null, this, MutedTagPendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this.$micSeatStateService, this.$micSeatId);
    }
}
