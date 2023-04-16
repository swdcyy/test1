package com.kuaishou.live.core.voiceparty.micseats.pendant.KtvTagPendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import brd.t;
import java.lang.String;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KtvTagPendantViewModel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KtvTagPendantViewController$viewModel$2 extends Lambda implements a	// class@001618
{
    public final String $anchorId;
    public final LiveData $micSeatId;
    public final f $micSeatStateService;
    public final t $singerCandidates;

    public void KtvTagPendantViewController$viewModel$2(f p0,t p1,String p2,LiveData p3){
       this.$micSeatStateService = p0;
       this.$singerCandidates = p1;
       this.$anchorId = p2;
       this.$micSeatId = p3;
       super(0);
    }
    public final KtvTagPendantViewModel invoke(){
       Object obj = PatchProxy.apply(null, this, KtvTagPendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KtvTagPendantViewModel(this.$micSeatStateService, this.$singerCandidates, this.$anchorId, this.$micSeatId);
    }
    public Object invoke(){
       return this.invoke();
    }
}
