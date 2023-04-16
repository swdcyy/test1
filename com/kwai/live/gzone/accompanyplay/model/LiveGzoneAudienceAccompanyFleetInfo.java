package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAudienceAccompanyFleetInfo;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySettingInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyRequirement;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyJsonInfoItem;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;

public class LiveGzoneAudienceAccompanyFleetInfo implements a	// class@000c47
{
    public String mAccompanyId;
    public int mAccompanyStatus;
    public String mCurrentBizRoundDescJsonString;
    public String mCurrentBizRoundId;
    public String mCurrentBizRoundModel;
    public String mCurrentRoundId;
    public long mCurrentRoundStartTime;
    public List mOnBoardMembers;
    public boolean mQueuingFull;
    public boolean mQueuingStop;
    public LiveGzoneAccompanySettingInfo mSettingInfo;
    public int mTotalSeatCount;
    public int mWaitingMemberCount;
    public List mWaitingMemberTops;

    public void LiveGzoneAudienceAccompanyFleetInfo(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceAccompanyFleetInfo.class, "1")) {
          return;
       }
       if (this.mSettingInfo == null) {
          LiveGzoneAccompanySettingInfo liveGzoneAcc = new LiveGzoneAccompanySettingInfo();
          this.mSettingInfo = liveGzoneAcc;
          liveGzoneAcc.mRequirement = new LiveGzoneAccompanyRequirement();
       }
       LiveGzoneAudienceAccompanyFleetInfo tmTotalSeatC = this.mTotalSeatCount;
       if (tmTotalSeatC > null) {
          this.mSettingInfo.mTotalSeatCount = tmTotalSeatC;
       }
       if (!TextUtils.x(this.mCurrentBizRoundDescJsonString)) {
          List list = LiveGzoneAccompanyJsonInfoItem.fromJsonString(this.mCurrentBizRoundDescJsonString);
          if (!q.f(list)) {
             String str = list.get(0).mContent;
             for (int i = 1; i < list.size(); i = i + 1) {
                str = str+"£ü"+list.get(i).mContent;
             }
             this.mCurrentBizRoundModel = str;
          }
       }
       return;
    }
}
