package com.kwai.live.gzone.hourlyrank.model.LiveGzoneHourlyRankResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;
import com.kwai.live.gzone.hourlyrank.model.LiveGzoneHourlyRankInfo;
import java.lang.String;

public class LiveGzoneHourlyRankResponse implements Serializable, b	// class@000d86
{
    public LiveGzoneHourlyRankInfo mHourlyRankInfo;
    public static final LiveGzoneHourlyRankResponse EMPTY;
    public static final long serialVersionUID;

    static {
       LiveGzoneHourlyRankResponse.EMPTY = new LiveGzoneHourlyRankResponse();
    }
    public void LiveGzoneHourlyRankResponse(){
       super();
    }
    public List getItems(){
       LiveGzoneHourlyRankResponse tmHourlyRank = this.mHourlyRankInfo;
       if (tmHourlyRank != null) {
          return tmHourlyRank.mRankUserInfoList;
       }
       return null;
    }
    public List getRankUserList(){
       LiveGzoneHourlyRankResponse tmHourlyRank = this.mHourlyRankInfo;
       if (tmHourlyRank != null) {
          return tmHourlyRank.mRankUserInfoList;
       }
       return null;
    }
    public String getRuleUrl(){
       LiveGzoneHourlyRankResponse tmHourlyRank = this.mHourlyRankInfo;
       if (tmHourlyRank != null) {
          return tmHourlyRank.mRuleUrl;
       }
       return null;
    }
    public boolean hasMore(){
       return false;
    }
    public boolean isValid(){
       LiveGzoneHourlyRankResponse tmHourlyRank = this.mHourlyRankInfo;
       boolean b = (tmHourlyRank != null && tmHourlyRank.mIsShow != null)? true: false;
       return b;
    }
}
