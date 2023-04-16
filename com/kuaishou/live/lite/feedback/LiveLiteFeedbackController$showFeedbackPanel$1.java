package com.kuaishou.live.lite.feedback.LiveLiteFeedbackController$showFeedbackPanel$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackController;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import e93.c;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.lifecycle.LiveData;
import kd3.i;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService$EnableLeftSwipeBizType;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;

public final class LiveLiteFeedbackController$showFeedbackPanel$1 extends Lambda implements l	// class@0008f8
{
    public final LiveLiteFeedbackController this$0;

    public void LiveLiteFeedbackController$showFeedbackPanel$1(LiveLiteFeedbackController p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(LiveLiteFeedbackController$showFeedbackPanel$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveLiteFeedbackController$showFeedbackPanel$1.class, "1")) {
          return;
       }
       LiveLiteFeedbackController$showFeedbackPanel$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       LiveLiteFeedbackController liveLiteFeed = LiveLiteFeedbackController.class;
       if (!PatchProxy.isSupport(liveLiteFeed) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), tthis$0, liveLiteFeed, "9")) {
          tthis$0.k = p0;
          Fragment parentFragme = tthis$0.p.a().getParentFragment();
          parentFragme = (parentFragme != null)? parentFragme.getParentFragment(): null;
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(parentFragme);
          if (slidePlayVie != null) {
             slidePlayVie.d(p0, 4);
          }
          if (a.g(tthis$0.w.a().getValue(), Boolean.TRUE)) {
             tthis$0.t.w9(p0, LiveLiteRecommendSideBarService$EnableLeftSwipeBizType.FEEDBACK, tthis$0.W2());
          }
          SwipeLayout swipeLayout = w9.c(tthis$0.B2());
          if (swipeLayout != null) {
             swipeLayout.n(p0, 6);
          }
       }
       return;
    }
}
