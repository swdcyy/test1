package com.kuaishou.live.core.show.hourlytrank.http.LiveHourlyRankResponse;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.hourlytrank.http.LiveHourlyRankInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveHourlyRankResponse implements Serializable	// class@000c1d
{
    public LiveHourlyRankInfo mAppearanceRankInfo;
    public long mCurrentServerTime;
    public String mDisablePkInvitationDisplayInfo;
    public LiveHourlyRankInfo mDistrictRankInfo;
    public boolean mEnablePkInvite;
    public boolean mEnableSlideLive;
    public String mHourlyRankRuleUrl;
    public int mInvitationPrivilegeStatus;
    public LiveHourlyRankInfo mNationalRankInfo;
    public int mResult;
    public int mSlideLiveBatchCount;
    public static LiveHourlyRankResponse EMPTY;
    public static final long serialVersionUID;

    static {
       LiveHourlyRankResponse.EMPTY = new LiveHourlyRankResponse();
    }
    public void LiveHourlyRankResponse(){
       super();
       this.mHourlyRankRuleUrl = "";
       LiveHourlyRankInfo eMPTY = LiveHourlyRankInfo.EMPTY;
       this.mDistrictRankInfo = eMPTY;
       this.mNationalRankInfo = eMPTY;
       this.mAppearanceRankInfo = eMPTY;
    }
    public boolean enableBeInvited(){
       boolean b = true;
       if (this.mInvitationPrivilegeStatus == b) {
       }else {
          b = false;
       }
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveHourlyRankResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveHourlyRankResponse{mHourlyRankRuleUrl=\'"+this.mHourlyRankRuleUrl+'''+", mCurrentServerTime=\'"+this.mCurrentServerTime+'''+", mDistrictRankInfo="+this.mDistrictRankInfo+", mNationalRankInfo"+this.mNationalRankInfo+", enableBeInvited"+this.enableBeInvited()+", mEnablePkInvite"+this.mEnablePkInvite+", mDisablePkInvitationDisplayInfo"+this.mDisablePkInvitationDisplayInfo+'}';
    }
}
