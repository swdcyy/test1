package com.kuaishou.live.core.voiceparty.micseats.pendant.BackgroundPendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import java.lang.String;
import androidx.lifecycle.LiveData;
import it2.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BackgroundPendantViewController$viewModel$2 extends Lambda implements a	// class@0015da
{
    public final String $anchorId;
    public final LiveData $micSeatId;
    public final f $micSeatStateService;

    public void BackgroundPendantViewController$viewModel$2(f p0,String p1,LiveData p2){
       this.$micSeatStateService = p0;
       this.$anchorId = p1;
       this.$micSeatId = p2;
       super(0);
    }
    public final k invoke(){
       Object obj = PatchProxy.apply(null, this, BackgroundPendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k(this.$micSeatStateService, this.$anchorId, this.$micSeatId);
    }
    public Object invoke(){
       return this.invoke();
    }
}
