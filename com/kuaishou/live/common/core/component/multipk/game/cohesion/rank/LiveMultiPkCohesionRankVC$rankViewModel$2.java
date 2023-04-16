package com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC$rankViewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC$rankViewModel$2$1;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC$rankViewModel$2$a;

public final class LiveMultiPkCohesionRankVC$rankViewModel$2 extends Lambda implements a	// class@0015da
{
    public final LiveMultiPkCohesionRankVC this$0;

    public void LiveMultiPkCohesionRankVC$rankViewModel$2(LiveMultiPkCohesionRankVC p0){
       this.this$0 = p0;
       super(0);
    }
    public final ViewModelProvider$Factory invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMultiPkCohesionRankVC$rankViewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMultiPkCohesionRankVC$rankViewModel$2$a(new LiveMultiPkCohesionRankVC$rankViewModel$2$1(this));
    }
    public Object invoke(){
       return this.invoke();
    }
}
