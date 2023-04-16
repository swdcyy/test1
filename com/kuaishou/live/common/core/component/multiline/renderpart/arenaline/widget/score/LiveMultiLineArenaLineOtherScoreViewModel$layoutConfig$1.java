package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.score.LiveMultiLineArenaLineOtherScoreViewModel$layoutConfig$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.widget.score.LiveMultiLineArenaLineOtherScoreViewModel;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaTagLayoutConfig$a;
import gr1.c;
import java.lang.Enum;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaTagLayoutConfig;
import qrd.p;
import java.lang.Number;

public final class LiveMultiLineArenaLineOtherScoreViewModel$layoutConfig$1 extends Lambda implements p	// class@001540
{
    public final LiveMultiLineArenaLineOtherScoreViewModel this$0;

    public void LiveMultiLineArenaLineOtherScoreViewModel$layoutConfig$1(LiveMultiLineArenaLineOtherScoreViewModel p0){
       this.this$0 = p0;
       super(2);
    }
    public final LiveMultiLineIconTextView$a invoke(int p0,LiveMultiLineArenaLiveState p1){
       LiveMultiLineArenaLineOtherScoreViewModel$layoutConfig$1 obj;
       LiveMultiLineIconTextView$a uoa;
       LiveMultiLineArenaTagLayoutConfig$a h;
       LiveMultiLineIconTextView$a uoa1;
       if (PatchProxy.isSupport(LiveMultiLineArenaLineOtherScoreViewModel$layoutConfig$1.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, LiveMultiLineArenaLineOtherScoreViewModel$layoutConfig$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "state");
       obj = this.this$0;
       Objects.requireNonNull(obj);
       LiveMultiLineArenaLineOtherScoreViewModel liveMultiLin = LiveMultiLineArenaLineOtherScoreViewModel.class;
       if (PatchProxy.isSupport(liveMultiLin)) {
          uoa = PatchProxy.applyTwoRefs(p1, Integer.valueOf(p0), obj, liveMultiLin, "4");
          if (uoa != PatchProxyResult.class) {
          }else {
          label_003e :
             int i = c.a[p1.ordinal()];
             uoa = null;
             if (i != 1) {
                if (i == 2) {
                   if (p0 != 1) {
                      h = LiveMultiLineArenaTagLayoutConfig.h;
                      Objects.requireNonNull(h);
                      uoa1 = PatchProxy.apply(uoa, h, LiveMultiLineArenaTagLayoutConfig$a.class, "5");
                      if (uoa1 == PatchProxyResult.class) {
                         uoa1 = LiveMultiLineArenaTagLayoutConfig.e.getValue();
                      }
                   }else {
                      uoa1 = LiveMultiLineArenaTagLayoutConfig.h.b();
                   }
                }
             }else if(p0 != 1){
                h = LiveMultiLineArenaTagLayoutConfig.h;
                Objects.requireNonNull(h);
                uoa1 = PatchProxy.apply(uoa, h, LiveMultiLineArenaTagLayoutConfig$a.class, "7");
                if (uoa1 == PatchProxyResult.class) {
                   uoa1 = LiveMultiLineArenaTagLayoutConfig.g.getValue();
                }
             }else {
                uoa1 = LiveMultiLineArenaTagLayoutConfig.h.c();
             }
             uoa = uoa1;
          }
       }else {
          goto label_003e ;
       }
       return uoa;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0.intValue(), p1);
    }
}
