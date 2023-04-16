package com.kuaishou.live.lite.feedback.LiveLiteFeedbackController$d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.lite.feedback.LiveLiteFeedbackController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService$EnableLeftSwipeBizType;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService;

public final class LiveLiteFeedbackController$d implements Observer	// class@0008f6
{
    public final LiveLiteFeedbackController b;

    public void LiveLiteFeedbackController$d(LiveLiteFeedbackController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFeedbackController$d.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b;
             p0.t.w9(p0.k, LiveLiteRecommendSideBarService$EnableLeftSwipeBizType.FEEDBACK, p0.W2());
          }
       }
       return;
    }
}
