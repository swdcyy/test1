package com.kuaishou.live.common.core.component.bottombubble.notices.wish.f;
import androidx.lifecycle.AndroidViewModel;
import android.app.Application;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.d;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.f$a;
import java.lang.Object;
import android.database.Observable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.LiveWishNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.LiveWishNoticeInfo$WishLightExtraInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Long;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import androidx.lifecycle.ViewModel;
import crd.b;
import java.util.Objects;
import crd.a;
import java.lang.Math;
import java.lang.StringBuilder;
import o56.a;

public class f extends AndroidViewModel	// class@001023
{
    public MutableLiveData a;
    public MutableLiveData b;
    public MutableLiveData c;
    public MutableLiveData d;
    public MutableLiveData e;
    public MutableLiveData f;
    public MutableLiveData g;
    public long h;
    public long i;
    public final d j;
    public b k;
    public final d$a l;

    public void f(Application p0,d p1){
       LiveGenericCommentNoticeInfo mButtonInfo;
       super(p0);
       this.a = new MutableLiveData();
       this.b = new MutableLiveData();
       this.c = new MutableLiveData();
       this.d = new MutableLiveData();
       this.e = new MutableLiveData();
       this.f = new MutableLiveData();
       this.g = new MutableLiveData();
       this.h = 0;
       this.i = 0;
       f$a uoa = new f$a(this);
       this.l = uoa;
       this.j = p1;
       p1.registerObserver(uoa);
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
       }else {
          LiveWishNoticeInfo liveWishNoti = p1.a();
          if (liveWishNoti != null && liveWishNoti.mExtraInfo != null) {
             this.a.setValue(Boolean.valueOf(liveWishNoti.mIsContentIconSquare));
             this.b.setValue(liveWishNoti.mContentIconUrls);
             this.p0(liveWishNoti, liveWishNoti.mExtraInfo.mCount);
             LiveLogTag lIVE_COMMENT = LiveLogTag.LIVE_COMMENT_NOTICE;
             lIVE_COMMENT.appendTag("LiveWishLightNotice");
             LiveLogTag liveLogTag = lIVE_COMMENT;
             Long longx = Long.valueOf(liveWishNoti.mExtraInfo.mTriggerUserId);
             String id = QCurrentUser.ME.getId();
             boolean b = (liveWishNoti.mButtonInfo == null)? true: false;
             b.U(liveLogTag, "initData:userID", "mTriggerUserId", longx, "mCurrentUserId", id, "mButtonInfo", Boolean.valueOf(b));
             if (!TextUtils.n(String.valueOf(liveWishNoti.mExtraInfo.mTriggerUserId), QCurrentUser.ME.getId())) {
                mButtonInfo = liveWishNoti.mButtonInfo;
                if (mButtonInfo != null && !TextUtils.x(mButtonInfo.mBtnTitle)) {
                   this.e.setValue(Boolean.TRUE);
                   this.f.setValue(liveWishNoti.mButtonInfo.mBtnTitle);
                }
             }
             this.e.setValue(Boolean.FALSE);
          }
       }
       return;
    }
    public final String o0(String p0){
       if (p0 == null) {
          p0 = "";
       }
       return p0;
    }
    public void onCleared(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "5")) {
          return;
       }
       super.onCleared();
       b.P(LiveLogTag.LIVE_COMMENT_NOTICE.appendTag("LiveWishLightNotice"), "LiveWishNoticeViewModel onCleared...");
       f tk = this.k;
       if (tk != null && !tk.isDisposed()) {
          this.k.dispose();
          this.k = objArray;
       }
       this.j.unregisterObserver(this.l);
       tk = this.j;
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoid(objArray, tk, d.class, "5")) {
          tk.c.dispose();
       }
       this.h = 0;
       this.i = 0;
       return;
    }
    public void p0(LiveWishNoticeInfo p0,long p1){
       int b;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uof, "2")) {
          return;
       }
       String str = "LiveWishLightNotice";
       if (p0 == null || p0.mExtraInfo == null) {
          b.P(LiveLogTag.LIVE_COMMENT_NOTICE.appendTag(str), "updateNoticeContent: invalid notice...");
          return;
       }else {
          this.i = Math.max(p1, this.i);
          LiveLogTag lIVE_COMMENT = LiveLogTag.LIVE_COMMENT_NOTICE;
          lIVE_COMMENT.appendTag(str);
          b.S(lIVE_COMMENT, "updateNoticeContent:", "mDisplayCount", Long.valueOf(this.i));
          this.c.setValue(this.o0(p0.mSubTitle));
          if (this.i > 0) {
             this.d.setValue(this.o0(p0.mExtraInfo.mContentPre)+TextUtils.N(this.i)+this.o0(p0.mExtraInfo.mContentAft));
          }else {
             b = TextUtils.n(String.valueOf(p0.mExtraInfo.mTriggerUserId), QCurrentUser.ME.getId());
             b.S(lIVE_COMMENT.appendTag(str), "updateNoticeContent:", "isSameUser", Boolean.valueOf(b));
             f td = this.d;
             Application uApplication = a.b();
             b = (b)? 0x7f102f21: 0x7f101f80;
             td.setValue(uApplication.getString(b));
          }
          return;
       }
    }
}
