package com.kuaishou.live.common.core.component.bottombubble.notices.wish.d;
import android.database.Observable;
import lp3.e;
import crd.a;
import xp5.g;
import java.lang.Class;
import lp3.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.LiveWishNoticeInfo;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.LiveWishNoticeInfo$WishLightExtraInfo;
import com.kuaishou.android.live.log.b;
import h91.d;
import h91.c;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.c;
import erd.g;
import crd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.reflect.Type;
import va1.z;
import java.lang.Boolean;
import pf1.a;
import ft5.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.d$a;

public class d extends Observable	// class@001020
{
    public final e a;
    public final g b;
    public final a c;
    public LiveWishNoticeInfo d;
    public static final int e;

    public void d(e p0){
       super();
       this.c = new a();
       this.a = p0;
       this.b = p0.a(g.class);
    }
    public LiveWishNoticeInfo a(){
       return this.d;
    }
    public void b(long p0){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, d.class, "1")) {
          return;
       }
       d td = this.d;
       if (td != null && td.mExtraInfo != null) {
          LiveLogTag lIVE_COMMENT = LiveLogTag.LIVE_COMMENT_NOTICE;
          lIVE_COMMENT.appendTag("LiveWishLightNotice");
          b.V(lIVE_COMMENT, "sendBlessings:"+p0, "liveStreamId", this.b.getLiveStreamId(), "authorId", this.b.d(), "targetUserId", Long.valueOf(this.d.mExtraInfo.mTriggerUserId), "bizId", this.d.mExtraInfo.mBlessingBizId);
          LiveGenericCommentNoticeInfo mExtraInfo = this.d.mExtraInfo;
          this.c.c(c.b().h(this.b.getLiveStreamId(), this.b.d(), mExtraInfo.mTriggerUserId, mExtraInfo.mBlessingBizId, p0).map(new e()).subscribe(b.b, c.b));
          if (!TextUtils.x(this.d.mExtraInfo.mTriggerUserName)) {
             LiveWishNoticeInfo$WishLightExtraInfo mTriggerUser = this.d.mExtraInfo.mTriggerUserName;
             if (!PatchProxy.applyVoidOneRefs(mTriggerUser, this, d.class, "2")) {
                String[] value = a.t().u("SOURCE_LIVE").getValue("liveWishLightBlessingCommentText", String[].class, null);
                if (value == null || value.length < 1) {
                   lIVE_COMMENT.appendTag("LiveWishLightNotice");
                   b.P(lIVE_COMMENT, "sendComment:comments is empty");
                }else {
                   object oobject = value[z.b(value.length)];
                   if (TextUtils.x(oobject)) {
                      lIVE_COMMENT.appendTag("LiveWishLightNotice");
                      b.P(lIVE_COMMENT, "sendComment:comment is empty");
                   }else {
                      String str = oobject+"@"+mTriggerUser;
                      lIVE_COMMENT.appendTag("LiveWishLightNotice");
                      b.T(lIVE_COMMENT, "sendComment:", "isAnchor", Boolean.valueOf(this.b.e()), "comment", str);
                      if (this.b.e()) {
                         this.a.a(a.class).gn(str, false, false);
                      }else {
                         this.a.a(b.class).U2(str);
                      }
                   }
                }
             }
          }else {
             lIVE_COMMENT.appendTag("LiveWishLightNotice");
             b.P(lIVE_COMMENT, "sendBlessings:mTriggerUserName is empty");
          }
       }
       return;
    }
    public void c(LiveWishNoticeInfo p0,long p1){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, d.class, "3")) {
          return;
       }
       this.d = p0;
       Observable tmObservers = this.mObservers;
       _monitor_enter(tmObservers);
       _monitor_exit(tmObservers);
       Iterator iterator = new ArrayList(this.mObservers).iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
}
