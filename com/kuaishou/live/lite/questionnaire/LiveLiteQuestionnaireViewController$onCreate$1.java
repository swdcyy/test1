package com.kuaishou.live.lite.questionnaire.LiveLiteQuestionnaireViewController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.questionnaire.LiveLiteQuestionnaireViewController;
import java.lang.Object;
import com.kuaishou.live.lite.questionnaire.LiveLiteQuestionnaireInfo;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import tc3.i;
import tc3.h;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;

public final class LiveLiteQuestionnaireViewController$onCreate$1 extends Lambda implements l	// class@000aa7
{
    public final LiveLiteQuestionnaireViewController this$0;

    public void LiveLiteQuestionnaireViewController$onCreate$1(LiveLiteQuestionnaireViewController p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveLiteQuestionnaireInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteQuestionnaireViewController$onCreate$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       LiveLiteQuestionnaireViewController$onCreate$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       LiveLiteQuestionnaireViewController liveLiteQues = LiveLiteQuestionnaireViewController.class;
       if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, liveLiteQues, "4")) {
          h oh = PatchProxy.applyOneRefs(p0, tthis$0, liveLiteQues, "5");
          if (oh != PatchProxyResult.class) {
          }else {
             oh = new h(p0, new i(tthis$0, p0));
          }
          tthis$0.n.d(oh);
          tthis$0.k = oh;
       }
       return;
    }
}
