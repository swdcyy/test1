package com.kuaishou.live.core.show.hourlytrank.http.LiveHourlyRankInfo;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveHourlyRankInfo implements Serializable, CursorResponse	// class@000c1c
{
    public boolean mEnableShowHighValueUser;
    public long mEndTime;
    public LiveHourlyRankBottomBannerInfo mHourlyRankBottomBannerInfo;
    public String mHourlyRankDescription;
    public String mHourlyRankName;
    public List mHourlyRankUserList;
    public String mPkInvitationAuthorityTips;
    public String mRankRuleUrl;
    public String mRegionCode;
    public static LiveHourlyRankInfo EMPTY;
    public static final long serialVersionUID;

    static {
       LiveHourlyRankInfo.EMPTY = new LiveHourlyRankInfo();
    }
    public void LiveHourlyRankInfo(){
       super();
       this.mHourlyRankName = "";
       this.mHourlyRankDescription = "";
       this.mHourlyRankUserList = new ArrayList();
    }
    public String getCursor(){
       return "";
    }
    public List getItems(){
       return this.mHourlyRankUserList;
    }
    public boolean hasMore(){
       return false;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveHourlyRankInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveHourlyRankInfo{mHourlyRankName=\'"+this.mHourlyRankName+'''+", mEndTime=\'"+this.mEndTime+'''+", mHourlyRankDescription="+this.mHourlyRankDescription+", mHourlyRankUserListSize"+this.mHourlyRankUserList.size()+'}';
    }
}
