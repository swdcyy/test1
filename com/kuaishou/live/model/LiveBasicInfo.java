package com.kuaishou.live.model.LiveBasicInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.model.LiveBasicInfo$LiveStreamPlayerInfo;
import com.kuaishou.live.model.LiveBasicInfo$LongConnectInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Collection;
import com.kuaishou.android.live.model.Race;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveBasicInfo implements Serializable	// class@000cef
{
    public String mLiveStreamId;
    public LiveBasicInfo$LiveStreamPlayerInfo mLiveStreamPlayerInfo;
    public LiveBasicInfo$LongConnectInfo mLongConnectInfo;
    public int mPatternType;
    public int mStreamType;
    public static final long serialVersionUID = 0x9dd111473e7923dc;

    public void LiveBasicInfo(){
       super();
       this.mStreamType = 1;
       this.mLiveStreamPlayerInfo = new LiveBasicInfo$LiveStreamPlayerInfo();
       this.mLongConnectInfo = new LiveBasicInfo$LongConnectInfo();
    }
    public void copyFrom(LiveBasicInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBasicInfo.class, "1")) {
          return;
       }
       this.mLiveStreamId = p0.mLiveStreamId;
       this.mStreamType = p0.mStreamType;
       this.mPatternType = p0.mPatternType;
       LiveBasicInfo mLiveStreamP = p0.mLiveStreamPlayerInfo;
       LiveBasicInfo$LiveStreamPlayerInfo mPlayUrls = mLiveStreamP.mPlayUrls;
       if (mPlayUrls != null && !mPlayUrls.isEmpty()) {
          this.mLiveStreamPlayerInfo.mPlayUrls.clear();
          this.mLiveStreamPlayerInfo.mPlayUrls.addAll(mLiveStreamP.mPlayUrls);
       }
       mPlayUrls = mLiveStreamP.mLiveAdaptiveManifests;
       if (mPlayUrls != null && !mPlayUrls.isEmpty()) {
          this.mLiveStreamPlayerInfo.mLiveAdaptiveManifests.clear();
          this.mLiveStreamPlayerInfo.mLiveAdaptiveManifests.addAll(mLiveStreamP.mLiveAdaptiveManifests);
       }
       mPlayUrls = mLiveStreamP.mWebRTCAdaptiveManifests;
       if (mPlayUrls != null && !mPlayUrls.isEmpty()) {
          this.mLiveStreamPlayerInfo.mWebRTCAdaptiveManifests.clear();
          this.mLiveStreamPlayerInfo.mWebRTCAdaptiveManifests.addAll(mLiveStreamP.mWebRTCAdaptiveManifests);
       }
       mPlayUrls = mLiveStreamP.mMultiResolutionPlayUrls;
       if (mPlayUrls != null && !mPlayUrls.isEmpty()) {
          this.mLiveStreamPlayerInfo.mMultiResolutionPlayUrls.clear();
          this.mLiveStreamPlayerInfo.mMultiResolutionPlayUrls.addAll(mLiveStreamP.mMultiResolutionPlayUrls);
       }
       LiveBasicInfo tmLiveStream = this.mLiveStreamPlayerInfo;
       tmLiveStream.mShouldUseHardwareDecoding = mLiveStreamP.mShouldUseHardwareDecoding;
       tmLiveStream.mClientId = mLiveStreamP.mClientId;
       mPlayUrls = mLiveStreamP.mLivePolicy;
       if (mPlayUrls != null && !mPlayUrls.isEmpty()) {
          this.mLiveStreamPlayerInfo.mLivePolicy.clear();
          this.mLiveStreamPlayerInfo.mLivePolicy.addAll(mLiveStreamP.mLivePolicy);
       }
       p0 = p0.mLongConnectInfo;
       mLiveStreamP = this.mLongConnectInfo;
       mLiveStreamP.mLocale = p0.mLocale;
       if (p0.mRace != null) {
          mLiveStreamP.mRace.mRounds.clear();
          LiveBasicInfo$LongConnectInfo mRace = this.mLongConnectInfo.mRace;
          LiveBasicInfo$LongConnectInfo mRace1 = p0.mRace;
          mRace.mStartTime = mRace1.mStartTime;
          mRace.mCost = mRace1.mCost;
          mRace.mSuccess = mRace1.mSuccess;
          mRace.mTag = mRace1.mTag;
          mRace.mRounds.addAll(mRace1.mRounds);
       }
       if (!TextUtils.x(p0.mAttach)) {
          this.mLongConnectInfo.mAttach = p0.mAttach;
       }
       if (!TextUtils.x(p0.mExpTag)) {
          this.mLongConnectInfo.mExpTag = p0.mExpTag;
       }
       this.mLongConnectInfo.mIsFirstEnterRoom = p0.mIsFirstEnterRoom;
       return;
    }
    public void setIsFirstEnterRoom(boolean p0){
       this.mLongConnectInfo.mIsFirstEnterRoom = p0;
    }
}
