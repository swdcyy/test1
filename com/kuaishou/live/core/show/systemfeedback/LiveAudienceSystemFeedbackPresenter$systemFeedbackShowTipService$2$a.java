package com.kuaishou.live.core.show.systemfeedback.LiveAudienceSystemFeedbackPresenter$systemFeedbackShowTipService$2$a;
import fl2.a;
import com.kuaishou.live.core.show.systemfeedback.LiveAudienceSystemFeedbackPresenter$systemFeedbackShowTipService$2;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.core.show.systemfeedback.LiveAudienceSystemFeedbackPresenter;
import com.kuaishou.livestream.message.nano.WealthHighGradeBulletComment;
import fq5.b;
import t02.a0;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import lnc.i3;
import java.lang.System;
import java.lang.Boolean;
import im2.f;

public final class LiveAudienceSystemFeedbackPresenter$systemFeedbackShowTipService$2$a implements a	// class@001170
{
    public final LiveAudienceSystemFeedbackPresenter$systemFeedbackShowTipService$2 a;

    public void LiveAudienceSystemFeedbackPresenter$systemFeedbackShowTipService$2$a(LiveAudienceSystemFeedbackPresenter$systemFeedbackShowTipService$2 p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceSystemFeedbackPresenter$systemFeedbackShowTipService$2$a.class, "1")) {
          return;
       }
       a.p(p0, "tip");
       String str = "bizType";
       a.p(p1, str);
       LiveAudienceSystemFeedbackPresenter$systemFeedbackShowTipService$2 this$0 = this.a.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this$0, LiveAudienceSystemFeedbackPresenter.class, "5")) {
          WealthHighGradeBulletComment wealthHighGr = new WealthHighGradeBulletComment();
          wealthHighGr.comment = p0;
          LiveAudienceSystemFeedbackPresenter m = this$0.M;
          if (m == null) {
             a.S("livePlayCallerContext");
          }
          b uob = m.b();
          a.o(uob, "livePlayCallerContext.liveBasicContext");
          wealthHighGr.user = UserInfo.convertToProto(UserInfo.convertFromQUser(uob.I()));
          wealthHighGr.displayType = 0;
          wealthHighGr.senderState = new LiveAudienceState();
          i3 oi3 = i3.f();
          oi3.d(str, p1);
          oi3.d("trigTms", String.valueOf((System.currentTimeMillis() - this$0.S)));
          oi3.a("needLongerText", Boolean.TRUE);
          wealthHighGr.extraInfo = oi3.e();
          m = this$0.N;
          if (m == null) {
             a.S("liveWealthGradeBarrageEnterRoomService");
          }
          m.a(wealthHighGr, 0);
       }
       return;
    }
}
