package com.kuaishou.live.lite.questionnaire.LiveLiteQuestionnairePresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eq3.d;
import com.kuaishou.live.lite.questionnaire.LiveLiteQuestionnaireViewController;
import kotlin.jvm.internal.a;
import td3.o;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import n93.b;
import e93.a;
import xp5.i;
import com.kuaishou.live.viewcontroller.ViewController;
import c93.b;
import d93.a;

public final class LiveLiteQuestionnairePresenter extends d	// class@000aa6
{
    public o v;
    public LiveLiteGuidanceMessageQueueManager w;
    public b x;
    public a y;
    public i z;

    public void LiveLiteQuestionnairePresenter(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteQuestionnairePresenter.class, "3")) {
          return;
       }
       super.F8();
       d uod = this.P8();
       LiveLiteQuestionnairePresenter tv = this.v;
       if (tv == null) {
          a.S("userStatusManager");
       }
       LiveLiteQuestionnairePresenter tw = this.w;
       if (tw == null) {
          a.S("guidanceMessageQueueService");
       }
       LiveLiteQuestionnairePresenter tx = this.x;
       if (tx == null) {
          a.S("bottomBubbleService");
       }
       LiveLiteQuestionnairePresenter ty = this.y;
       if (ty == null) {
          a.S("liteAudienceInfoManager");
       }
       LiveLiteQuestionnairePresenter tz = this.z;
       if (tz == null) {
          a.S("liveLogPackageProvider");
       }
       LiveLiteQuestionnaireViewController liveLiteQues = new LiveLiteQuestionnaireViewController(tv, tw, tx, ty, tz);
       uod.xg(v7);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteQuestionnairePresenter.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       this.v = p0.a(o.class);
       this.w = p0.a(LiveLiteGuidanceMessageQueueManager.class);
       this.z = p0.a(i.class);
       this.y = p0.a(a.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteQuestionnairePresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       this.x = p0.a(b.class);
       return;
    }
}
