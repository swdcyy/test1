package com.kuaishou.live.common.core.component.bottombubble.notices.wish.a;
import lc1.b;
import lp3.e;
import java.lang.Object;
import n91.f;
import java.lang.Class;
import lp3.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.LiveWishNoticeInfo;
import nc1.k;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.LiveWishNoticeInfo$WishLightExtraInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import pd1.f;
import java.lang.Long;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.d;
import com.kwai.robust.PatchProxyResult;
import nc1.j;
import pd1.a;
import nc1.j$a;
import bq5.f$a;
import bq5.d;
import bq5.f;
import lc1.a;
import lc1.f;
import lc1.e;
import java.lang.Number;
import lc1.d;
import java.util.Objects;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;

public class a implements b	// class@00101c
{
    public final e b;
    public final f c;
    public boolean d;
    public String e;
    public f f;
    public j g;

    public void a(e p0){
       super();
       this.d = false;
       this.e = null;
       this.b = p0;
       this.c = p0.a(f.class);
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       LiveLogTag lIVE_COMMENT;
       f uof1;
       String str = "2";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, str)) {
       }else {
          LiveGenericCommentNoticeInfo mExtraInfo = p1.mExtraInfo;
          if (mExtraInfo == null || TextUtils.x(mExtraInfo.mBlessingBizId)) {
             b.P(LiveLogTag.LIVE_COMMENT_NOTICE.appendTag("LiveWishLightNotice"), "onReceiveCommentNotice: invalid notice...");
          }else if(this.d != null){
             if (!TextUtils.n(p1.mExtraInfo.mBlessingBizId, this.e)) {
                b.S(LiveLogTag.LIVE_COMMENT_NOTICE.appendTag("LiveWishLightNotice"), "onReceiveCommentNotice: coming other mBlessingBizId...", "mBlessingBizId", p1.mExtraInfo.mBlessingBizId);
             }else {
                lIVE_COMMENT = LiveLogTag.LIVE_COMMENT_NOTICE;
                lIVE_COMMENT.appendTag("LiveWishLightNotice");
                b.T(lIVE_COMMENT, "onReceiveCommentNotice-updateNotice", "mLiveWishNoticeInfo", p1, "mLastBlessingBizId", this.e);
                a tf = this.f;
                if (tf != null) {
                   LiveWishNoticeInfo$WishLightExtraInfo mCount = p1.mExtraInfo.mCount;
                   f uof = f.class;
                   if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(p1, Long.valueOf(mCount), tf, uof, str)) {
                      tf.c.c(p1, mCount);
                   }
                }
             }
          }else {
             long l = p1.mDisplayEndTime - this.c.s();
             if (l - 2000 <= 0) {
                b.S(LiveLogTag.LIVE_COMMENT_NOTICE.appendTag("LiveWishLightNotice"), "onReceiveCommentNotice: displayTime is too short...", "displayTime", Long.valueOf(l));
             }else {
                lIVE_COMMENT = LiveLogTag.LIVE_COMMENT_NOTICE;
                lIVE_COMMENT.appendTag("LiveWishLightNotice");
                b.U(lIVE_COMMENT, "onReceiveCommentNotice-newNotice", "displayTime", Long.valueOf(l), "mLiveWishNoticeInfo", p1, "mBlessingBizId", p1.mExtraInfo.mBlessingBizId);
                this.e = p1.mExtraInfo.mBlessingBizId;
                j oj = PatchProxy.applyOneRefs(p1, this, a.class, "4");
                if (oj != PatchProxyResult.class) {
                }else {
                   uof1 = new f(this.b, p1);
                   this.f = uof1;
                   j$a uoa = new j$a();
                   uoa.e(uof1);
                   uoa.d(new a(this, p1));
                   uoa.c((p1.mDisplayEndTime - this.c.s()));
                   uoa.j(p1.mDelayDisplayTimeMs);
                   uoa.h(p1.mBizId);
                   uoa.f(p1.mPriority);
                   uoa.i(p1.mNoticeType);
                   oj = uoa.g();
                }
                this.g = oj;
                this.b.a(k.class).Y9(this.g);
                this.d = true;
                uof1 = this.b.a(k.class).t3();
                if (uof1 != null && (uof1.c() != this.f && uof1.getPriority() < p1.mPriority)) {
                   b.P(lIVE_COMMENT.appendTag("LiveWishLightNotice"), "onReceiveCommentNotice: breakup other notice...");
                   this.b.a(k.class).m0();
                }
             }
          }
       }
       return;
    }
    public List b(){
       return a.c(this);
    }
    public f c(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new e(LiveWishNoticeInfo.class);
       Object obj1 = PatchProxy.apply(objArray, this, uoa, "3");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION};
          i = LiveCommentNoticeChannelType.combineChannels(liveCommentN);
       }
       return f.b(48, i, obj);
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       b.P(LiveLogTag.LIVE_COMMENT_NOTICE.appendTag("LiveWishLightNotice"), "LiveWishNoticeHandler dispose...");
       a tf = this.f;
       if (tf != null) {
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoid(null, tf, f.class, "3")) {
             tf.b.a();
          }
          this.f = null;
       }
       this.d = false;
       this.e = null;
       return;
    }
}
