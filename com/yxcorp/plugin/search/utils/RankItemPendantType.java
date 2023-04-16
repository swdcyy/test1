package com.yxcorp.plugin.search.utils.RankItemPendantType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RankItemPendantType extends Enum	// class@000784
{
    public final int mValue;
    public static final RankItemPendantType[] $VALUES;
    public static final RankItemPendantType DEFAULT;
    public static final RankItemPendantType LIVE;

    static {
       RankItemPendantType rankItemPend = new RankItemPendantType("DEFAULT", 0, 0);
       RankItemPendantType.DEFAULT = rankItemPend;
       RankItemPendantType rankItemPend1 = new RankItemPendantType("LIVE", 1, 1);
       RankItemPendantType.LIVE = rankItemPend1;
       RankItemPendantType[] rankItemPend2 = new RankItemPendantType[]{rankItemPend,rankItemPend1};
       RankItemPendantType.$VALUES = rankItemPend2;
    }
    public void RankItemPendantType(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static RankItemPendantType from(int p0){
       if (p0 != 1 && p0 != 2) {
          return RankItemPendantType.DEFAULT;
       }
       return RankItemPendantType.LIVE;
    }
    public static RankItemPendantType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RankItemPendantType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RankItemPendantType.class, p0);
    }
    public static RankItemPendantType[] values(){
       Object obj = PatchProxy.apply(null, null, RankItemPendantType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RankItemPendantType.$VALUES.clone();
    }
}
