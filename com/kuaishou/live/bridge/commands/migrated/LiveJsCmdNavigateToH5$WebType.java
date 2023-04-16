package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdNavigateToH5$WebType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveJsCmdNavigateToH5$WebType extends Enum	// class@000e12
{
    public final String type;
    public static final LiveJsCmdNavigateToH5$WebType[] $VALUES;
    public static final LiveJsCmdNavigateToH5$WebType INC_FANS;

    static {
       LiveJsCmdNavigateToH5$WebType webType;
       LiveJsCmdNavigateToH5$WebType[] webTypeArray = new LiveJsCmdNavigateToH5$WebType[]{webType};
       webType = new LiveJsCmdNavigateToH5$WebType("INC_FANS", 0, "inc_fans");
       LiveJsCmdNavigateToH5$WebType.INC_FANS = webType;
       LiveJsCmdNavigateToH5$WebType.$VALUES = webTypeArray;
    }
    public void LiveJsCmdNavigateToH5$WebType(String p0,int p1,String p2){
       super(p0, p1);
       this.type = p2;
    }
    public static LiveJsCmdNavigateToH5$WebType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveJsCmdNavigateToH5$WebType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveJsCmdNavigateToH5$WebType.class, p0);
    }
    public static LiveJsCmdNavigateToH5$WebType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveJsCmdNavigateToH5$WebType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveJsCmdNavigateToH5$WebType.$VALUES.clone();
    }
    public final String getType(){
       return this.type;
    }
}
