package com.kuaishou.android.model.feed.LiveFansGroupRelationInfoResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveFansGroupRelationInfoResponse implements Serializable	// class@000b08
{
    public boolean mCanLiteShowFansGroupEntry;
    public boolean mCanShowFansGroupInfo;
    public boolean mCanShowSuperFansGroupInfo;
    public int mFansGroupLevel;
    public int mFansGroupMedalType;
    public boolean mHasJoinSuperFansGroup;
    public boolean mIsDataValid;
    public int mStatus;
    public Map mUrlRequestBreakMsMap;
    public Map mUrlRequestDelayMsMap;
    public static final long serialVersionUID = 0x275e5f128ec12436;

    public void LiveFansGroupRelationInfoResponse(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveFansGroupRelationInfoResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveFansGroupRelationInfo{mCanShowFansGroupInfo="+this.mCanShowFansGroupInfo+", mCanShowSuperFansGroupInfo="+this.mCanShowSuperFansGroupInfo+", mHasJoinSuperFansGroup="+this.mHasJoinSuperFansGroup+", mStatus="+this.mStatus+", mFansGroupLevel="+this.mFansGroupLevel+", mFansGroupMedalType="+this.mFansGroupMedalType+", mUrlRequestDelayMsMap="+this.mUrlRequestDelayMsMap+", mUrlRequestBreakMsMap="+this.mUrlRequestBreakMsMap+'}';
    }
}
