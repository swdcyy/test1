package com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController$bindViewModel$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import hw1.h;
import com.kuaishou.live.common.core.component.pk.ScoreTextAnimatorType;
import kotlin.jvm.internal.a;
import android.animation.ObjectAnimator;
import android.widget.TextView;
import ot1.f;
import java.lang.Runnable;
import android.widget.FrameLayout;

public final class LiveMultiPkProgressBarDefaultController$bindViewModel$1 extends Lambda implements p	// class@00163d
{
    public final LiveMultiPkProgressBarDefaultController this$0;

    public void LiveMultiPkProgressBarDefaultController$bindViewModel$1(LiveMultiPkProgressBarDefaultController p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0.longValue(), p1.longValue());
       return l1.a;
    }
    public final void invoke(long p0,long p1){
       LiveMultiPkProgressBarDefaultController$bindViewModel$1 tthis$01;
       h a;
       LiveMultiPkProgressBarDefaultController liveMultiPkP = LiveMultiPkProgressBarDefaultController.class;
       String str = "1";
       if (PatchProxy.isSupport(LiveMultiPkProgressBarDefaultController$bindViewModel$1.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, LiveMultiPkProgressBarDefaultController$bindViewModel$1.class, str)) {
          return;
       }
       LiveMultiPkProgressBarDefaultController$bindViewModel$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       h oh = h.class;
       if (!PatchProxy.isSupport(liveMultiPkP) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), tthis$0, liveMultiPkP, "11")) {
          ScoreTextAnimatorType scoreTextAni = tthis$0.X2(tthis$0.s, p0);
          ScoreTextAnimatorType nONE = ScoreTextAnimatorType.NONE;
          tthis$01 = null;
          String str1 = "livePkScoreTextAnimatorHelper";
          if (scoreTextAni != nONE) {
             LiveMultiPkProgressBarDefaultController q = tthis$0.q;
             if (q == null) {
                a.S(str1);
             }
             LiveMultiPkProgressBarDefaultController m = tthis$0.m;
             if (m == null) {
                a.S("leftScoreTextView");
             }
             Objects.requireNonNull(q);
             if (!PatchProxy.applyVoidTwoRefs(m, scoreTextAni, q, oh, str)) {
                if (!PatchProxy.applyVoid(tthis$01, q, oh, "5")) {
                   a = q.a;
                   if (a != null && a.isRunning()) {
                      q.a.cancel();
                      q.a = tthis$01;
                   }
                }
                ObjectAnimator objectAnimat1 = q.a(m, scoreTextAni);
                q.a = objectAnimat1;
                objectAnimat1.start();
             }
          }
          ScoreTextAnimatorType scoreTextAni1 = tthis$0.X2(tthis$0.t, p1);
          if (scoreTextAni1 != nONE) {
             LiveMultiPkProgressBarDefaultController q1 = tthis$0.q;
             if (q1 == null) {
                a.S(str1);
             }
             LiveMultiPkProgressBarDefaultController n = tthis$0.n;
             if (n == null) {
                a.S("rightScoreTextView");
             }
             Objects.requireNonNull(q1);
             if (!PatchProxy.applyVoidTwoRefs(n, scoreTextAni1, q1, oh, "2")) {
                if (!PatchProxy.applyVoid(tthis$01, q1, oh, "6")) {
                   oh = q1.b;
                   if (oh != null && oh.isRunning()) {
                      q1.b.cancel();
                      q1.b = tthis$01;
                   }
                }
                ObjectAnimator objectAnimat = q1.a(n, scoreTextAni1);
                q1.b = objectAnimat;
                objectAnimat.start();
             }
          }
       }
    label_00cd :
       tthis$01 = this.this$0;
       Objects.requireNonNull(tthis$01);
       if (!PatchProxy.isSupport(liveMultiPkP) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), tthis$01, liveMultiPkP, "12")) {
          liveMultiPkP = null;
          if (p0 - liveMultiPkP >= 0 && p1 - liveMultiPkP >= 0) {
             liveMultiPkP = tthis$01.k;
             if (liveMultiPkP == null) {
                a.S("progressBar");
             }
             f uof = new f(tthis$01, p0, p1);
             liveMultiPkP.post(tthis$0);
          }
       }
       return;
    }
}
