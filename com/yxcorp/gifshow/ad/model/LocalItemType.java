package com.yxcorp.gifshow.ad.model.LocalItemType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LocalItemType extends Enum	// class@001788
{
    public final String key;
    public static final LocalItemType[] $VALUES;
    public static final LocalItemType AD_INFO;
    public static final LocalItemType AD_LOAD;
    public static final LocalItemType PLAYER_INFO;
    public static final LocalItemType TK_INFO;

    static {
       LocalItemType localItemTyp1;
       LocalItemType[] localItemTyp = new LocalItemType[]{localItemTyp1,localItemTyp1,localItemTyp1,localItemTyp1};
       localItemTyp1 = new LocalItemType("AD_LOAD", 0, "AdLoad");
       LocalItemType.AD_LOAD = localItemTyp1;
       localItemTyp1 = new LocalItemType("PLAYER_INFO", 1, "播放器类型");
       LocalItemType.PLAYER_INFO = localItemTyp1;
       localItemTyp1 = new LocalItemType("AD_INFO", 2, "AD信息");
       LocalItemType.AD_INFO = localItemTyp1;
       localItemTyp1 = new LocalItemType("TK_INFO", 3, "TK模板");
       LocalItemType.TK_INFO = localItemTyp1;
       LocalItemType.$VALUES = localItemTyp;
    }
    public void LocalItemType(String p0,int p1,String p2){
       super(p0, p1);
       this.key = p2;
    }
    public static LocalItemType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocalItemType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LocalItemType.class, p0);
    }
    public static LocalItemType[] values(){
       Object obj = PatchProxy.apply(null, null, LocalItemType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LocalItemType.$VALUES.clone();
    }
    public final String getKey(){
       return this.key;
    }
}
