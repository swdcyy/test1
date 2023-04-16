package com.kuaishou.live.core.voiceparty.micseats.pendant.BubbleGuidePendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import bt2.e;
import androidx.lifecycle.LiveData;
import it2.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BubbleGuidePendantViewController$viewModel$2 extends Lambda implements a	// class@0015e2
{
    public final boolean $isAnchor;
    public final LiveData $micSeatId;
    public final f $micSeatStateService;
    public final e $micSeatsGuideManager;

    public void BubbleGuidePendantViewController$viewModel$2(f p0,e p1,boolean p2,LiveData p3){
       this.$micSeatStateService = p0;
       this.$micSeatsGuideManager = p1;
       this.$isAnchor = p2;
       this.$micSeatId = p3;
       super(0);
    }
    public final o invoke(){
       Object obj = PatchProxy.apply(null, this, BubbleGuidePendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new o(this.$micSeatStateService, this.$micSeatsGuideManager, this.$isAnchor, this.$micSeatId);
    }
    public Object invoke(){
       return this.invoke();
    }
}
