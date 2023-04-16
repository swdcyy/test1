package com.kuaishou.live.core.voiceparty.micseats.pendant.LevelUpAnimationPendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import hf3.a;
import androidx.lifecycle.LiveData;
import it2.k0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LevelUpAnimationPendantViewController$viewModel$2 extends Lambda implements a	// class@001621
{
    public final a $liveLongConnection;
    public final LiveData $micSeatId;
    public final f $micSeatStateService;

    public void LevelUpAnimationPendantViewController$viewModel$2(f p0,a p1,LiveData p2){
       this.$micSeatStateService = p0;
       this.$liveLongConnection = p1;
       this.$micSeatId = p2;
       super(0);
    }
    public final k0 invoke(){
       Object obj = PatchProxy.apply(null, this, LevelUpAnimationPendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k0(this.$micSeatStateService, this.$liveLongConnection, this.$micSeatId);
    }
    public Object invoke(){
       return this.invoke();
    }
}
