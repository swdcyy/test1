package com.yxcorp.plugin.search.utils.RankItemLogAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RankItemLogAction extends Enum	// class@000783
{
    public final String mValue;
    public static final RankItemLogAction[] $VALUES;
    public static final RankItemLogAction DEFAULT;
    public static final RankItemLogAction LIVE;

    static {
       RankItemLogAction rankItemLogA = new RankItemLogAction("DEFAULT", 0, "HOTLIST_CARD");
       RankItemLogAction.DEFAULT = rankItemLogA;
       RankItemLogAction rankItemLogA1 = new RankItemLogAction("LIVE", 1, "HOTLIST_LIVE_PENDANT_CARD");
       RankItemLogAction.LIVE = rankItemLogA1;
       RankItemLogAction[] rankItemLogA2 = new RankItemLogAction[]{rankItemLogA,rankItemLogA1};
       RankItemLogAction.$VALUES = rankItemLogA2;
    }
    public void RankItemLogAction(String p0,int p1,String p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static RankItemLogAction from(int p0){
       if (p0 != 1 && p0 != 2) {
          return RankItemLogAction.DEFAULT;
       }
       return RankItemLogAction.LIVE;
    }
    public static RankItemLogAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RankItemLogAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RankItemLogAction.class, p0);
    }
    public static RankItemLogAction[] values(){
       Object obj = PatchProxy.apply(null, null, RankItemLogAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RankItemLogAction.$VALUES.clone();
    }
}
