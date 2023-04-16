package com.kuaishou.live.core.show.pk.model.LivePkConfig;
import java.io.Serializable;
import java.lang.Object;
import qd2.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCPkStart;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCPkStatistic;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hd2.l0;
import va1.l0;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;

public class LivePkConfig implements Serializable	// class@000d99
{
    public long mConnectTimeout;
    public boolean mDisableShowProfile;
    public a mDisableStyleConfig;
    public boolean mEnableFirstBloodHint;
    public int mEndInAdvanceLimitPerDay;
    public String mEndPkInAdvanceRule;
    public long mEstablishedTimeout;
    public long mMatchResultPollIntervalMillis;
    public long mMatchTimeout;
    public long mPkEndTimeout;
    public int mPkFormatNotifyCount;
    public long mPkGiftMomentEndTimestamp;
    public String mPkSpecification;
    public long mPkStartTimeMs;
    public long mPkVoteEndTimestamp;
    public long mPostPunishTimeout;
    public long mPrePunishTimeout;
    public long mPunishDurationMillis;
    public int mRecoAuthorCount;
    public long mRoundTimeoutMillis;
    public String mScoreRule;
    public List mScrollText;
    public static final long serialVersionUID = 0x5564350c355709ce;

    public void LivePkConfig(){
       super();
       this.mConnectTimeout = 0x7530;
       this.mMatchTimeout = 0x927c0;
       this.mEstablishedTimeout = 0x7530;
       this.mPostPunishTimeout = 0x3a98;
       this.mRoundTimeoutMillis = 0x3a98;
       this.mPkFormatNotifyCount = 0;
       this.mPkEndTimeout = 3000;
       this.mPrePunishTimeout = 3000;
       this.mPunishDurationMillis = 0x1d4c0;
    }
    public a getDisableStyleConfig(){
       return this.mDisableStyleConfig;
    }
    public long getPkEndDurationAfterGiftMoment(){
       return (this.mPkVoteEndTimestamp - this.mPkGiftMomentEndTimestamp);
    }
    public boolean isDisablePkStyle(){
       boolean b = (this.mDisableStyleConfig != null)? true: false;
       return b;
    }
    public void updatePkConfig(LiveStreamMessages$SCPkStart p0){
       this.mDisableShowProfile = p0.forbidPopCounterpartProfile;
    }
    public void updatePkConfig(LiveStreamMessages$SCPkStatistic p0){
       LiveStreamMessages$SCPkStatistic voteDeadline;
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkConfig.class, "1")) {
          return;
       }
       LiveStreamMessages$SCPkStatistic voteEndWaitD = p0.voteEndWaitDeadline;
       String str = null;
       if (voteEndWaitD - str) {
          voteDeadline = p0.voteDeadline;
          if (voteDeadline - str) {
             this.mPkEndTimeout = voteEndWaitD - voteDeadline;
          }
       }
       voteDeadline = p0.prePenaltyDeadline;
       if (voteDeadline - str && voteEndWaitD - str) {
          this.mPrePunishTimeout = voteDeadline - voteEndWaitD;
       }
       voteEndWaitD = p0.penaltyDeadline;
       if (voteEndWaitD - str && voteDeadline - str) {
          this.mPunishDurationMillis = voteEndWaitD - voteDeadline;
       }
       voteEndWaitD = p0.voteDeadline;
       if (voteEndWaitD - str) {
          this.mPkVoteEndTimestamp = voteEndWaitD;
       }
       this.mPkStartTimeMs = p0.startTime;
       Object obj = null;
       if (!PatchProxy.applyVoidOneRefs(p0, obj, l0.class, "9") && (p0.hideScore == null && p0.hideAudiencePkBangs != null)) {
          l0.n("hideScore下发错误，请联系闫亚辉!");
          b.d0(LiveLogTag.PK, "checkHideScore:字段下发错误", "statistic.hideScore", Boolean.valueOf(p0.hideScore), "statistic.hideAudiencePkBangs", Boolean.valueOf(p0.hideAudiencePkBangs));
       }
    label_0074 :
       this.mDisableStyleConfig = (p0.hideScore != null)? new a(p0.hideAudiencePkBangs): obj;
       this.mEnableFirstBloodHint = p0.enableFirstBloodHint;
       return;
    }
}
