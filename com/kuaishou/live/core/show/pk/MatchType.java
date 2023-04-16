package com.kuaishou.live.core.show.pk.MatchType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class MatchType extends Enum	// class@000d75
{
    public int typeValue;
    public static final MatchType[] $VALUES;
    public static final MatchType MATCH_TYPE_GAME;
    public static final MatchType MATCH_TYPE_HOURLY_RANK;
    public static final MatchType MATCH_TYPE_NEARBY;
    public static final MatchType MATCH_TYPE_PK_PANEL_INVITE;
    public static final MatchType MATCH_TYPE_PK_RANK_RANDOM_PK;
    public static final MatchType MATCH_TYPE_RANDOM;
    public static final MatchType MATCH_TYPE_TALENT;
    public static final MatchType MATCH_TYPE_UNKNOW;

    static {
       MatchType matchType = new MatchType("MATCH_TYPE_UNKNOW", 0, 0);
       MatchType.MATCH_TYPE_UNKNOW = matchType;
       MatchType matchType1 = new MatchType("MATCH_TYPE_RANDOM", 1, 1);
       MatchType.MATCH_TYPE_RANDOM = matchType1;
       MatchType matchType2 = new MatchType("MATCH_TYPE_NEARBY", 2, 2);
       MatchType.MATCH_TYPE_NEARBY = matchType2;
       MatchType matchType3 = new MatchType("MATCH_TYPE_TALENT", 3, 3);
       MatchType.MATCH_TYPE_TALENT = matchType3;
       MatchType matchType4 = new MatchType("MATCH_TYPE_PK_PANEL_INVITE", 4, 4);
       MatchType.MATCH_TYPE_PK_PANEL_INVITE = matchType4;
       MatchType matchType5 = new MatchType("MATCH_TYPE_GAME", 5, 5);
       MatchType.MATCH_TYPE_GAME = matchType5;
       MatchType matchType6 = new MatchType("MATCH_TYPE_HOURLY_RANK", 6, 6);
       MatchType.MATCH_TYPE_HOURLY_RANK = matchType6;
       MatchType matchType7 = new MatchType("MATCH_TYPE_PK_RANK_RANDOM_PK", 7, 8);
       MatchType.MATCH_TYPE_PK_RANK_RANDOM_PK = matchType7;
       MatchType[] matchTypeArr = new MatchType[]{matchType,matchType1,matchType2,matchType3,matchType4,matchType5,matchType6,matchType7};
       MatchType.$VALUES = matchTypeArr;
    }
    public void MatchType(String p0,int p1,int p2){
       super(p0, p1);
       this.typeValue = p2;
    }
    public static MatchType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MatchType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MatchType.class, p0);
    }
    public static MatchType[] values(){
       Object obj = PatchProxy.apply(null, null, MatchType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MatchType.$VALUES.clone();
    }
    public int getTypeValue(){
       return this.typeValue;
    }
    public boolean isInvitedType(){
       Object obj = PatchProxy.apply(null, this, MatchType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.equals(MatchType.MATCH_TYPE_PK_PANEL_INVITE) || this.equals(MatchType.MATCH_TYPE_HOURLY_RANK))? true: false;
       return b;
    }
}
