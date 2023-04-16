package com.kuaishou.live.core.voiceparty.micseats.pendant.StateNamePendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.StateNamePendantViewController;
import ts2.f;
import androidx.lifecycle.LiveData;
import it2.e1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;

public final class StateNamePendantViewController$viewModel$2 extends Lambda implements a	// class@001744
{
    public final boolean $isAnchor;
    public final LiveData $micSeatId;
    public final f $micSeatStateService;
    public final StateNamePendantViewController this$0;

    public void StateNamePendantViewController$viewModel$2(StateNamePendantViewController p0,f p1,boolean p2,LiveData p3){
       this.this$0 = p0;
       this.$micSeatStateService = p1;
       this.$isAnchor = p2;
       this.$micSeatId = p3;
       super(0);
    }
    public final e1 invoke(){
       Object obj = PatchProxy.apply(null, this, StateNamePendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e1(this.$micSeatStateService, this.$isAnchor, this.this$0.k, this.$micSeatId);
    }
    public Object invoke(){
       return this.invoke();
    }
}
