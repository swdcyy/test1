package com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.a$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget$b;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import s51.c;
import lp3.c;
import lp3.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo$ExtraInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import mc1.a;

public class a$a implements LiveIncreaseFansNoticeWidget$b	// class@000fdf
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void S4(LiveIncreaseFansNoticeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.a.i(p0);
       return;
    }
    public void T4(LiveIncreaseFansNoticeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "7")) {
          LiveCommentNoticeBaseInfo mBizType = p0.mBizType;
          LiveIncreaseFansNoticeInfo$ExtraInfo uExtraInfo = null;
          if (mBizType == 124) {
             c uoc = ta.d.a(c.class);
             LiveGenericCommentNoticeInfo mExtraInfo = p0.mExtraInfo;
             if (mExtraInfo != null && (!TextUtils.x(mExtraInfo.mActionLink) && uoc.P0(p0.mExtraInfo.mActionLink))) {
                uoc.r4(p0.mExtraInfo.mActionLink, ta.c);
             }
          label_0052 :
             LiveGenericCommentNoticeInfo mExtraInfo1 = p0.mExtraInfo;
             if (mExtraInfo1 != null) {
                uExtraInfo = mExtraInfo1.mActionButtonReportType;
             }
          }else if(mBizType == 27){
             ta.e.Gd(p0);
          }else if(mBizType == 76){
             ta.e.Lk(p0.mRenewPopTitle, p0.mRenewPopDesc);
          }else if(mBizType == 77){
             ta.e.c2();
          }
          a.c(ta.f, String.valueOf(p0.mNoticeType), p0.mBizId, ta.g(p0, 1, uExtraInfo));
       }
       return;
    }
}
