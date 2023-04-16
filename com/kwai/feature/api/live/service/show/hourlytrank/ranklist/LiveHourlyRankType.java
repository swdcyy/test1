package com.kwai.feature.api.live.service.show.hourlytrank.ranklist.LiveHourlyRankType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveHourlyRankType extends Enum	// class@001018
{
    public static final LiveHourlyRankType[] $VALUES;
    public static final LiveHourlyRankType APPEARANCE_RANK;
    public static final LiveHourlyRankType CITY_RANK;
    public static final LiveHourlyRankType DISTRICT_RANK;
    public static final LiveHourlyRankType GZONE_RANK;
    public static final LiveHourlyRankType HEADLINE_RANK;
    public static final LiveHourlyRankType HIGH_VALUE_RANK;
    public static final LiveHourlyRankType MERCHANT_RANK;
    public static final LiveHourlyRankType NATIONAL_RANK;
    public static final LiveHourlyRankType POPULARITY_RANK;
    public static final LiveHourlyRankType UNKNOWN;

    static {
       LiveHourlyRankType liveHourlyRa = new LiveHourlyRankType("DISTRICT_RANK", 0);
       LiveHourlyRankType.DISTRICT_RANK = liveHourlyRa;
       LiveHourlyRankType liveHourlyRa1 = new LiveHourlyRankType("NATIONAL_RANK", 1);
       LiveHourlyRankType.NATIONAL_RANK = liveHourlyRa1;
       LiveHourlyRankType liveHourlyRa2 = new LiveHourlyRankType("MERCHANT_RANK", 2);
       LiveHourlyRankType.MERCHANT_RANK = liveHourlyRa2;
       LiveHourlyRankType liveHourlyRa3 = new LiveHourlyRankType("APPEARANCE_RANK", 3);
       LiveHourlyRankType.APPEARANCE_RANK = liveHourlyRa3;
       LiveHourlyRankType liveHourlyRa4 = new LiveHourlyRankType("HEADLINE_RANK", 4);
       LiveHourlyRankType.HEADLINE_RANK = liveHourlyRa4;
       LiveHourlyRankType liveHourlyRa5 = new LiveHourlyRankType("GZONE_RANK", 5);
       LiveHourlyRankType.GZONE_RANK = liveHourlyRa5;
       LiveHourlyRankType liveHourlyRa6 = new LiveHourlyRankType("POPULARITY_RANK", 6);
       LiveHourlyRankType.POPULARITY_RANK = liveHourlyRa6;
       LiveHourlyRankType liveHourlyRa7 = new LiveHourlyRankType("HIGH_VALUE_RANK", 7);
       LiveHourlyRankType.HIGH_VALUE_RANK = liveHourlyRa7;
       LiveHourlyRankType liveHourlyRa8 = new LiveHourlyRankType("CITY_RANK", 8);
       LiveHourlyRankType.CITY_RANK = liveHourlyRa8;
       LiveHourlyRankType liveHourlyRa9 = new LiveHourlyRankType("UNKNOWN", 9);
       LiveHourlyRankType.UNKNOWN = liveHourlyRa9;
       LiveHourlyRankType[] liveHourlyRa10 = new LiveHourlyRankType[10];
       liveHourlyRa10[0] = liveHourlyRa;
       liveHourlyRa10[1] = liveHourlyRa1;
       liveHourlyRa10[2] = liveHourlyRa2;
       liveHourlyRa10[3] = liveHourlyRa3;
       liveHourlyRa10[4] = liveHourlyRa4;
       liveHourlyRa10[5] = liveHourlyRa5;
       liveHourlyRa10[6] = liveHourlyRa6;
       liveHourlyRa10[7] = liveHourlyRa7;
       liveHourlyRa10[8] = liveHourlyRa8;
       liveHourlyRa10[9] = liveHourlyRa9;
       LiveHourlyRankType.$VALUES = liveHourlyRa10;
    }
    public void LiveHourlyRankType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveHourlyRankType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveHourlyRankType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveHourlyRankType.class, p0);
    }
    public static LiveHourlyRankType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveHourlyRankType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveHourlyRankType.$VALUES.clone();
    }
}
