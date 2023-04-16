package com.kuaishou.live.lite.feedback.LiveLiteFeedbackController$c;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService$b;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackController;
import java.lang.Object;
import android.view.MotionEvent;
import jb3.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService;
import java.util.Objects;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import d61.g;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ci3.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import e93.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import pg1.d;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackController$showFeedbackPanel$1;
import o63.a;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import msd.l;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackController$showFeedbackPanel$2;
import msd.a;

public final class LiveLiteFeedbackController$c implements LiveLiteGestureService$b	// class@0008f5
{
    public final LiveLiteFeedbackController a;

    public void LiveLiteFeedbackController$c(LiveLiteFeedbackController p0){
       this.a = p0;
       super();
    }
    public void a(MotionEvent p0){
       c.c(this, p0);
    }
    public void onDoubleTap(MotionEvent p0){
       c.a(this, p0);
    }
    public void onLongPress(MotionEvent p0){
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFeedbackController$c.class, "1")) {
          return;
       }
       a.p(p0, "event");
       if (this.a.t.C4()) {
          return;
       }
       LiveLiteFeedbackController$c ta = this.a;
       Objects.requireNonNull(ta);
       LiveLiteFeedbackController liveLiteFeed = LiveLiteFeedbackController.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, liveLiteFeed, "7")) {
          Activity uActivity = ta.B2();
          if (!g.h(uActivity)) {
             b.Z(LiveLiteLogTag.LITE_FEEDBACK, "show feedback panel");
             if (ta.j == null) {
                Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                Activity uActivity1 = uActivity;
                BaseFragment uBaseFragmen = ta.p.a();
                LiveLiteFeedbackController v = ta.v;
                QPhoto qPhoto = ta.V2();
                Object obj = PatchProxy.apply(objArray, ta, liveLiteFeed, "8");
                if (obj != PatchProxyResult.class) {
                   objArray1 = obj;
                }else if(d.c.b()){
                   objArray = d.a();
                }
                objArray1 = objArray;
                b uob = new b(uActivity1, uBaseFragmen, v, qPhoto, null, objArray1, new LiveLiteFeedbackController$showFeedbackPanel$1(ta));
                ta.j = v3;
             }
             liveLiteFeed = ta.j;
             a.m(liveLiteFeed);
             liveLiteFeed.c(2, new LiveLiteFeedbackController$showFeedbackPanel$2(ta));
          }
       }
       return;
    }
}
