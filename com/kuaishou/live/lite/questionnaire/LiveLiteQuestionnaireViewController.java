package com.kuaishou.live.lite.questionnaire.LiveLiteQuestionnaireViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import td3.o;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import n93.b;
import e93.a;
import xp5.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.questionnaire.LiveLiteQuestionnaireViewController$questionnaireModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tc3.g;
import com.kuaishou.live.lite.questionnaire.LiveLiteQuestionnaireViewController$onCreate$1;
import java.util.Objects;
import brd.t;
import tc3.e;
import msd.l;
import erd.g;
import crd.b;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lnc.b9;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteQuestionnaireViewController extends ViewController	// class@000aa9
{
    public a j;
    public LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage k;
    public final p l;
    public final o m;
    public final LiveLiteGuidanceMessageQueueManager n;
    public final b o;
    public final a p;
    public final i q;

    public void LiveLiteQuestionnaireViewController(o p0,LiveLiteGuidanceMessageQueueManager p1,b p2,a p3,i p4){
       a.p(p0, "userStatusManager");
       a.p(p1, "guidanceMessageQueueService");
       a.p(p2, "bottomBubbleService");
       a.p(p3, "liteAudienceInfoManager");
       a.p(p4, "logPackageProvider");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.q = p4;
       this.l = s.c(new LiveLiteQuestionnaireViewController$questionnaireModel$2(this));
    }
    public void F2(){
       String str = "2";
       if (PatchProxy.applyVoid(null, this, LiveLiteQuestionnaireViewController.class, str)) {
          return;
       }
       g og = this.V2();
       LiveLiteQuestionnaireViewController$onCreate$1 oonCreate$1 = new LiveLiteQuestionnaireViewController$onCreate$1(this);
       Objects.requireNonNull(og);
       if (!PatchProxy.applyVoidOneRefs(oonCreate$1, og, g.class, str)) {
          a.p(oonCreate$1, "questionnaireListener");
          if (og.e != null) {
             og.a = og.d.W().subscribe(new e(og, oonCreate$1));
          }else {
             b.Z(LiveLiteLogTag.QUESTIONNAIRE, "fetchQuestionnaireInfo: liveStreamId is null, abort");
          }
       }
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteQuestionnaireViewController.class, "3")) {
          return;
       }
       g og = this.V2();
       Objects.requireNonNull(og);
       if (!PatchProxy.applyVoid(objArray, og, g.class, "1")) {
          b[] uobArray = new b[]{og.a,og.b,og.c};
          b9.b(uobArray);
       }
       LiveLiteQuestionnaireViewController tk = this.k;
       if (tk != null) {
          this.n.c(tk);
       }
       return;
    }
    public final g V2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteQuestionnaireViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
}
