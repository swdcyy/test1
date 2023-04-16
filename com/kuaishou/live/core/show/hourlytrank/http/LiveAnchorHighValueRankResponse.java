package com.kuaishou.live.core.show.hourlytrank.http.LiveAnchorHighValueRankResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.hourlytrank.http.LiveHourlyRankInfo;
import java.lang.CharSequence;
import android.text.TextUtils;

public class LiveAnchorHighValueRankResponse implements Serializable	// class@000c18
{
    public LiveHourlyRankInfo mCurrentHourRank;
    public LiveHourlyRankInfo mCurrentLiveRank;
    public String mDescription;
    public String mTitle;
    public static final long serialVersionUID = 0x624e32e6365ac8db;

    public void LiveAnchorHighValueRankResponse(){
       super();
    }
    public boolean isValid(){
       boolean b;
       LiveAnchorHighValueRankResponse obj = PatchProxy.apply(null, this, LiveAnchorHighValueRankResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mCurrentLiveRank;
       if (obj != null && !TextUtils.isEmpty(obj.mHourlyRankName)) {
          obj = this.mCurrentHourRank;
          if (obj != null && !TextUtils.isEmpty(obj.mHourlyRankName)) {
             b = true;
          label_002f :
             return b;
          }
       }
       b = false;
       goto label_002f ;
    }
}
