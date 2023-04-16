package com.kuaishou.live.core.voiceparty.micseats.pendant.a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.micseats.pendant.BubbleGuidePendantViewController;
import it2.o;
import java.lang.Object;
import it2.q0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.guide.MicSeatGuideState;
import it2.p0;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.core.voiceparty.micseats.pendant.BubbleGuidePendantViewController$binding$3$1;
import com.kuaishou.live.core.voiceparty.micseats.pendant.BubbleGuidePendantViewController$binding$3$2;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.TextView;
import com.kuaishou.live.core.voiceparty.unionlive.guide.VoicePartyUnionGuideBreathTextView;
import nx2.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import android.view.View;
import com.kwai.library.widget.popup.bubble.a$c;
import lnc.a1;
import com.kwai.library.widget.popup.common.c$b;
import java.util.concurrent.TimeUnit;
import it2.o0;
import msd.a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;
import it2.c0$b;
import it2.c0;

public final class a implements Observer	// class@001771
{
    public final BubbleGuidePendantViewController b;
    public final o c;

    public void a(BubbleGuidePendantViewController p0,o p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else if(p0 == null || p0.c() == MicSeatGuideState.IDLE){
          BubbleGuidePendantViewController.V2(this.b).a();
          this.c.y0(c0$b.a);
       }else if(p0.c() == MicSeatGuideState.READY){
          p0 op0 = BubbleGuidePendantViewController.V2(this.b);
          Activity uActivity = this.b.B2();
          BubbleGuidePendantViewController$binding$3$1 uobinding$3$ = new BubbleGuidePendantViewController$binding$3$1(this);
          BubbleGuidePendantViewController$binding$3$2 uobinding$3$1 = new BubbleGuidePendantViewController$binding$3$2(this);
          Objects.requireNonNull(op0);
          if (!PatchProxy.applyVoidFourRefs(p0, uActivity, uobinding$3$, uobinding$3$1, op0, p0.class, "1")) {
             a.p(p0, "guideInfo");
             a.p(uActivity, "activity");
             a.p(uobinding$3$, "onShow");
             a.p(uobinding$3$1, "onDismiss");
             int i = 0;
             if (!PatchProxy.applyVoidOneRefs(p0, op0, p0.class, "3")) {
                if (!TextUtils.isEmpty(p0.a())) {
                   op0.b.setVisibility(i);
                   op0.b.setText(p0.a());
                }else {
                   op0.b.setVisibility(8);
                }
                if (p0.d != null) {
                   p0 b = op0.b;
                   Objects.requireNonNull(b);
                   if (!PatchProxy.applyVoid(null, b, VoicePartyUnionGuideBreathTextView.class, "1")) {
                      b.postOnAnimation(new a(b));
                   }
                }else {
                   op0.b.s();
                }
             }
             if (!PatchProxy.applyVoidFourRefs(p0, uActivity, uobinding$3$, uobinding$3$1, op0, p0.class, "4")) {
                String str = p0.b();
                if (str == null || !str.length()) {
                   i = 1;
                }
                if (!i && op0.a == null) {
                   a uoa = new a(uActivity);
                   uoa.K0(KwaiBubbleOption.e);
                   uoa.o0(op0.c);
                   uoa.u0(3);
                   uoa.F0(p0.b());
                   uoa.I(a1.d(R.dimen.arg_RES_7f07029f));
                   uoa.T(TimeUnit.MILLISECONDS.toMillis(p0.g));
                   uoa.P(true);
                   uoa.V(p0.c);
                   uoa.M(new o0(op0, uobinding$3$, uobinding$3$1));
                   a.o(uoa, "KwaiBubbleBuilder\(activi¡­miss\(\)\n        }\n      }\)");
                   op0.a = p.o(uoa);
                }
             }
          }
       }
       return;
    }
}
