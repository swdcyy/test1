package com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameViewModel$gameObserver$1$onGamePunish$$inlined$let$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameViewModel$gameObserver$1;
import bt1.a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multipk.game.vc.LiveMultiPkGameViewModel;
import java.util.Objects;
import kotlin.Pair;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Number;
import pu1.d;

public final class LiveMultiPkGameViewModel$gameObserver$1$onGamePunish$$inlined$let$lambda$1 extends Lambda implements a	// class@0015e9
{
    public final a $gameInfo$inlined;
    public final LiveMultiPkGameViewModel$gameObserver$1 this$0;

    public void LiveMultiPkGameViewModel$gameObserver$1$onGamePunish$$inlined$let$lambda$1(LiveMultiPkGameViewModel$gameObserver$1 p0,a p1){
       this.this$0 = p0;
       this.$gameInfo$inlined = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoidWithListener(null, this, LiveMultiPkGameViewModel$gameObserver$1$onGamePunish$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       if (this.this$0.b.z0(this.$gameInfo$inlined)) {
          LiveMultiPkGameViewModel$gameObserver$1 b = this.this$0.b;
          LiveMultiPkGameViewModel$gameObserver$1$onGamePunish$$inlined$let$lambda$1 t$gameInfo$i = this.$gameInfo$inlined;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidOneRefs(t$gameInfo$i, b, LiveMultiPkGameViewModel.class, "4")) {
             Pair pair = b.w0(t$gameInfo$i);
             b.c0(LiveCommonLogTag.MULTI_PK, "LiveMultiPkGameViewModel showTeamPkResultAnim", "result", pair);
             int i = b.y0(t$gameInfo$i.d()) ^ 0x01;
             b.r0(b.b).setValue(b.x0(pair.getFirst().intValue(), i));
             b.r0(b.c).setValue(b.x0(pair.getSecond().intValue(), i));
          }
       }
       PatchProxy.onMethodExit(LiveMultiPkGameViewModel$gameObserver$1$onGamePunish$$inlined$let$lambda$1.class, "1");
       return;
    }
}
