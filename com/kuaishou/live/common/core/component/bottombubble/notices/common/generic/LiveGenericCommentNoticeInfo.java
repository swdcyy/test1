package com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseExtraInfo;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import com.kuaishou.livestream.message.nano.CommentNoticeButton;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.util.List;
import ekd.q;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveGenericCommentNoticeInfo extends LiveCommentNoticeBaseInfo	// class@000f8e
{
    public LiveCommentNoticeButtonInfo mButtonInfo;
    public List mContentIconUrls;
    public String mDescription;
    public LiveCommentNoticeBaseExtraInfo mExtraInfo;
    public boolean mIsContentIconSquare;
    public boolean mIsShowInLandscape;
    public String mSubTitle;
    public int mTotalShowTimes;
    public static final long serialVersionUID = 0xb874849819fc3233;

    public void LiveGenericCommentNoticeInfo(){
       super();
    }
    public final void a(){
       LiveGenericCommentNoticeInfo tmExtraInfo = this.mExtraInfo;
       if (tmExtraInfo != null) {
          LiveCommentNoticeBaseExtraInfo mDelayDispla = tmExtraInfo.mDelayDisplayTimeMs;
          if (mDelayDispla > 0) {
             this.mDelayDisplayTimeMs = mDelayDispla;
          }
       }
       return;
    }
    public Class getExtraInfoClass(){
       return LiveCommentNoticeBaseExtraInfo.class;
    }
    public void parseJsonRemains(){
       if (PatchProxy.applyVoid(null, this, LiveGenericCommentNoticeInfo.class, "2")) {
          return;
       }
       if (this.mExtraInfo != null) {
          this.a();
          this.setShortcutsForExtraInfo();
       }
       return;
    }
    public void parsePbRemains(SCCommentNotice p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGenericCommentNoticeInfo.class, "1")) {
          return;
       }
       super.parsePbRemains(p0);
       this.mSubTitle = p0.subTitle;
       this.mDescription = p0.desc;
       if (p0.button != null) {
          LiveCommentNoticeButtonInfo liveCommentN = new LiveCommentNoticeButtonInfo();
          this.mButtonInfo = liveCommentN;
          SCCommentNotice button = p0.button;
          liveCommentN.mBtnTitle = button.text;
          liveCommentN.mBtnUrl = button.url;
       }
       this.mIsContentIconSquare = p0.noticePicIsSquare;
       this.mTotalShowTimes = p0.totalShowTimes;
       this.mContentIconUrls = q.a(e0.i(p0.commentNoticePicUrl));
       if (!TextUtils.isEmpty(p0.extraInfo)) {
          LiveCommentNoticeBaseExtraInfo liveCommentN1 = LiveCommentNoticeBaseExtraInfo.parseExtraInfo(p0.extraInfo, this.getExtraInfoClass());
          this.mExtraInfo = liveCommentN1;
          if (liveCommentN1 != null) {
             this.a();
             this.setShortcutsForExtraInfo();
          }
       }
       return;
    }
    public void setShortcutsForExtraInfo(){
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveGenericCommentNoticeInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGenericCommentNoticeInfo{mSubTitle=\'"+this.mSubTitle+'''+", mDescription=\'"+this.mDescription+'''+", mButtonInfo="+this.mButtonInfo+", mIsContentIconSquare="+this.mIsContentIconSquare+", mContentIconUrls="+this.mContentIconUrls+", mTotalShowTimes="+this.mTotalShowTimes+", mExtraInfo="+this.mExtraInfo+", mDelayDisplayTimeMs="+this.mDelayDisplayTimeMs+", mNoticeType="+this.mNoticeType+", mBizType="+this.mBizType+", mBizId=\'"+this.mBizId+'''+", mPriority="+this.mPriority+", mDisplayDurationMs="+this.mDisplayDurationMs+", mLiveStreamId=\'"+this.mLiveStreamId+'''+'}';
    }
}
