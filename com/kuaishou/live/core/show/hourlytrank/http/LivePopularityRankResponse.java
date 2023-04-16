package com.kuaishou.live.core.show.hourlytrank.http.LivePopularityRankResponse;
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

public class LivePopularityRankResponse implements Serializable	// class@000c1f
{
    public long mCurrentServerTime;
    public LiveHourlyRankInfo mPopularityRankInfo;
    public static final LivePopularityRankResponse EMPTY;
    public static final long serialVersionUID;

    static {
       LivePopularityRankResponse.EMPTY = new LivePopularityRankResponse();
    }
    public void LivePopularityRankResponse(){
       super();
    }
    public boolean isValid(){
       LivePopularityRankResponse obj = PatchProxy.apply(null, this, LivePopularityRankResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mPopularityRankInfo;
       boolean b = (obj != null && !TextUtils.isEmpty(obj.mHourlyRankName))? true: false;
       return b;
    }
}
