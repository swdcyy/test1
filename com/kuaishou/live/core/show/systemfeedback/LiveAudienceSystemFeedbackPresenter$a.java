package com.kuaishou.live.core.show.systemfeedback.LiveAudienceSystemFeedbackPresenter$a;
import erd.g;
import com.kuaishou.live.core.show.systemfeedback.LiveAudienceSystemFeedbackPresenter;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.System;
import com.kuaishou.live.core.show.systemfeedback.ColdStartTips;
import com.kuaishou.live.core.show.systemfeedback.LiveAudienceInteractiveSystemFeedbackTips;
import com.kuaishou.live.core.show.systemfeedback.WatchTaskTips;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import gl2.e;
import com.kuaishou.live.core.show.systemfeedback.LiveAudienceSystemFeedbackPresenter$systemFeedbackShowTipService$2$a;
import fl2.a;
import gl2.f;
import gl2.c;
import kotlin.jvm.internal.a;
import t02.a0;
import fq5.b;
import ft5.b;
import gl2.i;
import com.kuaishou.live.core.show.systemfeedback.NoCommentTips;
import com.kuaishou.live.core.show.systemfeedback.EnterRoomWatchTips;

public final class LiveAudienceSystemFeedbackPresenter$a implements g	// class@00116f
{
    public final LiveAudienceSystemFeedbackPresenter b;

    public void LiveAudienceSystemFeedbackPresenter$a(LiveAudienceSystemFeedbackPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       LiveAudienceSystemFeedbackPresenter m;
       b uob;
       String str4;
       LiveAudienceSystemFeedbackPresenter m1;
       b uob1;
       Object obj = this;
       LiveTimeConsumingUserStatusResponse obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveAudienceSystemFeedbackPresenter$a.class, "1")) {
       }else {
          LiveAudienceSystemFeedbackPresenter$a b = obj.b;
          obj1 = obj1.mInteractiveSystemFeedbackTips;
          Objects.requireNonNull(b);
          LiveAudienceSystemFeedbackPresenter liveAudience = LiveAudienceSystemFeedbackPresenter.class;
          if (!PatchProxy.applyVoidOneRefs(obj1, b, liveAudience, "6")) {
             b.S = System.currentTimeMillis();
             if (obj1 != null) {
                String str = "TextUtils.emptyIfNull\(li¡­asicContext.anchorUserId\)";
                String str1 = "livePlayCallerContext.mSendCommentsService";
                String str2 = "livePlayCallerContext";
                String str3 = "livePlayCallerContext.liveBasicContext";
                if (b.O != null) {
                   ColdStartTips coldStartTip = obj1.getColdStartTips();
                   WatchTaskTips watchTaskTip = obj1.getWatchTaskTips();
                   if (!PatchProxy.applyVoidTwoRefs(coldStartTip, watchTaskTip, b, liveAudience, "7")) {
                      if (coldStartTip != null) {
                         if (!TextUtils.x(coldStartTip.getEnterRoomTip())) {
                            e uoe = new e(b.b9(), true, b.c9(), coldStartTip.getEnterRoomTip(), 0, 0, 1);
                            b.a9(liveAudience);
                         }
                         if (!TextUtils.x(coldStartTip.getNoCommentTip())) {
                            LiveAudienceSystemFeedbackPresenter$systemFeedbackShowTipService$2$a osystemFeedb = b.b9();
                            m = b.M;
                            if (m == null) {
                               a.S(str2);
                            }
                            a0 y1 = m.Y1;
                            a.o(y1, str1);
                            m = b.M;
                            if (m == null) {
                               a.S(str2);
                            }
                            uob = m.b();
                            a.o(uob, str3);
                            str4 = TextUtils.k(uob.d());
                            a.o(str4, str);
                            c uoc = new c(osystemFeedb, y1, true, str4, coldStartTip.getNoCommentTip(), coldStartTip.getNoCommentThreshold(), 1);
                            b.a9(liveAudience);
                         }
                      }
                      if (watchTaskTip != null) {
                         m1 = b.M;
                         if (m1 == null) {
                            a.S(str2);
                         }
                         uob1 = m1.b();
                         a.o(uob1, str3);
                         i oi = new i(uob1, b.b9(), true, watchTaskTip.getThreshold(), watchTaskTip.getWatchTaskToken());
                         b.a9(liveAudience);
                      }
                   }
                }else {
                   WatchTaskTips watchTaskTip1 = obj1.getWatchTaskTips();
                   NoCommentTips noCommentTip = obj1.getNoCommentTips();
                   EnterRoomWatchTips enterRoomWat = obj1.getEnterRoomWatchTips();
                   if (!PatchProxy.applyVoidThreeRefs(watchTaskTip1, noCommentTip, enterRoomWat, b, LiveAudienceSystemFeedbackPresenter.class, "8")) {
                      if (watchTaskTip1 != null) {
                         m1 = b.M;
                         if (m1 == null) {
                            a.S(str2);
                         }
                         uob1 = m1.b();
                         a.o(uob1, str3);
                         i oi1 = new i(uob1, b.b9(), false, watchTaskTip1.getThreshold(), watchTaskTip1.getWatchTaskToken());
                         b.a9(liveAudience);
                      }
                      if (noCommentTip != null) {
                         LiveAudienceSystemFeedbackPresenter$systemFeedbackShowTipService$2$a osystemFeedb1 = b.b9();
                         m1 = b.M;
                         if (m1 == null) {
                            a.S(str2);
                         }
                         a0 y11 = m1.Y1;
                         a.o(y11, str1);
                         m = b.M;
                         if (m == null) {
                            a.S(str2);
                         }
                         uob = m.b();
                         a.o(uob, str3);
                         str4 = TextUtils.k(uob.d());
                         a.o(str4, str);
                         c uoc1 = new c(osystemFeedb1, y11, false, str4, noCommentTip.getTip(), noCommentTip.getThreshold(), noCommentTip.getDisplayLimit());
                         b.a9(liveAudience);
                      }
                      if (enterRoomWat != null) {
                         e uoe1 = new e(b.b9(), false, b.c9(), enterRoomWat.getTip(), enterRoomWat.getClickThreshold(), enterRoomWat.getSlideThreshold(), enterRoomWat.getDisplayLimit());
                         b.a9(liveAudience);
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
