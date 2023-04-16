package com.kuaishou.live.core.show.hourlytrank.http.LiveHighValueHourlyRankResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveHighValueHourlyRankResponse implements Serializable	// class@000c19
{
    public long mCurrentServerTime;
    public LiveHourlyRankInfo mHourlyRankInfo;
    public static LiveHighValueHourlyRankResponse EMPTY;
    public static final long serialVersionUID;

    static {
       LiveHighValueHourlyRankResponse.EMPTY = new LiveHighValueHourlyRankResponse();
    }
    public void LiveHighValueHourlyRankResponse(){
       super();
    }
    public boolean isValid(){
       boolean b = (this.mHourlyRankInfo != null)? true: false;
       return b;
    }
}
