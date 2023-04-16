package com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import java.lang.StringBuilder;

public class LiveCommentNoticeBaseInfo implements Serializable	// class@000f96
{
    public String mBizId;
    public int mBizType;
    public String mCommonGuideSubBizType;
    public long mDelayDisplayTimeMs;
    public long mDisplayDurationMs;
    public int mEnableLiveModel;
    public String mExtraInfoStr;
    public String mLiveStreamId;
    public int mNoticeType;
    public int mPriority;
    public static final long serialVersionUID = 0x72277a2e6fe48e7b;

    public void LiveCommentNoticeBaseInfo(){
       super();
    }
    public String getLogExtraInfo(){
       i3 obj = PatchProxy.apply(null, this, LiveCommentNoticeBaseInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mExtraInfoStr == null) {
          return "";
       }
       obj = i3.f();
       obj.d("extra_info", this.mExtraInfoStr);
       return obj.e();
    }
    public final void parseBaseInfo(SCCommentNotice p0){
       this.mNoticeType = p0.type;
       this.mBizType = p0.bizType;
       this.mBizId = p0.bizId;
       this.mPriority = p0.priority;
       this.mDisplayDurationMs = p0.displayDurationMs;
       this.mLiveStreamId = p0.targetLiveStreamId;
       this.mDelayDisplayTimeMs = p0.delayDisplayMs;
       this.mEnableLiveModel = p0.enableLiveModel;
       this.mCommonGuideSubBizType = p0.commonGuideSubBizType;
    }
    public void parseJsonRemains(){
    }
    public void parsePbRemains(SCCommentNotice p0){
       this.mExtraInfoStr = p0.extraInfo;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveCommentNoticeBaseInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveCommentNoticeBaseInfo{mNoticeType="+this.mNoticeType+", mBizType="+this.mBizType+", mBizId=\'"+this.mBizId+'''+", mPriority="+this.mPriority+", mDisplayDurationMs="+this.mDisplayDurationMs+", mLiveStreamId=\'"+this.mLiveStreamId+'''+", mDelayDisplayTimeMs=\'"+this.mDelayDisplayTimeMs+'''+'}';
    }
}
