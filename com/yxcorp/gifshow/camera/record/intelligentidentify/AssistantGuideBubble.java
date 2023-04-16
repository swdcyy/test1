package com.yxcorp.gifshow.camera.record.intelligentidentify.AssistantGuideBubble;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.camera.record.intelligentidentify.AssistantGuideBubble$b;
import nsd.u;
import com.yxcorp.gifshow.camera.record.intelligentidentify.AssistantGuideBubble$Companion$DEFAULT_SHOW_PREDICATE$1;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import com.yxcorp.gifshow.camera.record.intelligentidentify.AssistantGuideBubble$Companion$DEFAULT_SHOW_INC_COUNT$1;
import android.app.Activity;
import com.yxcorp.gifshow.camera.record.intelligentidentify.AssistantGuideBubble$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import qd9.a;
import android.view.View;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.utility.n;
import android.view.ViewParent;
import android.view.ViewGroup;
import com.kwai.library.widget.popup.common.c;
import ra9.a;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import brd.t;
import androidx.fragment.app.FragmentActivity;
import com.kwai.robust.PatchProxyResult;
import msd.a;
import msd.l;
import qd9.c;
import fw8.r;
import fw8.r$a;
import android.content.Context;
import i2b.a;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import qd9.b;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Integer;
import qrd.l1;

public final class AssistantGuideBubble implements a	// class@000dff
{
    public KwaiLottieAnimationView b;
    public View c;
    public final Activity d;
    public final AssistantGuideBubble$a e;
    public static final i f;
    public static final i g;
    public static final AssistantGuideBubble$b h;

    static {
       AssistantGuideBubble.h = new AssistantGuideBubble$b(null);
       AssistantUtils d = AssistantUtils.d;
       AssistantGuideBubble.f = new AssistantGuideBubble$Companion$DEFAULT_SHOW_PREDICATE$1(d);
       AssistantGuideBubble.g = new AssistantGuideBubble$Companion$DEFAULT_SHOW_INC_COUNT$1(d);
    }
    public void AssistantGuideBubble(Activity p0,AssistantGuideBubble$a p1){
       a.p(p1, "bubbleCallback");
       super();
       this.d = p0;
       this.e = p1;
    }
    public static void a(AssistantGuideBubble p0,PostBubbleManager$c p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       Objects.requireNonNull(p0);
       AssistantGuideBubble uAssistantGu = AssistantGuideBubble.class;
       if (!PatchProxy.isSupport(uAssistantGu) || !PatchProxy.applyVoidTwoRefs(p1, Boolean.valueOf(p2), p0, uAssistantGu, "2")) {
          uAssistantGu = p0.c;
          if (uAssistantGu != null) {
             if (p2) {
                n.X(uAssistantGu, 4, 250, new a(p0, p1));
             }else {
                uAssistantGu.setVisibility(4);
                AssistantGuideBubble c = p0.c;
                if (c != null) {
                   ViewParent parent = c.getParent();
                   if (parent != null) {
                      parent.removeView(p0.c);
                      if (p1 != null) {
                         p1.a(p0, null, 4);
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public boolean c(){
       return a.e(this);
    }
    public c d(){
       return RecordBubbleItem.ASSISTANT_GUIDE;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, AssistantGuideBubble.class, "4")) {
          return;
       }
       AssistantGuideBubble.a(this, null, false, 2, null);
       return;
    }
    public t e(){
       return a.a(this);
    }
    public boolean f(){
       return a.d(this);
    }
    public boolean g(String p0){
       return a.c(this, p0);
    }
    public boolean i(FragmentActivity p0,PostBubbleManager$c p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ViewGroup$MarginLayoutParams obj = PatchProxy.applyTwoRefs(p0, p1, this, AssistantGuideBubble.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "activity");
       a.p(p1, "listener");
       i f = AssistantGuideBubble.f;
       i oi = AssistantGuideBubble.g;
       obj = PatchProxy.applyThreeRefs(p1, f, oi, this, AssistantGuideBubble.class, "1");
       boolean b = true;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          a.p(f, "predicate");
          a.p(oi, "incCount");
          if (this.d == null || (this.b != null || (f.invoke().booleanValue() || this.e.a()))) {
             b = false;
          }else {
             c uoc = new c(this, p1);
             r.c().a(uoc);
             ViewGroup viewGroup = null;
             this.c = a.c(this.d, 0x7f0d0164, viewGroup);
             View view = this.d.findViewById(0x1020002);
             a.o(view, "activity.findViewById<Vi¡­up>\(android.R.id.content\)");
             obj = new ViewGroup$MarginLayoutParams(-1, -1);
             obj.topMargin = a1.d(0x7f0702dd);
             view.addView(this.c, obj);
             AssistantGuideBubble tc = this.c;
             if (tc != null) {
                KwaiLottieAnimationView kwaiLottieAn = tc.findViewById(R.id.camera_assistant_guide_lottie_view);
                if (kwaiLottieAn != null) {
                   kwaiLottieAn.setRepeatMode(b);
                   kwaiLottieAn.s();
                   k1.r(new b(this, p1, uoc, oi), 3000);
                   oi.invoke(Integer.valueOf(b));
                   viewGroup = kwaiLottieAn;
                }
             }
             this.b = viewGroup;
          }
       }
       return b;
    }
}
