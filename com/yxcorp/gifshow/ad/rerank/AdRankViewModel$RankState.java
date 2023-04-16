package com.yxcorp.gifshow.ad.rerank.AdRankViewModel$RankState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AdRankViewModel$RankState extends Enum	// class@0017c6
{
    public static final AdRankViewModel$RankState[] $VALUES;
    public static final AdRankViewModel$RankState INSERTED;
    public static final AdRankViewModel$RankState NORMAL;
    public static final AdRankViewModel$RankState PENDING_INSERT;

    static {
       AdRankViewModel$RankState rankState;
       AdRankViewModel$RankState[] rankStateArr = new AdRankViewModel$RankState[]{rankState,rankState,rankState};
       rankState = new AdRankViewModel$RankState("NORMAL", 0);
       AdRankViewModel$RankState.NORMAL = rankState;
       rankState = new AdRankViewModel$RankState("PENDING_INSERT", 1);
       AdRankViewModel$RankState.PENDING_INSERT = rankState;
       rankState = new AdRankViewModel$RankState("INSERTED", 2);
       AdRankViewModel$RankState.INSERTED = rankState;
       AdRankViewModel$RankState.$VALUES = rankStateArr;
    }
    public void AdRankViewModel$RankState(String p0,int p1){
       super(p0, p1);
    }
    public static AdRankViewModel$RankState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AdRankViewModel$RankState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AdRankViewModel$RankState.class, p0);
    }
    public static AdRankViewModel$RankState[] values(){
       Object obj = PatchProxy.apply(null, null, AdRankViewModel$RankState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AdRankViewModel$RankState.$VALUES.clone();
    }
}
