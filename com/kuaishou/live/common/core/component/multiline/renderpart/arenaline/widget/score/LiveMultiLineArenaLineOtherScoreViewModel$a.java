package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.score.LiveMultiLineArenaLineOtherScoreViewModel$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.score.LiveMultiLineArenaLineOtherScoreViewModel;
import java.lang.Object;
import dr1.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import java.util.Map;
import dr1.e;
import lnc.a1;
import kotlin.jvm.internal.a;
import dr1.a;
import dr1.a$a;
import er1.a;

public final class LiveMultiLineArenaLineOtherScoreViewModel$a implements Observer	// class@00153e
{
    public final LiveMultiLineArenaLineOtherScoreViewModel b;

    public void LiveMultiLineArenaLineOtherScoreViewModel$a(LiveMultiLineArenaLineOtherScoreViewModel p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineArenaLineOtherScoreViewModel$a.class, "1")) {
       }else {
          LiveMultiLineArenaLineOtherScoreViewModel$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveMultiLineArenaLineOtherScoreViewModel.class, "3")) {
             LiveMultiLineArenaLiveState liveMultiLin = (p0 != null)? p0.d(): null;
             if (liveMultiLin == LiveMultiLineArenaLiveState.SHOWING) {
                p0 = p0.c().get(tb.i);
                if (p0 != null) {
                   if (p0.d() != 1) {
                      p0 = a1.p(R.string.arg_RES_7f101df4);
                      a.o(p0, "CommonUtil.string\(R.stri¡­ena_line_perform_waiting\)");
                      tb.u0(0, null, p0, a.f.a());
                   }else {
                      tb.u0(0, null, p0.a(), a.f.a());
                   }
                }
             }
          }
       }
       return;
    }
}
