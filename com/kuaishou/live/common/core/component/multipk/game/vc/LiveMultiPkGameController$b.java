package com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController$b;
import zs1.d;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameController;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multipk.core.statemachine.MultiPkState;
import zs1.c;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkStatistic;
import com.kuaishou.live.common.core.component.multipk.core.LiveMultiPkStatisticUpdateType;
import java.util.List;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkEnd;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkDebugLogKt;
import com.kuaishou.android.live.log.b;
import ft1.b;
import jt1.a;
import com.kuaishou.live.lite.pk.MultiPkGameState;
import hu1.c;
import androidx.lifecycle.MutableLiveData;
import zs1.b;
import eu1.b;
import pu1.i;

public final class LiveMultiPkGameController$b implements d	// class@0015e2
{
    public final LiveMultiPkGameController a;

    public void LiveMultiPkGameController$b(LiveMultiPkGameController p0){
       this.a = p0;
       super();
    }
    public void a(MultiPkState p0,MultiPkState p1,Object p2){
       c.a(this, p0, p1, p2);
    }
    public void b(MultiPkState p0,MultiPkState p1,Object p2){
       c.f(this, p0, p1, p2);
    }
    public void c(SCLiveMultiPkStatistic p0,LiveMultiPkStatisticUpdateType p1){
       c.d(this, p0, p1);
    }
    public void e(List p0){
       c.c(this, p0);
    }
    public void f(LiveMultiPkEnd p0,int p1){
       c.e(this, p0, p1);
    }
    public void h(LayoutConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkGameController$b.class, "1")) {
          return;
       }
       a.p(p0, "layoutConfig");
       b.P(LiveMultiPkDebugLogKt.c(), "onLayoutConfigChange");
       if (this.a.W2().m() == MultiPkGameState.VOTE) {
          this.a.a3().b().setValue(i.b(this.a.Y2()));
       }else if(this.a.W2().m() == MultiPkGameState.PUNISH){
          this.a.a3().b().setValue(i.a(this.a.Y2()));
       }
       return;
    }
}
