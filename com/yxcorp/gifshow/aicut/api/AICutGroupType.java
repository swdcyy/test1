package com.yxcorp.gifshow.aicut.api.AICutGroupType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AICutGroupType extends Enum	// class@001947
{
    public final int type;
    public static final AICutGroupType[] $VALUES;
    public static final AICutGroupType ANNUAL_ALBUM_2020;
    public static final AICutGroupType ANNUAL_ALBUM_2020_LOCAL;
    public static final AICutGroupType MULTI_TAB_AI_CUT_STYLE;
    public static final AICutGroupType SEASON_ALBUM;
    public static final AICutGroupType TIME_LINE_VIDEO;

    static {
       AICutGroupType uAICutGroupT1;
       AICutGroupType[] uAICutGroupT = new AICutGroupType[]{uAICutGroupT1,uAICutGroupT1,uAICutGroupT1,uAICutGroupT1,uAICutGroupT1};
       uAICutGroupT1 = new AICutGroupType("MULTI_TAB_AI_CUT_STYLE", 0, 1);
       AICutGroupType.MULTI_TAB_AI_CUT_STYLE = uAICutGroupT1;
       uAICutGroupT1 = new AICutGroupType("TIME_LINE_VIDEO", 1, 2);
       AICutGroupType.TIME_LINE_VIDEO = uAICutGroupT1;
       uAICutGroupT1 = new AICutGroupType("ANNUAL_ALBUM_2020_LOCAL", 2, 3);
       AICutGroupType.ANNUAL_ALBUM_2020_LOCAL = uAICutGroupT1;
       uAICutGroupT1 = new AICutGroupType("ANNUAL_ALBUM_2020", 3, 4);
       AICutGroupType.ANNUAL_ALBUM_2020 = uAICutGroupT1;
       uAICutGroupT1 = new AICutGroupType("SEASON_ALBUM", 4, 5);
       AICutGroupType.SEASON_ALBUM = uAICutGroupT1;
       AICutGroupType.$VALUES = uAICutGroupT;
    }
    public void AICutGroupType(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static AICutGroupType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AICutGroupType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AICutGroupType.class, p0);
    }
    public static AICutGroupType[] values(){
       Object obj = PatchProxy.apply(null, null, AICutGroupType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AICutGroupType.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
